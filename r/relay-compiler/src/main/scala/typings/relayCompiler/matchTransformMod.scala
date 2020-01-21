package typings.relayCompiler

import typings.relayCompiler.graphQLCompilerContextMod.GraphQLCompilerContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler/lib/transforms/MatchTransform", JSImport.Namespace)
@js.native
object matchTransformMod extends js.Object {
  /**
    * This transform rewrites LinkedField nodes with @match and rewrites them
    * into `LinkedField` nodes with a `supported` argument.
    */
  def transform(context: GraphQLCompilerContext): GraphQLCompilerContext = js.native
}

