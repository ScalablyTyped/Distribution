package typings.reactNavigationNative

import typings.react.mod.RefObject
import typings.reactNavigationCore.typesMod.NavigationContainerRef
import typings.reactNavigationNative.anon.GetInitialState
import typings.reactNavigationNative.typesMod.LinkingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-navigation/native/lib/typescript/src/useLinking", JSImport.Namespace)
@js.native
object useLinkingMod extends js.Object {
  
  def default(
    ref: RefObject[NavigationContainerRef],
    hasEnabledConfigGetStateFromPathGetPathFromState: LinkingOptions
  ): GetInitialState = js.native
}
