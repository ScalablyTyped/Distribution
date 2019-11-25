package typings.semanticDashUiDashVisibility

import typings.semanticDashUiDashVisibility.SemanticUI.Visibility
import typings.semanticDashUiDashVisibility.SemanticUI.Visibility.ElementCalculations
import typings.semanticDashUiDashVisibility.SemanticUI.Visibility.ScreenCalculations
import typings.semanticDashUiDashVisibility.SemanticUI.Visibility.ScreenSize
import typings.semanticDashUiDashVisibility.SemanticUI.VisibilitySettings
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

