package typings
package semanticDashUiDashRatingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("rating")
  var rating_Original: semanticDashUiDashRatingLib.SemanticUINs.Rating = js.native
  def rating(): JQuery = js.native
  def rating(settings: semanticDashUiDashRatingLib.SemanticUINs.RatingSettings): JQuery = js.native
  /**
    * Clears current rating
    */
  @JSName("rating")
  def rating_clearrating(behavior: semanticDashUiDashRatingLib.semanticDashUiDashRatingLibStrings.`clear rating`): JQuery = js.native
  @JSName("rating")
  def rating_destroy(behavior: semanticDashUiDashRatingLib.semanticDashUiDashRatingLibStrings.destroy): JQuery = js.native
  /**
    * Disables interactive rating mode
    */
  @JSName("rating")
  def rating_disable(behavior: semanticDashUiDashRatingLib.semanticDashUiDashRatingLibStrings.disable): JQuery = js.native
  /**
    * Enables interactive rating mode
    */
  @JSName("rating")
  def rating_enable(behavior: semanticDashUiDashRatingLib.semanticDashUiDashRatingLibStrings.enable): JQuery = js.native
  /**
    * Gets current rating
    */
  @JSName("rating")
  def rating_getrating(behavior: semanticDashUiDashRatingLib.semanticDashUiDashRatingLibStrings.`get rating`): scala.Double = js.native
  /**
    * Sets rating programmatically
    */
  @JSName("rating")
  def rating_setrating(
    behavior: semanticDashUiDashRatingLib.semanticDashUiDashRatingLibStrings.`set rating`,
    rating: scala.Double
  ): JQuery = js.native
  @JSName("rating")
  def rating_setting(
    behavior: semanticDashUiDashRatingLib.semanticDashUiDashRatingLibStrings.setting,
    value: semanticDashUiDashRatingLib.SemanticUINs.RatingSettings
  ): JQuery = js.native
  @JSName("rating")
  def rating_setting[K /* <: java.lang.String */](behavior: semanticDashUiDashRatingLib.semanticDashUiDashRatingLibStrings.setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-rating.SemanticUI.RatingSettings._Impl[K] */ js.Any = js.native
  @JSName("rating")
  def rating_setting[K /* <: java.lang.String */](
    behavior: semanticDashUiDashRatingLib.semanticDashUiDashRatingLibStrings.setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-rating.SemanticUI.RatingSettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

