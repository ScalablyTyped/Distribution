package typings.relayCompiler.flattenTransformMod

import typings.relayCompiler.graphQLCompilerContextMod.GraphQLCompilerContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler/lib/transforms/FlattenTransform", "transformWithOptions")
@js.native
object transformWithOptions extends js.Object {
  def apply(options: FlattenOptions): js.Function1[/* context */ GraphQLCompilerContext, GraphQLCompilerContext] = js.native
}

