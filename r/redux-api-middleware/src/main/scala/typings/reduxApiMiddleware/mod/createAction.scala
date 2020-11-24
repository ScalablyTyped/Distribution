package typings.reduxApiMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-api-middleware", "createAction")
@js.native
object createAction extends js.Object {
  
  def apply[State, Payload, Meta](clientCall: RSAACall[State, Payload, Meta]): RSAAAction[State, Payload, Meta] = js.native
}
