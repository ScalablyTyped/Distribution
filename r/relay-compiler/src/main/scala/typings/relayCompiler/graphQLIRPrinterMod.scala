package typings.relayCompiler

import typings.relayCompiler.graphQLCompilerContextMod.CompilerContextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler/lib/core/GraphQLIRPrinter", JSImport.Namespace)
@js.native
object graphQLIRPrinterMod extends js.Object {
  def print(node: CompilerContextDocument): String = js.native
}

