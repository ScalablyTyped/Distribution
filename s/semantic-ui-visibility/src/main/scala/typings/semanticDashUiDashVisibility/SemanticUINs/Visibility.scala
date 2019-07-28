package typings.semanticDashUiDashVisibility.SemanticUINs

import typings.semanticDashUiDashVisibility.JQuery
import typings.semanticDashUiDashVisibility.SemanticUINs.VisibilityNs.ElementCalculations
import typings.semanticDashUiDashVisibility.SemanticUINs.VisibilityNs.ScreenCalculations
import typings.semanticDashUiDashVisibility.SemanticUINs.VisibilityNs.ScreenSize
import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.`disable callbacks`
import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.`enable callbacks`
import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.`get element calculations`
import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.`get pixels passed`
import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.`get screen calculations`
import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.`get screen size`
import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.`is off screen`
import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.`is on screen`
import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.destroy
import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Visibility extends js.Object {
  var settings: VisibilitySettings = js.native
  def apply(): JQuery = js.native
  /**
    * Disable callbacks temporarily. This is useful if you need to adjust scroll position and do not want to trigger callbacks during the position change.
    */
  def apply(behavior: `disable callbacks`): JQuery = js.native
  /**
    * Re-enable callbacks
    */
  def apply(behavior: `enable callbacks`): JQuery = js.native
  /**
    * Returns element calculations as object
    */
  def apply(behavior: `get element calculations`): ElementCalculations = js.native
  /**
    * Returns number of pixels passed in current element from top of element
    */
  def apply(behavior: `get pixels passed`): Double = js.native
  /**
    * Returns screen calculations as object
    */
  def apply(behavior: `get screen calculations`): ScreenCalculations = js.native
  /**
    * Returns screen size as object
    */
  def apply(behavior: `get screen size`): ScreenSize = js.native
  /**
    * Returns whether element is off screen
    */
  def apply(behavior: `is off screen`): Boolean = js.native
  /**
    * Returns whether element is on screen
    */
  def apply(behavior: `is on screen`): Boolean = js.native
  def apply(behavior: destroy): JQuery = js.native
  def apply(behavior: setting, value: VisibilitySettings): JQuery = js.native
  def apply(settings: VisibilitySettings): JQuery = js.native
  def apply[K /* <: String */](behavior: setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

