package typings.reactNativeNavigation.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OptionsModalPresentationStyle extends StObject
@JSImport("react-native-navigation/lib/dist/interfaces/Options", "OptionsModalPresentationStyle")
@js.native
object OptionsModalPresentationStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OptionsModalPresentationStyle with String] = js.native
  
  @js.native
  sealed trait currentContext extends OptionsModalPresentationStyle
  /* "currentContext" */ val currentContext: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.currentContext with String = js.native
  
  @js.native
  sealed trait formSheet extends OptionsModalPresentationStyle
  /* "formSheet" */ val formSheet: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.formSheet with String = js.native
  
  @js.native
  sealed trait fullScreen extends OptionsModalPresentationStyle
  /* "fullScreen" */ val fullScreen: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.fullScreen with String = js.native
  
  @js.native
  sealed trait none extends OptionsModalPresentationStyle
  /* "none" */ val none: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.none with String = js.native
  
  @js.native
  sealed trait overCurrentContext extends OptionsModalPresentationStyle
  /* "overCurrentContext" */ val overCurrentContext: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.overCurrentContext with String = js.native
  
  @js.native
  sealed trait overFullScreen extends OptionsModalPresentationStyle
  /* "overFullScreen" */ val overFullScreen: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.overFullScreen with String = js.native
  
  @js.native
  sealed trait pageSheet extends OptionsModalPresentationStyle
  /* "pageSheet" */ val pageSheet: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.pageSheet with String = js.native
  
  @js.native
  sealed trait popover extends OptionsModalPresentationStyle
  /* "popover" */ val popover: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.popover with String = js.native
}
