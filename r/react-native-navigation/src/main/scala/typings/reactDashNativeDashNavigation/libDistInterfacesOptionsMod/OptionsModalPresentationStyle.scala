package typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod

import org.scalablytyped.runtime.TopLevel
import typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle.currentContext
import typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle.formSheet
import typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle.fullScreen
import typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle.none
import typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle.overCurrentContext
import typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle.overFullScreen
import typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle.pageSheet
import typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.OptionsModalPresentationStyle.popOver
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OptionsModalPresentationStyle with String] = js.native
  /* "currentContext" */ @js.native
  object currentContext extends TopLevel[currentContext with String]
  
  /* "formSheet" */ @js.native
  object formSheet extends TopLevel[formSheet with String]
  
  /* "fullScreen" */ @js.native
  object fullScreen extends TopLevel[fullScreen with String]
  
  /* "none" */ @js.native
  object none extends TopLevel[none with String]
  
  /* "overCurrentContext" */ @js.native
  object overCurrentContext extends TopLevel[overCurrentContext with String]
  
  /* "overFullScreen" */ @js.native
  object overFullScreen extends TopLevel[overFullScreen with String]
  
  /* "pageSheet" */ @js.native
  object pageSheet extends TopLevel[pageSheet with String]
  
  /* "popOver" */ @js.native
  object popOver extends TopLevel[popOver with String]
  
}

