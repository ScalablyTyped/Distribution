package typings.relayDashCompiler

import typings.relayDashCompiler.libCoreGraphQLCompilerContextMod.GraphQLCompilerContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler/lib/transforms/RelayDirectiveTransform", JSImport.Namespace)
@js.native
object libTransformsRelayDirectiveTransformMod extends js.Object {
  /**
    * A transform that extracts `@relay(plural: Boolean)` directives and converts
    * them to metadata that can be accessed at runtime.
    */
  def transform(context: GraphQLCompilerContext): GraphQLCompilerContext = js.native
}

