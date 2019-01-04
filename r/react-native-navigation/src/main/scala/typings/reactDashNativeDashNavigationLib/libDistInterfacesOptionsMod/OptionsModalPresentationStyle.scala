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
  
  /* "currentContext" */ val currentContext: currentContext with java.lang.String = js.native
  /* "formSheet" */ val formSheet: formSheet with java.lang.String = js.native
  /* "fullScreen" */ val fullScreen: fullScreen with java.lang.String = js.native
  /* "none" */ val none: none with java.lang.String = js.native
  /* "overCurrentContext" */ val overCurrentContext: overCurrentContext with java.lang.String = js.native
  /* "overFullScreen" */ val overFullScreen: overFullScreen with java.lang.String = js.native
  /* "pageSheet" */ val pageSheet: pageSheet with java.lang.String = js.native
  /* "popOver" */ val popOver: popOver with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod.OptionsModalPresentationStyle with java.lang.String
  ] = js.native
}

