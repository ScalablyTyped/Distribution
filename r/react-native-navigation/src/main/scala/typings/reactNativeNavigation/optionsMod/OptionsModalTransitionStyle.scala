package typings.reactNativeNavigation.optionsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OptionsModalTransitionStyle extends js.Object

@JSImport("react-native-navigation/lib/dist/interfaces/Options", "OptionsModalTransitionStyle")
@js.native
object OptionsModalTransitionStyle extends js.Object {
  @js.native
  sealed trait coverVertical extends OptionsModalTransitionStyle
  
  @js.native
  sealed trait crossDissolve extends OptionsModalTransitionStyle
  
  @js.native
  sealed trait flipHorizontal extends OptionsModalTransitionStyle
  
  @js.native
  sealed trait partialCurl extends OptionsModalTransitionStyle
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OptionsModalTransitionStyle with String] = js.native
  /* "coverVertical" */ @js.native
  object coverVertical extends TopLevel[coverVertical with String]
  
  /* "crossDissolve" */ @js.native
  object crossDissolve extends TopLevel[crossDissolve with String]
  
  /* "flipHorizontal" */ @js.native
  object flipHorizontal extends TopLevel[flipHorizontal with String]
  
  /* "partialCurl" */ @js.native
  object partialCurl extends TopLevel[partialCurl with String]
  
}

