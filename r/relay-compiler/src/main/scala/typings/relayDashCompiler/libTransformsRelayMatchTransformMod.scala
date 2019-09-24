package typings.relayDashCompiler

import typings.relayDashCompiler.libCoreGraphQLCompilerContextMod.GraphQLCompilerContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler/lib/transforms/RelayMatchTransform", JSImport.Namespace)
@js.native
object libTransformsRelayMatchTransformMod extends js.Object {
  /**
    * This transform rewrites LinkedField nodes with @match and rewrites them
    * into `LinkedField` nodes with a `supported` argument.
    */
  def transform(context: GraphQLCompilerContext): GraphQLCompilerContext = js.native
}

