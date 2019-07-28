package typings.semanticDashUiDashRating

import typings.semanticDashUiDashRating.SemanticUINs.Rating
import typings.semanticDashUiDashRating.SemanticUINs.RatingSettings
import typings.semanticDashUiDashRating.semanticDashUiDashRatingStrings.`clear rating`
import typings.semanticDashUiDashRating.semanticDashUiDashRatingStrings.`get rating`
import typings.semanticDashUiDashRating.semanticDashUiDashRatingStrings.`set rating`
import typings.semanticDashUiDashRating.semanticDashUiDashRatingStrings.destroy
import typings.semanticDashUiDashRating.semanticDashUiDashRatingStrings.disable
import typings.semanticDashUiDashRating.semanticDashUiDashRatingStrings.enable
import typings.semanticDashUiDashRating.semanticDashUiDashRatingStrings.setting
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
  def rating_setting[K /* <: String */](behavior: setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-rating.SemanticUI.RatingSettings._Impl[K] */ js.Any = js.native
  @JSName("rating")
  def rating_setting[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-rating.SemanticUI.RatingSettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

