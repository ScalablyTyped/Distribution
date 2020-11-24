package typings.reactNativeNavigation.optionsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OptionsModalTransitionStyle extends js.Object
@JSImport("react-native-navigation/lib/dist/interfaces/Options", "OptionsModalTransitionStyle")
@js.native
object OptionsModalTransitionStyle extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OptionsModalTransitionStyle with String] = js.native
  
  @js.native
  sealed trait coverVertical extends OptionsModalTransitionStyle
  /* "coverVertical" */ @js.native
  object coverVertical extends TopLevel[coverVertical with String]
  
  @js.native
  sealed trait crossDissolve extends OptionsModalTransitionStyle
  /* "crossDissolve" */ @js.native
  object crossDissolve extends TopLevel[crossDissolve with String]
  
  @js.native
  sealed trait flipHorizontal extends OptionsModalTransitionStyle
  /* "flipHorizontal" */ @js.native
  object flipHorizontal extends TopLevel[flipHorizontal with String]
  
  @js.native
  sealed trait partialCurl extends OptionsModalTransitionStyle
  /* "partialCurl" */ @js.native
  object partialCurl extends TopLevel[partialCurl with String]
}
