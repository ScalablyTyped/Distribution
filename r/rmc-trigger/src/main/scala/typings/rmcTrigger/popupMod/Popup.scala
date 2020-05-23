package typings.rmcTrigger.popupMod

import typings.react.mod.Component
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Popup
  extends Component[IPopupProps, js.Any, js.Any] {
  var currentAlignClassName: String | Null = js.native
  var popupInstance: js.Any = js.native
  var rootNode: js.Any = js.native
  var saveAlignRef: js.Any = js.native
  var savePopupRef: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MPopup(): Unit = js.native
  def getClassName(currentAlignClassName: js.Any): String = js.native
  def getMaskElement(): js.Any = js.native
  def getMaskTransitionName(): js.UndefOr[String | js.Object] = js.native
  def getPopupDomNode(): Element = js.native
  def getPopupElement(): typings.react.mod.global.JSX.Element = js.native
  def getTarget(): js.Any = js.native
  def getTransitionName(): js.UndefOr[String | js.Object] = js.native
  def getZIndexStyle(): js.Any = js.native
  def onAlign(popupDomNode: js.Any, align: js.Any): Unit = js.native
}

