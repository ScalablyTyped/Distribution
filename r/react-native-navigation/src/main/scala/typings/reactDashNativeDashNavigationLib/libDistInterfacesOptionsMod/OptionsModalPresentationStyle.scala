package typings
package reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OptionsModalPresentationStyle extends js.Object

@JSImport("react-native-navigation/lib/dist/interfaces/Options", "OptionsModalPresentationStyle")
@js.native
object OptionsModalPresentationStyle extends js.Object {
  @js.native
  sealed trait currentContext
    extends reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod.OptionsModalPresentationStyle
  
  @js.native
  sealed trait formSheet
    extends reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod.OptionsModalPresentationStyle
  
  @js.native
  sealed trait fullScreen
    extends reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod.OptionsModalPresentationStyle
  
  @js.native
  sealed trait none
    extends reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod.OptionsModalPresentationStyle
  
  @js.native
  sealed trait overCurrentContext
    extends reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod.OptionsModalPresentationStyle
  
  @js.native
  sealed trait overFullScreen
    extends reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod.OptionsModalPresentationStyle
  
  @js.native
  sealed trait pageSheet
    extends reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod.OptionsModalPresentationStyle
  
  @js.native
  sealed trait popOver
    extends reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod.OptionsModalPresentationStyle
  
  /* 4 */ val currentContext: currentContext with scala.Double = js.native
  /* 0 */ val formSheet: formSheet with scala.Double = js.native
  /* 6 */ val fullScreen: fullScreen with scala.Double = js.native
  /* 7 */ val none: none with scala.Double = js.native
  /* 3 */ val overCurrentContext: overCurrentContext with scala.Double = js.native
  /* 2 */ val overFullScreen: overFullScreen with scala.Double = js.native
  /* 1 */ val pageSheet: pageSheet with scala.Double = js.native
  /* 5 */ val popOver: popOver with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod.OptionsModalPresentationStyle with scala.Double
  ] = js.native
}

