package typings
package reactDashNativeDashMapsLib.reactDashNativeDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapView
  extends reactLib.reactMod.Component[MapViewProps, js.Any, js.Any] {
  def animateCamera(camera: stdLib.Partial[Camera]): scala.Unit = js.native
  def animateCamera(camera: stdLib.Partial[Camera], opts: reactDashNativeDashMapsLib.Anon_Duration): scala.Unit = js.native
  def animateToBearing(bearing: scala.Double): scala.Unit = js.native
  def animateToBearing(bearing: scala.Double, duration: scala.Double): scala.Unit = js.native
  def animateToCoordinate(latLng: LatLng): scala.Unit = js.native
  def animateToCoordinate(latLng: LatLng, duration: scala.Double): scala.Unit = js.native
  def animateToNavigation(location: LatLng, bearing: scala.Double, angle: scala.Double): scala.Unit = js.native
  def animateToNavigation(location: LatLng, bearing: scala.Double, angle: scala.Double, duration: scala.Double): scala.Unit = js.native
  def animateToRegion(region: Region): scala.Unit = js.native
  def animateToRegion(region: Region, duration: scala.Double): scala.Unit = js.native
  def animateToViewingAngle(angle: scala.Double): scala.Unit = js.native
  def animateToViewingAngle(angle: scala.Double, duration: scala.Double): scala.Unit = js.native
  def coordinateForPoint(point: Point): js.Promise[LatLng] = js.native
  def fitToCoordinates(): scala.Unit = js.native
  def fitToCoordinates(coordinates: js.Array[LatLng]): scala.Unit = js.native
  def fitToCoordinates(coordinates: js.Array[LatLng], options: reactDashNativeDashMapsLib.Anon_Animated): scala.Unit = js.native
  def fitToElements(animated: scala.Boolean): scala.Unit = js.native
  def fitToSuppliedMarkers(markers: js.Array[java.lang.String]): scala.Unit = js.native
  def fitToSuppliedMarkers(markers: js.Array[java.lang.String], options: reactDashNativeDashMapsLib.Anon_Animated): scala.Unit = js.native
  def getCamera(): js.Promise[Camera] = js.native
  def getMapBoundaries(): js.Promise[reactDashNativeDashMapsLib.Anon_NorthEast] = js.native
  def pointForCoordinate(coordinate: LatLng): js.Promise[Point] = js.native
  def setCamera(camera: stdLib.Partial[Camera]): scala.Unit = js.native
  def setMapBoundaries(northEast: LatLng, southWest: LatLng): scala.Unit = js.native
  def takeSnapshot(): js.Promise[java.lang.String] = js.native
  def takeSnapshot(options: SnapshotOptions): js.Promise[java.lang.String] = js.native
}

