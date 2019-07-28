package typings.reactDashMapDashGl.reactDashMapDashGlMod

import typings.reactDashMapDashGl.Anon_DeltaScaleX
import typings.reactDashMapDashGl.Anon_Scale
import typings.reactDashMapDashGl.Anon_StartPos
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-map-gl", "MapState")
@js.native
class MapState protected () extends js.Object {
  def this(props: MapStateProps) = this()
  def getInteractiveState(): InteractiveState = js.native
  def getViewportProps(): ViewportProps = js.native
  def pan(input: PositionInput with Anon_StartPos): MapState = js.native
  def panEnd(): MapState = js.native
  def panStart(input: PositionInput): MapState = js.native
  def rotate(input: Anon_DeltaScaleX): MapState = js.native
  def rotateEnd(): MapState = js.native
  def rotateStart(input: PositionInput): MapState = js.native
  def zoom(input: PositionInput with Anon_Scale): MapState = js.native
  def zoomEnd(): MapState = js.native
  def zoomStart(input: PositionInput): MapState = js.native
}

