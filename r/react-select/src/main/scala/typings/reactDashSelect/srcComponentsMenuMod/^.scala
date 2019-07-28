package typings.reactDashSelect.srcComponentsMenuMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/components/Menu", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val LoadingMessage: ComponentType[NoticeProps[js.Any]] = js.native
  val MenuList: ComponentType[MenuListComponentProps[js.Any]] = js.native
  val NoOptionsMessage: ComponentType[NoticeProps[js.Any]] = js.native
  def getMenuPlacement(args: PlacementArgs): MenuState = js.native
  def loadingMessageCSS(): CSSProperties = js.native
  def menuCSS(state: MenuState): CSSProperties = js.native
  def menuListCSS(state: MenuState): CSSProperties = js.native
  def menuPortalCSS(args: PortalStyleArgs): CSSProperties = js.native
  def noOptionsMessageCSS(): CSSProperties = js.native
}

