package typings.semanticUiRating

import typings.semanticUiRating.SemanticUI.Rating
import typings.semanticUiRating.SemanticUI.Rating.ClassNameSettings
import typings.semanticUiRating.SemanticUI.Rating.ErrorSettings
import typings.semanticUiRating.SemanticUI.Rating.SelectorSettings
import typings.semanticUiRating.SemanticUI.RatingSettings
import typings.semanticUiRating.semanticUiRatingStrings.`clear rating`
import typings.semanticUiRating.semanticUiRatingStrings.`get rating`
import typings.semanticUiRating.semanticUiRatingStrings.`set rating`
import typings.semanticUiRating.semanticUiRatingStrings.auto
import typings.semanticUiRating.semanticUiRatingStrings.className
import typings.semanticUiRating.semanticUiRatingStrings.clearable
import typings.semanticUiRating.semanticUiRatingStrings.debug
import typings.semanticUiRating.semanticUiRatingStrings.destroy
import typings.semanticUiRating.semanticUiRatingStrings.disable
import typings.semanticUiRating.semanticUiRatingStrings.enable
import typings.semanticUiRating.semanticUiRatingStrings.error
import typings.semanticUiRating.semanticUiRatingStrings.fireOnInit
import typings.semanticUiRating.semanticUiRatingStrings.initialRating
import typings.semanticUiRating.semanticUiRatingStrings.interactive
import typings.semanticUiRating.semanticUiRatingStrings.name
import typings.semanticUiRating.semanticUiRatingStrings.namespace
import typings.semanticUiRating.semanticUiRatingStrings.onRate
import typings.semanticUiRating.semanticUiRatingStrings.performance
import typings.semanticUiRating.semanticUiRatingStrings.selector
import typings.semanticUiRating.semanticUiRatingStrings.setting
import typings.semanticUiRating.semanticUiRatingStrings.silent
import typings.semanticUiRating.semanticUiRatingStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def rating(): JQuery
  def rating(behavior: setting, name: className, value: Unit): ClassNameSettings
  def rating(behavior: setting, name: className, value: ClassNameSettings): JQuery
  def rating(behavior: setting, name: clearable, value: Boolean): JQuery
  def rating(behavior: setting, name: clearable, value: Unit): auto | Boolean
  def rating(behavior: setting, name: clearable, value: auto): JQuery
  def rating(behavior: setting, name: debug, value: Boolean): JQuery
  def rating(behavior: setting, name: debug, value: Unit): Boolean
  def rating(behavior: setting, name: error, value: Unit): ErrorSettings
  def rating(behavior: setting, name: error, value: ErrorSettings): JQuery
  def rating(behavior: setting, name: fireOnInit, value: Boolean): JQuery
  def rating(behavior: setting, name: fireOnInit, value: Unit): Boolean
  def rating(behavior: setting, name: initialRating, value: Double): JQuery
  def rating(behavior: setting, name: initialRating, value: Unit): Double
  def rating(behavior: setting, name: interactive, value: Boolean): JQuery
  def rating(behavior: setting, name: interactive, value: Unit): Boolean
  def rating(behavior: setting, name: namespace, value: String): JQuery
  def rating(behavior: setting, name: namespace, value: Unit): String
  def rating(behavior: setting, name: name, value: String): JQuery
  def rating(behavior: setting, name: name, value: Unit): String
  def rating(
    behavior: setting,
    name: onRate,
    value: js.ThisFunction1[/* this */ JQuery, /* value */ Double, Unit]
  ): JQuery
  def rating(behavior: setting, name: onRate, value: Unit): js.ThisFunction1[/* this */ JQuery, /* value */ Double, Unit]
  def rating(behavior: setting, name: performance, value: Boolean): JQuery
  def rating(behavior: setting, name: performance, value: Unit): Boolean
  def rating(behavior: setting, name: selector, value: Unit): SelectorSettings
  def rating(behavior: setting, name: selector, value: SelectorSettings): JQuery
  def rating(behavior: setting, name: silent, value: Boolean): JQuery
  def rating(behavior: setting, name: silent, value: Unit): Boolean
  def rating(behavior: setting, name: verbose, value: Boolean): JQuery
  def rating(behavior: setting, name: verbose, value: Unit): Boolean
  def rating(settings: RatingSettings): JQuery
  @JSName("rating")
  var rating_Original: Rating
  /**
    * Clears current rating
    */
  @JSName("rating")
  def rating_clearrating(behavior: `clear rating`): JQuery
  @JSName("rating")
  def rating_destroy(behavior: destroy): JQuery
  /**
    * Disables interactive rating mode
    */
  @JSName("rating")
  def rating_disable(behavior: disable): JQuery
  /**
    * Enables interactive rating mode
    */
  @JSName("rating")
  def rating_enable(behavior: enable): JQuery
  /**
    * Gets current rating
    */
  @JSName("rating")
  def rating_getrating(behavior: `get rating`): Double
  /**
    * Sets rating programmatically
    */
  @JSName("rating")
  def rating_setrating(behavior: `set rating`, rating: Double): JQuery
  @JSName("rating")
  def rating_setting(behavior: setting, value: RatingSettings): JQuery
}
object JQuery {
  
  @scala.inline
  def apply(rating: Rating): JQuery = {
    val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit class JQueryMutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRating(value: Rating): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
  }
}
