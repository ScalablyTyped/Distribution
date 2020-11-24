package typings.reactNativeNavigation.optionsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OptionsModalPresentationStyle extends js.Object
@JSImport("react-native-navigation/lib/dist/interfaces/Options", "OptionsModalPresentationStyle")
@js.native
object OptionsModalPresentationStyle extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OptionsModalPresentationStyle with String] = js.native
  
  @js.native
  sealed trait currentContext extends OptionsModalPresentationStyle
  /* "currentContext" */ @js.native
  object currentContext extends TopLevel[currentContext with String]
  
  @js.native
  sealed trait formSheet extends OptionsModalPresentationStyle
  /* "formSheet" */ @js.native
  object formSheet extends TopLevel[formSheet with String]
  
  @js.native
  sealed trait fullScreen extends OptionsModalPresentationStyle
  /* "fullScreen" */ @js.native
  object fullScreen extends TopLevel[fullScreen with String]
  
  @js.native
  sealed trait none extends OptionsModalPresentationStyle
  /* "none" */ @js.native
  object none extends TopLevel[none with String]
  
  @js.native
  sealed trait overCurrentContext extends OptionsModalPresentationStyle
  /* "overCurrentContext" */ @js.native
  object overCurrentContext extends TopLevel[overCurrentContext with String]
  
  @js.native
  sealed trait overFullScreen extends OptionsModalPresentationStyle
  /* "overFullScreen" */ @js.native
  object overFullScreen extends TopLevel[overFullScreen with String]
  
  @js.native
  sealed trait pageSheet extends OptionsModalPresentationStyle
  /* "pageSheet" */ @js.native
  object pageSheet extends TopLevel[pageSheet with String]
  
  @js.native
  sealed trait popover extends OptionsModalPresentationStyle
  /* "popover" */ @js.native
  object popover extends TopLevel[popover with String]
}
