package typings.reactMapGl.mod

import typings.reactMapGl.AnonDeltaScaleX
import typings.reactMapGl.AnonScale
import typings.reactMapGl.AnonStartPos
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-map-gl", "MapState")
@js.native
class MapState protected () extends js.Object {
  def this(props: MapStateProps) = this()
  def getInteractiveState(): InteractiveState = js.native
  def getViewportProps(): ViewportProps = js.native
  def pan(input: PositionInput with AnonStartPos): MapState = js.native
  def panEnd(): MapState = js.native
  def panStart(input: PositionInput): MapState = js.native
  def rotate(input: AnonDeltaScaleX): MapState = js.native
  def rotateEnd(): MapState = js.native
  def rotateStart(input: PositionInput): MapState = js.native
  def zoom(input: PositionInput with AnonScale): MapState = js.native
  def zoomEnd(): MapState = js.native
  def zoomStart(input: PositionInput): MapState = js.native
}

