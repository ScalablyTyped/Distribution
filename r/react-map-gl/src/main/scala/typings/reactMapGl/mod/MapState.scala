package typings.reactMapGl.mod

import typings.reactMapGl.anon.DeltaScaleX
import typings.reactMapGl.anon.PositionInputscalenumbers
import typings.reactMapGl.anon.PositionInputstartPosnumb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-map-gl", "MapState")
@js.native
class MapState protected () extends js.Object {
  def this(props: MapStateProps) = this()
  def getInteractiveState(): InteractiveState = js.native
  def getViewportProps(): ViewportProps = js.native
  def pan(input: PositionInputstartPosnumb): MapState = js.native
  def panEnd(): MapState = js.native
  def panStart(input: PositionInput): MapState = js.native
  def rotate(input: DeltaScaleX): MapState = js.native
  def rotateEnd(): MapState = js.native
  def rotateStart(input: PositionInput): MapState = js.native
  def zoom(input: PositionInputscalenumbers): MapState = js.native
  def zoomEnd(): MapState = js.native
  def zoomStart(input: PositionInput): MapState = js.native
}

