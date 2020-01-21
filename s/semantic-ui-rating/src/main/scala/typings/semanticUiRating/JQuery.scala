package typings.semanticUiRating

import typings.semanticUiRating.SemanticUI.Rating
import typings.semanticUiRating.SemanticUI.RatingSettings
import typings.semanticUiRating.semanticUiRatingStrings.`clear rating`
import typings.semanticUiRating.semanticUiRatingStrings.`get rating`
import typings.semanticUiRating.semanticUiRatingStrings.`set rating`
import typings.semanticUiRating.semanticUiRatingStrings.destroy
import typings.semanticUiRating.semanticUiRatingStrings.disable
import typings.semanticUiRating.semanticUiRatingStrings.enable
import typings.semanticUiRating.semanticUiRatingStrings.setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("rating")
  var rating_Original: Rating = js.native
  def rating(): JQuery = js.native
  def rating(settings: RatingSettings): JQuery = js.native
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
  @JSName("rating")
  def rating_setting[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-rating.SemanticUI.RatingSettings._Impl[K] */ js.Any = js.native
  @JSName("rating")
  def rating_setting[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-rating.SemanticUI.RatingSettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

