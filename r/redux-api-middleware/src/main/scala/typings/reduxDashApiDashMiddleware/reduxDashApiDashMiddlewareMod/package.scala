package typings.reduxDashApiDashMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashApiDashMiddlewareMod {
  import typings.reduxDashApiDashMiddleware.Anon_Error
  import typings.reduxDashApiDashMiddleware.Anon_Meta
  import typings.reduxDashApiDashMiddleware.Anon_Payload

  type RSAAActions = (RSAARequestAction[scala.Nothing, scala.Nothing]) | (RSAAResultAction[scala.Nothing, scala.Nothing])
  type RSAAFailureAction[Payload, Meta] = RSAAResultAction[Payload, Meta]
  type RSAAFailureType[State, Payload, Meta] = String | js.Symbol | (RSAAFailureTypeDescriptor[State, Payload, Meta])
  type RSAARequestAction[Payload, Meta] = (ValidAction[Payload, Meta]) | InvalidAction[InvalidRSAA]
  type RSAARequestType[State, Payload, Meta] = String | js.Symbol | (RSAARequestTypeDescriptor[State, Payload, Meta])
  type RSAAResultAction[Payload, Meta] = (ValidAction[Payload, Meta]) | (InvalidAction[InternalError | RequestError | ApiError[Payload]])
  type RSAASuccessAction[Payload, Meta] = RSAAResultAction[Payload, Meta]
  type RSAASuccessType[State, Payload, Meta] = String | js.Symbol | (RSAASuccessTypeDescriptor[State, Payload, Meta])
  type TypeOrResolver[Arg, Type] = Type | (js.Function1[/* arg */ Arg, Type])
  type ValidAction[Payload, Meta] = Anon_Error with (Anon_Payload[Payload] | js.Object) with (Anon_Meta[Meta] | js.Object)
}
