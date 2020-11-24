package typings.reactFns

import typings.react.mod.ComponentType
import typings.react.mod.SFC
import typings.reactFns.anon.PartialScrollConfig
import typings.reactFns.anon.PartialWindowSizeConfig
import typings.reactFns.deviceMotionDeviceMotionMod.DeviceMotionProps
import typings.reactFns.deviceOrientationDeviceOrientationMod.DeviceOrientationProps
import typings.reactFns.geoPositionGeoPositionMod.GeoPositionProps
import typings.reactFns.localesLocalesMod.LocalesProps
import typings.reactFns.mediaMediaMod.MediaProps
import typings.reactFns.networkNetworkMod.NetworkProps
import typings.reactFns.scrollScrollMod.ScrollProps
import typings.reactFns.typesMod.SharedRenderProps
import typings.reactFns.windowSizeWindowSizeMod.WindowSizeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-fns", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val Media: SFC[SharedRenderProps[MediaProps]] = js.native
  
  def withDeviceMotion[Props](Component: ComponentType[Props with DeviceMotionProps]): ComponentType[Props] = js.native
  
  def withDeviceOrientation[Props](Component: ComponentType[Props with DeviceOrientationProps]): ComponentType[Props] = js.native
  
  def withGeoPosition[Props](Component: ComponentType[Props with GeoPositionProps]): ComponentType[Props] = js.native
  
  def withLocales[Props](Component: ComponentType[Props with LocalesProps]): ComponentType[Props] = js.native
  
  def withNetwork[Props](Component: ComponentType[Props with NetworkProps]): ComponentType[Props] = js.native
  
  def withScroll[Props](Component: ComponentType[Props with ScrollProps]): ComponentType[Props] = js.native
  
  def withWindowSize[Props](Component: ComponentType[Props with WindowSizeProps]): ComponentType[Props] = js.native
  
  @js.native
  class DeviceMotion ()
    extends typings.reactFns.deviceMotionDeviceMotionMod.DeviceMotion
  
  @js.native
  class DeviceOrientation ()
    extends typings.reactFns.deviceOrientationDeviceOrientationMod.DeviceOrientation
  
  @js.native
  class GeoPosition ()
    extends typings.reactFns.geoPositionGeoPositionMod.GeoPosition
  
  @js.native
  class Locales ()
    extends typings.reactFns.localesLocalesMod.Locales
  
  @js.native
  class Network ()
    extends typings.reactFns.networkNetworkMod.Network
  
  @js.native
  class Scroll ()
    extends typings.reactFns.scrollMod.Scroll
  /* static members */
  @js.native
  object Scroll extends js.Object {
    
    var defaultProps: PartialScrollConfig = js.native
  }
  
  @js.native
  class WindowSize ()
    extends typings.reactFns.windowSizeMod.WindowSize
  /* static members */
  @js.native
  object WindowSize extends js.Object {
    
    var defaultProps: PartialWindowSizeConfig = js.native
  }
}
