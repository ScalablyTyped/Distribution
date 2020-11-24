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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  def rating(): JQuery = js.native
  def rating(behavior: setting, name: className, value: js.UndefOr[scala.Nothing]): ClassNameSettings = js.native
  def rating(behavior: setting, name: clearable, value: js.UndefOr[scala.Nothing]): auto | Boolean = js.native
  def rating(behavior: setting, name: clearable, value: Boolean): JQuery = js.native
  def rating(behavior: setting, name: clearable, value: auto): JQuery = js.native
  def rating(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def rating(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def rating(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
  def rating(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def rating(behavior: setting, name: fireOnInit, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def rating(behavior: setting, name: fireOnInit, value: Boolean): JQuery = js.native
  def rating(behavior: setting, name: initialRating, value: js.UndefOr[scala.Nothing]): Double = js.native
  def rating(behavior: setting, name: initialRating, value: Double): JQuery = js.native
  def rating(behavior: setting, name: interactive, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def rating(behavior: setting, name: interactive, value: Boolean): JQuery = js.native
  def rating(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def rating(behavior: setting, name: namespace, value: String): JQuery = js.native
  def rating(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def rating(behavior: setting, name: name, value: String): JQuery = js.native
  def rating(behavior: setting, name: onRate, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* value */ Double, Unit] = js.native
  def rating(
    behavior: setting,
    name: onRate,
    value: js.ThisFunction1[/* this */ JQuery, /* value */ Double, Unit]
  ): JQuery = js.native
  def rating(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def rating(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def rating(behavior: setting, name: selector, value: js.UndefOr[scala.Nothing]): SelectorSettings = js.native
  def rating(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def rating(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def rating(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def rating(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def rating(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def rating(settings: RatingSettings): JQuery = js.native
  @JSName("rating")
  def rating_JQuery(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  @JSName("rating")
  var rating_Original: Rating = js.native
  /**
    * Clears current rating
    */
  @JSName("rating")
  def rating_clearrating(behavior: `clear rating`): JQuery = js.native
  @JSName("rating")
  def rating_destroy(behavior: destroy): JQuery = js.native
  /**
    * Disables interactive rating mode
    */
  @JSName("rating")
  def rating_disable(behavior: disable): JQuery = js.native
  /**
    * Enables interactive rating mode
    */
  @JSName("rating")
  def rating_enable(behavior: enable): JQuery = js.native
  /**
    * Gets current rating
    */
  @JSName("rating")
  def rating_getrating(behavior: `get rating`): Double = js.native
  /**
    * Sets rating programmatically
    */
  @JSName("rating")
  def rating_setrating(behavior: `set rating`, rating: Double): JQuery = js.native
  @JSName("rating")
  def rating_setting(behavior: setting, value: RatingSettings): JQuery = js.native
}
