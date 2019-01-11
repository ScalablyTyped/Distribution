package typings
package reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OptionsModalTransitionStyle extends js.Object

@JSImport("react-native-navigation/lib/dist/interfaces/Options", "OptionsModalTransitionStyle")
@js.native
object OptionsModalTransitionStyle extends js.Object {
  @js.native
  sealed trait coverVertical
    extends reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod.OptionsModalTransitionStyle
  
  @js.native
  sealed trait crossDissolve
    extends reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod.OptionsModalTransitionStyle
  
  @js.native
  sealed trait flipHorizontal
    extends reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod.OptionsModalTransitionStyle
  
  @js.native
  sealed trait partialCurl
    extends reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod.OptionsModalTransitionStyle
  
  /* "coverVertical" */ val coverVertical: coverVertical with java.lang.String = js.native
  /* "crossDissolve" */ val crossDissolve: crossDissolve with java.lang.String = js.native
  /* "flipHorizontal" */ val flipHorizontal: flipHorizontal with java.lang.String = js.native
  /* "partialCurl" */ val partialCurl: partialCurl with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod.OptionsModalTransitionStyle with java.lang.String
  ] = js.native
}

