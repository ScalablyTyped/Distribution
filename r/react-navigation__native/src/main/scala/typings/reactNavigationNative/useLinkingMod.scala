package typings.reactNavigationNative

import typings.react.mod.RefObject
import typings.reactNavigationCore.typesMod.NavigationContainerRef
import typings.reactNavigationNative.anon.GetInitialState
import typings.reactNavigationNative.typesMod.LinkingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useLinkingMod {
  
  @JSImport("@react-navigation/native/lib/typescript/src/useLinking", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    ref: RefObject[NavigationContainerRef],
    hasEnabledConfigGetStateFromPathGetPathFromState: LinkingOptions
  ): GetInitialState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], hasEnabledConfigGetStateFromPathGetPathFromState.asInstanceOf[js.Any])).asInstanceOf[GetInitialState]
}
