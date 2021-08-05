package typings.reactNavigationNative

import typings.react.mod.RefObject
import typings.reactNavigationCore.typesMod.NavigationContainerRef
import typings.reactNavigationNative.anon.`0`
import typings.reactNavigationNative.typesMod.LinkingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useLinkingNativeMod {
  
  @JSImport("@react-navigation/native/lib/typescript/src/useLinking.native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    ref: RefObject[NavigationContainerRef],
    hasEnabledPrefixesConfigGetInitialURLSubscribeGetStateFromPath: LinkingOptions
  ): `0` = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], hasEnabledPrefixesConfigGetInitialURLSubscribeGetStateFromPath.asInstanceOf[js.Any])).asInstanceOf[`0`]
}
