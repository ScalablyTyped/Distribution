package typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OptionsModalPresentationStyle extends js.Object

@JSImport("react-native-navigation/lib/dist/interfaces/Options", "OptionsModalPresentationStyle")
@js.native
object OptionsModalPresentationStyle extends js.Object {
  @js.native
  sealed trait currentContext extends OptionsModalPresentationStyle
  
  @js.native
  sealed trait formSheet extends OptionsModalPresentationStyle
  
  @js.native
  sealed trait fullScreen extends OptionsModalPresentationStyle
  
  @js.native
  sealed trait none extends OptionsModalPresentationStyle
  
  @js.native
  sealed trait overCurrentContext extends OptionsModalPresentationStyle
  
  @js.native
  sealed trait overFullScreen extends OptionsModalPresentationStyle
  
  @js.native
  sealed trait pageSheet extends OptionsModalPresentationStyle
  
  @js.native
  sealed trait popOver extends OptionsModalPresentationStyle
  
  /* "currentContext" */ val currentContext: typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle.currentContext with String = js.native
  /* "formSheet" */ val formSheet: typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle.formSheet with String = js.native
  /* "fullScreen" */ val fullScreen: typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle.fullScreen with String = js.native
  /* "none" */ val none: typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle.none with String = js.native
  /* "overCurrentContext" */ val overCurrentContext: typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle.overCurrentContext with String = js.native
  /* "overFullScreen" */ val overFullScreen: typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle.overFullScreen with String = js.native
  /* "pageSheet" */ val pageSheet: typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle.pageSheet with String = js.native
  /* "popOver" */ val popOver: typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle.popOver with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OptionsModalPresentationStyle with String] = js.native
}

