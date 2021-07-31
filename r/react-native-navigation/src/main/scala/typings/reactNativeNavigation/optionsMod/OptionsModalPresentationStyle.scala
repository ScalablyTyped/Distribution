package typings.reactNativeNavigation.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OptionsModalPresentationStyle extends StObject
@JSImport("react-native-navigation/lib/dist/interfaces/Options", "OptionsModalPresentationStyle")
@js.native
object OptionsModalPresentationStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OptionsModalPresentationStyle & String] = js.native
  
  @js.native
  sealed trait currentContext
    extends StObject
       with OptionsModalPresentationStyle
  /* "currentContext" */ val currentContext: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.currentContext & String = js.native
  
  @js.native
  sealed trait formSheet
    extends StObject
       with OptionsModalPresentationStyle
  /* "formSheet" */ val formSheet: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.formSheet & String = js.native
  
  @js.native
  sealed trait fullScreen
    extends StObject
       with OptionsModalPresentationStyle
  /* "fullScreen" */ val fullScreen: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.fullScreen & String = js.native
  
  @js.native
  sealed trait none
    extends StObject
       with OptionsModalPresentationStyle
  /* "none" */ val none: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.none & String = js.native
  
  @js.native
  sealed trait overCurrentContext
    extends StObject
       with OptionsModalPresentationStyle
  /* "overCurrentContext" */ val overCurrentContext: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.overCurrentContext & String = js.native
  
  @js.native
  sealed trait overFullScreen
    extends StObject
       with OptionsModalPresentationStyle
  /* "overFullScreen" */ val overFullScreen: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.overFullScreen & String = js.native
  
  @js.native
  sealed trait pageSheet
    extends StObject
       with OptionsModalPresentationStyle
  /* "pageSheet" */ val pageSheet: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.pageSheet & String = js.native
  
  @js.native
  sealed trait popover
    extends StObject
       with OptionsModalPresentationStyle
  /* "popover" */ val popover: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.popover & String = js.native
}
