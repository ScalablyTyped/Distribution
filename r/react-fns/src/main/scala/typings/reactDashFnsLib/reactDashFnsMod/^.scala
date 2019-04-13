package typings
package reactDashFnsLib.reactDashFnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Media: reactLib.reactMod.SFC[
    reactDashFnsLib.distTypesMod.SharedRenderProps[reactDashFnsLib.distMediaMediaMod.MediaProps]
  ] = js.native
  def withDeviceMotion[Props](
    Component: reactLib.reactMod.ComponentType[Props with reactDashFnsLib.distDeviceMotionDeviceMotionMod.DeviceMotionProps]
  ): reactLib.reactMod.ComponentType[Props] = js.native
  def withDeviceOrientation[Props](
    Component: reactLib.reactMod.ComponentType[
      Props with reactDashFnsLib.distDeviceOrientationDeviceOrientationMod.DeviceOrientationProps
    ]
  ): reactLib.reactMod.ComponentType[Props] = js.native
  def withGeoPosition[Props](
    Component: reactLib.reactMod.ComponentType[Props with reactDashFnsLib.distGeoPositionGeoPositionMod.GeoPositionProps]
  ): reactLib.reactMod.ComponentType[Props] = js.native
  def withLocales[Props](
    Component: reactLib.reactMod.ComponentType[Props with reactDashFnsLib.distLocalesLocalesMod.LocalesProps]
  ): reactLib.reactMod.ComponentType[Props] = js.native
  def withNetwork[Props](
    Component: reactLib.reactMod.ComponentType[Props with reactDashFnsLib.distNetworkNetworkMod.NetworkProps]
  ): reactLib.reactMod.ComponentType[Props] = js.native
  def withScroll[Props](
    Component: reactLib.reactMod.ComponentType[Props with reactDashFnsLib.distScrollScrollMod.ScrollProps]
  ): reactLib.reactMod.ComponentType[Props] = js.native
  def withWindowSize[Props](
    Component: reactLib.reactMod.ComponentType[Props with reactDashFnsLib.distWindowSizeWindowSizeMod.WindowSizeProps]
  ): reactLib.reactMod.ComponentType[Props] = js.native
}

