package typings.reactDashNativeDashNavigation

import typings.reactDashNativeDashNavigation.libDistAdaptersConstantsMod.NavigationConstants
import typings.reactDashNativeDashNavigation.libDistNavigationMod.NavigationRoot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation", JSImport.Namespace)
@js.native
object reactDashNativeDashNavigationMod extends js.Object {
  @js.native
  class Constants protected ()
    extends typings.reactDashNativeDashNavigation.libDistAdaptersConstantsMod.Constants
  
  val Navigation: NavigationRoot = js.native
  /* static members */
  @js.native
  object Constants extends js.Object {
    def get(): js.Promise[NavigationConstants] = js.native
  }
  
  @js.native
  object OptionsModalPresentationStyle extends js.Object {
    /* "currentContext" */ val currentContext: typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle.currentContext with String = js.native
    /* "formSheet" */ val formSheet: typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle.formSheet with String = js.native
    /* "fullScreen" */ val fullScreen: typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle.fullScreen with String = js.native
    /* "none" */ val none: typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle.none with String = js.native
    /* "overCurrentContext" */ val overCurrentContext: typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle.overCurrentContext with String = js.native
    /* "overFullScreen" */ val overFullScreen: typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle.overFullScreen with String = js.native
    /* "pageSheet" */ val pageSheet: typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle.pageSheet with String = js.native
    /* "popOver" */ val popOver: typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle.popOver with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle with String
      ] = js.native
  }
  
  @js.native
  object OptionsModalTransitionStyle extends js.Object {
    /* "coverVertical" */ val coverVertical: typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalTransitionStyle.coverVertical with String = js.native
    /* "crossDissolve" */ val crossDissolve: typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalTransitionStyle.crossDissolve with String = js.native
    /* "flipHorizontal" */ val flipHorizontal: typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalTransitionStyle.flipHorizontal with String = js.native
    /* "partialCurl" */ val partialCurl: typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalTransitionStyle.partialCurl with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalTransitionStyle with String
      ] = js.native
  }
  
}

