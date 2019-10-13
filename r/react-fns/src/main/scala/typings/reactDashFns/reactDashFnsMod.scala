package typings.reactDashFns

import typings.react.reactMod.ComponentType
import typings.react.reactMod.SFC
import typings.reactDashFns.distDeviceMotionDeviceMotionMod.DeviceMotionProps
import typings.reactDashFns.distDeviceOrientationDeviceOrientationMod.DeviceOrientationProps
import typings.reactDashFns.distGeoPositionGeoPositionMod.GeoPositionProps
import typings.reactDashFns.distLocalesLocalesMod.LocalesProps
import typings.reactDashFns.distMediaMediaMod.MediaProps
import typings.reactDashFns.distNetworkNetworkMod.NetworkProps
import typings.reactDashFns.distScrollScrollMod.ScrollConfig
import typings.reactDashFns.distScrollScrollMod.ScrollProps
import typings.reactDashFns.distTypesMod.SharedRenderProps
import typings.reactDashFns.distWindowSizeWindowSizeMod.WindowSizeConfig
import typings.reactDashFns.distWindowSizeWindowSizeMod.WindowSizeProps
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns", JSImport.Namespace)
@js.native
object reactDashFnsMod extends js.Object {
  @js.native
  class DeviceMotion ()
    extends typings.reactDashFns.distDeviceMotionDeviceMotionMod.DeviceMotion
  
  @js.native
  class DeviceOrientation ()
    extends typings.reactDashFns.distDeviceOrientationDeviceOrientationMod.DeviceOrientation
  
  @js.native
  class GeoPosition ()
    extends typings.reactDashFns.distGeoPositionGeoPositionMod.GeoPosition
  
  @js.native
  class Locales ()
    extends typings.reactDashFns.distLocalesLocalesMod.Locales
  
  @js.native
  class Network ()
    extends typings.reactDashFns.distNetworkNetworkMod.Network
  
  @js.native
  class Scroll ()
    extends typings.reactDashFns.distScrollMod.Scroll
  
  @js.native
  class WindowSize ()
    extends typings.reactDashFns.distWindowSizeMod.WindowSize
  
  val Media: SFC[SharedRenderProps[MediaProps]] = js.native
  def withDeviceMotion[Props](Component: ComponentType[Props with DeviceMotionProps]): ComponentType[Props] = js.native
  def withDeviceOrientation[Props](Component: ComponentType[Props with DeviceOrientationProps]): ComponentType[Props] = js.native
  def withGeoPosition[Props](Component: ComponentType[Props with GeoPositionProps]): ComponentType[Props] = js.native
  def withLocales[Props](Component: ComponentType[Props with LocalesProps]): ComponentType[Props] = js.native
  def withNetwork[Props](Component: ComponentType[Props with NetworkProps]): ComponentType[Props] = js.native
  def withScroll[Props](Component: ComponentType[Props with ScrollProps]): ComponentType[Props] = js.native
  def withWindowSize[Props](Component: ComponentType[Props with WindowSizeProps]): ComponentType[Props] = js.native
  /* static members */
  @js.native
  object Scroll extends js.Object {
    var defaultProps: Partial[ScrollConfig] = js.native
  }
  
  /* static members */
  @js.native
  object WindowSize extends js.Object {
    var defaultProps: Partial[WindowSizeConfig] = js.native
  }
  
}

