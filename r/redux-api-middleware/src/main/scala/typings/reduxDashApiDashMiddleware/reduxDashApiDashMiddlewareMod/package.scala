package typings.reduxDashApiDashMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashApiDashMiddlewareMod {
  type RSAAActions = (RSAARequestAction[js.Any, js.Any]) | (RSAASuccessAction[js.Any, js.Any]) | (RSAAFailureAction[js.Any, js.Any])
  type RSAAFailureType[State, Payload, Meta] = String | js.Symbol | (RSAAFailureTypeDescriptor[State, Payload, Meta])
  type RSAARequestType[State, Payload, Meta] = String | js.Symbol | (RSAARequestTypeDescriptor[State, Payload, Meta])
  type RSAASuccessType[State, Payload, Meta] = String | js.Symbol | (RSAASuccessTypeDescriptor[State, Payload, Meta])
  type TypeOrResolver[Arg, Type] = Type | (js.Function1[/* arg */ Arg, Type])
}
