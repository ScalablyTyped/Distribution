package typings.relayDashCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCoreGraphQLCompilerContextMod {
  type IRTransform = js.Function1[/* context */ GraphQLCompilerContext, GraphQLCompilerContext]
  type IRValidation = js.Function1[/* contect */ GraphQLCompilerContext, Unit]
}
