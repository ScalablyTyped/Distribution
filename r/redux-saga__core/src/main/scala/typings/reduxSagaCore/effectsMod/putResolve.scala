package typings.reduxSagaCore.effectsMod

import typings.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@redux-saga/core/types/effects", "putResolve")
@js.native
object putResolve extends js.Object {
  
  def apply[A /* <: Action[_] */](action: A): PutEffect[A] = js.native
}
