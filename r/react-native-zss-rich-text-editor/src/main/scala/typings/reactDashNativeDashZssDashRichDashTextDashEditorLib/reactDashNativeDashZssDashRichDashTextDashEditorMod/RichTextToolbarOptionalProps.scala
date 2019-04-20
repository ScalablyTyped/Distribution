package typings
package reactDashNativeDashZssDashRichDashTextDashEditorLib.reactDashNativeDashZssDashRichDashTextDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RichTextToolbarOptionalProps extends js.Object {
  // An array of actions to be provided by this toolbar.
  var actions: js.Array[ACTIONS] = js.native
  var iconMap: IconsMap = js.native
  var iconTint: java.lang.String = js.native
  @JSName("onPressAddImage")
  var onPressAddImage_Original: FunctionWithZeroArgs = js.native
  // Functions called when the addLink or addImage actions are tapped.
  @JSName("onPressAddLink")
  var onPressAddLink_Original: FunctionWithZeroArgs = js.native
  var selectedButtonStyle: ElementStyles = js.native
  var selectedIconTint: java.lang.String = js.native
  var unselectedButtonStyle: ElementStyles = js.native
  def onPressAddImage(): scala.Unit = js.native
  // Functions called when the addLink or addImage actions are tapped.
  def onPressAddLink(): scala.Unit = js.native
  def renderAction(): reactLib.reactMod.ReactNode = js.native
}

