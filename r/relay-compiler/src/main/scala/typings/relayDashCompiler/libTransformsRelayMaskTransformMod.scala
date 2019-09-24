package typings.relayDashCompiler

import typings.relayDashCompiler.libCoreGraphQLCompilerContextMod.GraphQLCompilerContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler/lib/transforms/RelayMaskTransform", JSImport.Namespace)
@js.native
object libTransformsRelayMaskTransformMod extends js.Object {
  /**
    * A transform that inlines fragment spreads with the @relay(mask: false)
    * directive.
    */
  def transform(context: GraphQLCompilerContext): GraphQLCompilerContext = js.native
}

