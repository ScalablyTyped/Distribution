package typings.reduxSagaCore.effectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CpsCallback[R] extends js.Object {
  
  def apply(error: js.Any, result: R): Unit = js.native
  
  var cancel: js.UndefOr[js.Function0[Unit]] = js.native
}
