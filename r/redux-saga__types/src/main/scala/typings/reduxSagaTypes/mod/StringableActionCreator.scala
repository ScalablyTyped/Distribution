package typings.reduxSagaTypes.mod

import typings.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringableActionCreator[A /* <: Action[_] */] extends js.Object {
  
  def apply(args: js.Any*): A = js.native
}
