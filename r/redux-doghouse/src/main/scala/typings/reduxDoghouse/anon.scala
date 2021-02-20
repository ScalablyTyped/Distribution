package typings.reduxDoghouse

import typings.redux.mod.ActionCreator
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[A, C /* <: ActionCreator[A] */](actionCreator: C, dispatch: Dispatch[AnyAction]): C = js.native
  }
}
