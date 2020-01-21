package typings.relayCompiler

import typings.relayCompiler.graphQLCompilerContextMod.GraphQLCompilerContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler/lib/transforms/MaskTransform", JSImport.Namespace)
@js.native
object maskTransformMod extends js.Object {
  /**
    * A transform that inlines fragment spreads with the @relay(mask: false)
    * directive.
    */
  def transform(context: GraphQLCompilerContext): GraphQLCompilerContext = js.native
}

