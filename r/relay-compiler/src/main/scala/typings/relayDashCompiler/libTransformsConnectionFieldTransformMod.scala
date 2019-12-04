package typings.relayDashCompiler

import typings.relayDashCompiler.libCoreGraphQLCompilerContextMod.GraphQLCompilerContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler/lib/transforms/ConnectionFieldTransform", JSImport.Namespace)
@js.native
object libTransformsConnectionFieldTransformMod extends js.Object {
  /**
    * This transform rewrites LinkedField nodes with @connection_resolver and rewrites them
    * into `ConnectionField` nodes.
    */
  def transform(context: GraphQLCompilerContext): GraphQLCompilerContext = js.native
}

