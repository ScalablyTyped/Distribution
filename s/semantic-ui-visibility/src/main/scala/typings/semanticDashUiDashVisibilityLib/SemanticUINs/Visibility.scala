package typings
package semanticDashUiDashVisibilityLib.SemanticUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Visibility extends js.Object {
  var settings: VisibilitySettings = js.native
  def apply(): semanticDashUiDashVisibilityLib.JQuery = js.native
  /**
    * Disable callbacks temporarily. This is useful if you need to adjust scroll position and do not want to trigger callbacks during the position change.
    */
  def apply(
    behavior: semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibStrings.`disable callbacks`
  ): semanticDashUiDashVisibilityLib.JQuery = js.native
  /**
    * Re-enable callbacks
    */
  def apply(
    behavior: semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibStrings.`enable callbacks`
  ): semanticDashUiDashVisibilityLib.JQuery = js.native
  /**
    * Returns element calculations as object
    */
  def apply(
    behavior: semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibStrings.`get element calculations`
  ): semanticDashUiDashVisibilityLib.SemanticUINs.VisibilityNs.ElementCalculations = js.native
  /**
    * Returns number of pixels passed in current element from top of element
    */
  def apply(
    behavior: semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibStrings.`get pixels passed`
  ): scala.Double = js.native
  /**
    * Returns screen calculations as object
    */
  def apply(
    behavior: semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibStrings.`get screen calculations`
  ): semanticDashUiDashVisibilityLib.SemanticUINs.VisibilityNs.ScreenCalculations = js.native
  /**
    * Returns screen size as object
    */
  def apply(behavior: semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibStrings.`get screen size`): semanticDashUiDashVisibilityLib.SemanticUINs.VisibilityNs.ScreenSize = js.native
  /**
    * Returns whether element is off screen
    */
  def apply(behavior: semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibStrings.`is off screen`): scala.Boolean = js.native
  /**
    * Returns whether element is on screen
    */
  def apply(behavior: semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibStrings.`is on screen`): scala.Boolean = js.native
  def apply(behavior: semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibStrings.destroy): semanticDashUiDashVisibilityLib.JQuery = js.native
  def apply(
    behavior: semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibStrings.setting,
    value: VisibilitySettings
  ): semanticDashUiDashVisibilityLib.JQuery = js.native
  def apply(settings: VisibilitySettings): semanticDashUiDashVisibilityLib.JQuery = js.native
  def apply[K /* <: java.lang.String */](behavior: semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibStrings.setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: java.lang.String */](
    behavior: semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibStrings.setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl[K] */ js.Any
  ): semanticDashUiDashVisibilityLib.JQuery = js.native
}

