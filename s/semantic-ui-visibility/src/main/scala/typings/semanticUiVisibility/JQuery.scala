package typings.semanticUiVisibility

import typings.semanticUiVisibility.SemanticUI.Visibility
import typings.semanticUiVisibility.SemanticUI.Visibility.ElementCalculations
import typings.semanticUiVisibility.SemanticUI.Visibility.ScreenCalculations
import typings.semanticUiVisibility.SemanticUI.Visibility.ScreenSize
import typings.semanticUiVisibility.SemanticUI.VisibilitySettings
import typings.semanticUiVisibility.semanticUiVisibilityStrings.`disable callbacks`
import typings.semanticUiVisibility.semanticUiVisibilityStrings.`enable callbacks`
import typings.semanticUiVisibility.semanticUiVisibilityStrings.`get element calculations`
import typings.semanticUiVisibility.semanticUiVisibilityStrings.`get pixels passed`
import typings.semanticUiVisibility.semanticUiVisibilityStrings.`get screen calculations`
import typings.semanticUiVisibility.semanticUiVisibilityStrings.`get screen size`
import typings.semanticUiVisibility.semanticUiVisibilityStrings.`is off screen`
import typings.semanticUiVisibility.semanticUiVisibilityStrings.`is on screen`
import typings.semanticUiVisibility.semanticUiVisibilityStrings.destroy
import typings.semanticUiVisibility.semanticUiVisibilityStrings.setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("visibility")
  var visibility_Original: Visibility = js.native
  def visibility(): JQuery = js.native
  def visibility(settings: VisibilitySettings): JQuery = js.native
  @JSName("visibility")
  def visibility_destroy(behavior: destroy): JQuery = js.native
  /**
    * Disable callbacks temporarily. This is useful if you need to adjust scroll position and do not want to trigger callbacks during the position change.
    */
  @JSName("visibility")
  def visibility_disablecallbacks(behavior: `disable callbacks`): JQuery = js.native
  /**
    * Re-enable callbacks
    */
  @JSName("visibility")
  def visibility_enablecallbacks(behavior: `enable callbacks`): JQuery = js.native
  /**
    * Returns element calculations as object
    */
  @JSName("visibility")
  def visibility_getelementcalculations(behavior: `get element calculations`): ElementCalculations = js.native
  /**
    * Returns number of pixels passed in current element from top of element
    */
  @JSName("visibility")
  def visibility_getpixelspassed(behavior: `get pixels passed`): Double = js.native
  /**
    * Returns screen calculations as object
    */
  @JSName("visibility")
  def visibility_getscreencalculations(behavior: `get screen calculations`): ScreenCalculations = js.native
  /**
    * Returns screen size as object
    */
  @JSName("visibility")
  def visibility_getscreensize(behavior: `get screen size`): ScreenSize = js.native
  /**
    * Returns whether element is off screen
    */
  @JSName("visibility")
  def visibility_isoffscreen(behavior: `is off screen`): Boolean = js.native
  /**
    * Returns whether element is on screen
    */
  @JSName("visibility")
  def visibility_isonscreen(behavior: `is on screen`): Boolean = js.native
  @JSName("visibility")
  def visibility_setting(behavior: setting, value: VisibilitySettings): JQuery = js.native
  @JSName("visibility")
  def visibility_setting[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl[K] */ js.Any = js.native
  @JSName("visibility")
  def visibility_setting[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

