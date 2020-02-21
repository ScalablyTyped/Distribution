package typings.relayCompiler

import typings.relayCompiler.compilerContextMod.CompilerContext
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
  def transform(context: CompilerContext): CompilerContext = js.native
}

