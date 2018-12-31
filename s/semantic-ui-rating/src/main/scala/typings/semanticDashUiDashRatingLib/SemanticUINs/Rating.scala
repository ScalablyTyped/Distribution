package typings
package semanticDashUiDashRatingLib.SemanticUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rating extends js.Object {
  var settings: RatingSettings = js.native
  def apply(): semanticDashUiDashRatingLib.JQuery = js.native
  /**
    * Clears current rating
    */
  def apply(behavior: semanticDashUiDashRatingLib.semanticDashUiDashRatingLibStrings.`clear rating`): semanticDashUiDashRatingLib.JQuery = js.native
  /**
    * Gets current rating
    */
  def apply(behavior: semanticDashUiDashRatingLib.semanticDashUiDashRatingLibStrings.`get rating`): scala.Double = js.native
  /**
    * Sets rating programmatically
    */
  def apply(
    behavior: semanticDashUiDashRatingLib.semanticDashUiDashRatingLibStrings.`set rating`,
    rating: scala.Double
  ): semanticDashUiDashRatingLib.JQuery = js.native
  def apply(behavior: semanticDashUiDashRatingLib.semanticDashUiDashRatingLibStrings.destroy): semanticDashUiDashRatingLib.JQuery = js.native
  /**
    * Disables interactive rating mode
    */
  def apply(behavior: semanticDashUiDashRatingLib.semanticDashUiDashRatingLibStrings.disable): semanticDashUiDashRatingLib.JQuery = js.native
  /**
    * Enables interactive rating mode
    */
  def apply(behavior: semanticDashUiDashRatingLib.semanticDashUiDashRatingLibStrings.enable): semanticDashUiDashRatingLib.JQuery = js.native
  def apply(
    behavior: semanticDashUiDashRatingLib.semanticDashUiDashRatingLibStrings.setting,
    value: RatingSettings
  ): semanticDashUiDashRatingLib.JQuery = js.native
  def apply(settings: RatingSettings): semanticDashUiDashRatingLib.JQuery = js.native
  def apply[K /* <: java.lang.String */](behavior: semanticDashUiDashRatingLib.semanticDashUiDashRatingLibStrings.setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-rating.SemanticUI.RatingSettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: java.lang.String */](
    behavior: semanticDashUiDashRatingLib.semanticDashUiDashRatingLibStrings.setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-rating.SemanticUI.RatingSettings._Impl[K] */ js.Any
  ): semanticDashUiDashRatingLib.JQuery = js.native
}

