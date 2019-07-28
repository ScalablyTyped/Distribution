package typings.reactDashLeaflet.reactDashLeafletMod

import typings.react.reactMod.Component
import typings.reactDashLeaflet.Anon_ClassName
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "Pane")
@js.native
class Pane[P /* <: PaneProps */, S /* <: PaneState */] ()
  extends Component[P, S, js.Any] {
  def createPane(props: P): Unit = js.native
  def getPane(): js.UndefOr[HTMLElement | Null] = js.native
  def getPane(name: String): js.UndefOr[HTMLElement | Null] = js.native
  def getParentPane(): js.UndefOr[HTMLElement | Null] = js.native
  def removePane(): Unit = js.native
  def setStyle(arg: Anon_ClassName): Unit = js.native
}

