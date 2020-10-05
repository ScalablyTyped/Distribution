package typings.rcTrigger.popupMod

import typings.rcTrigger.anon.LeavedClassName
import typings.rcTrigger.anon.PartialPopupState
import typings.rcTrigger.interfaceMod.AlignType
import typings.rcTrigger.interfaceMod.Point
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Popup
  extends Component[PopupProps, PopupState, js.Any] {
  var alignRef: RefObject[AlignRefType] = js.native
  var nextFrameId: js.Any = js.native
  var nextFrameState: js.Any = js.native
  var popupRef: RefObject[HTMLDivElement] = js.native
  def cancelFrameState(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MPopup(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MPopup(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MPopup(): Unit = js.native
  def getAlignTarget(): Point | js.Function0[HTMLElement] = js.native
  def getMotion(): LeavedClassName = js.native
  def getZIndexStyle(): CSSProperties = js.native
  def onAlign(popupDomNode: HTMLElement, align: AlignType): Unit = js.native
  def onMotionEnd(): Unit = js.native
  def renderMaskElement(): Element = js.native
  def renderPopupElement(): Element = js.native
  def setStateOnNextFrame(state: PartialPopupState): Unit = js.native
}

