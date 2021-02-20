package typings.reactNativeNavigation.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OptionsModalTransitionStyle extends StObject
@JSImport("react-native-navigation/lib/dist/interfaces/Options", "OptionsModalTransitionStyle")
@js.native
object OptionsModalTransitionStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OptionsModalTransitionStyle with String] = js.native
  
  @js.native
  sealed trait coverVertical extends OptionsModalTransitionStyle
  /* "coverVertical" */ val coverVertical: typings.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle.coverVertical with String = js.native
  
  @js.native
  sealed trait crossDissolve extends OptionsModalTransitionStyle
  /* "crossDissolve" */ val crossDissolve: typings.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle.crossDissolve with String = js.native
  
  @js.native
  sealed trait flipHorizontal extends OptionsModalTransitionStyle
  /* "flipHorizontal" */ val flipHorizontal: typings.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle.flipHorizontal with String = js.native
  
  @js.native
  sealed trait partialCurl extends OptionsModalTransitionStyle
  /* "partialCurl" */ val partialCurl: typings.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle.partialCurl with String = js.native
}
