package typings.reactNavigationNative.anon

import typings.reactNavigationCore.anon.PartialStateNavigationSta
import typings.reactNavigationCore.getActionFromStateMod.NavigateAction
import typings.reactNavigationRouters.commonActionsMod.Action
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn0 extends StObject {
  
  def apply(state: PartialStateNavigationSta): js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action] = js.native
  def apply(
    state: PartialStateNavigationSta,
    options: typings.reactNavigationCore.getActionFromStateMod.Options
  ): js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action] = js.native
}
