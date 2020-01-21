package typings.semanticUiRating.SemanticUI

import typings.semanticUiRating.JQuery
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
trait Rating_ extends js.Object {
  var settings: RatingSettings = js.native
  def apply(): JQuery = js.native
  /**
    * Clears current rating
    */
  def apply(behavior: `clear rating`): JQuery = js.native
  /**
    * Gets current rating
    */
  def apply(behavior: `get rating`): Double = js.native
  /**
    * Sets rating programmatically
    */
  def apply(behavior: `set rating`, rating: Double): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Disables interactive rating mode
    */
  def apply(behavior: disable): JQuery = js.native
  /**
    * Enables interactive rating mode
    */
  def apply(behavior: enable): JQuery = js.native
  def apply(behavior: setting, value: RatingSettings): JQuery = js.native
  def apply(settings: RatingSettings): JQuery = js.native
  def apply[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-rating.SemanticUI.RatingSettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-rating.SemanticUI.RatingSettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

