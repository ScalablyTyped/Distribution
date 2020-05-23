package typings.reduxApiMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type RSAAActions = (typings.reduxApiMiddleware.mod.RSAARequestAction[scala.Nothing, scala.Nothing]) | (typings.reduxApiMiddleware.mod.RSAAResultAction[scala.Nothing, scala.Nothing])
  type RSAAFailureAction[Payload, Meta] = typings.reduxApiMiddleware.mod.RSAAResultAction[Payload, Meta]
  type RSAAFailureType[State, Payload, Meta] = java.lang.String | js.Symbol | (typings.reduxApiMiddleware.mod.RSAAFailureTypeDescriptor[State, Payload, Meta])
  type RSAARequestAction[Payload, Meta] = (typings.reduxApiMiddleware.mod.ValidAction[Payload, Meta]) | typings.reduxApiMiddleware.mod.InvalidAction[typings.reduxApiMiddleware.mod.InvalidRSAA]
  type RSAARequestType[State, Payload, Meta] = java.lang.String | js.Symbol | (typings.reduxApiMiddleware.mod.RSAARequestTypeDescriptor[State, Payload, Meta])
  type RSAAResultAction[Payload, Meta] = (typings.reduxApiMiddleware.mod.ValidAction[Payload, Meta]) | (typings.reduxApiMiddleware.mod.InvalidAction[
    typings.reduxApiMiddleware.mod.InternalError | typings.reduxApiMiddleware.mod.RequestError | typings.reduxApiMiddleware.mod.ApiError[Payload]
  ])
  type RSAASuccessAction[Payload, Meta] = typings.reduxApiMiddleware.mod.RSAAResultAction[Payload, Meta]
  type RSAASuccessType[State, Payload, Meta] = java.lang.String | js.Symbol | (typings.reduxApiMiddleware.mod.RSAASuccessTypeDescriptor[State, Payload, Meta])
  type TypeOrResolver[Arg, Type] = Type | (js.Function1[/* arg */ Arg, Type])
  type ValidAction[Payload, Meta] = typings.reduxApiMiddleware.anon.Error with (typings.reduxApiMiddleware.anon.PayloadPayload[Payload] | js.Object) with (typings.reduxApiMiddleware.anon.MetaMeta[Meta] | js.Object)
}
