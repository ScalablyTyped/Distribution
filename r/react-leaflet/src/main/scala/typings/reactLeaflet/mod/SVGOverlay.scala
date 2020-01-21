package typings.reactLeaflet.mod

import typings.leaflet.mod.SVGOverlay_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "SVGOverlay")
@js.native
class SVGOverlay[P /* <: SVGOverlayProps */, E /* <: SVGOverlay_ */] () extends MapComponent[P, E] {
  def createLeafletElement(props: P): E = js.native
  def updateLeafletElement(fromProps: P, toProps: P): Unit = js.native
}

