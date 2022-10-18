package typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OptionsModalTransitionStyle extends StObject
@JSImport("react-native-navigation/lib/dist/src/interfaces/Options", "OptionsModalTransitionStyle")
@js.native
object OptionsModalTransitionStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OptionsModalTransitionStyle & String] = js.native
  
  @js.native
  sealed trait coverVertical
    extends StObject
       with OptionsModalTransitionStyle
  /* "coverVertical" */ val coverVertical: typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod.OptionsModalTransitionStyle.coverVertical & String = js.native
  
  @js.native
  sealed trait crossDissolve
    extends StObject
       with OptionsModalTransitionStyle
  /* "crossDissolve" */ val crossDissolve: typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod.OptionsModalTransitionStyle.crossDissolve & String = js.native
  
  @js.native
  sealed trait flipHorizontal
    extends StObject
       with OptionsModalTransitionStyle
  /* "flipHorizontal" */ val flipHorizontal: typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod.OptionsModalTransitionStyle.flipHorizontal & String = js.native
  
  @js.native
  sealed trait partialCurl
    extends StObject
       with OptionsModalTransitionStyle
  /* "partialCurl" */ val partialCurl: typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod.OptionsModalTransitionStyle.partialCurl & String = js.native
}
