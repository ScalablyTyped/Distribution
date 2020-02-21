package typings.relayCompiler

import typings.relayCompiler.compilerContextMod.CompilerContextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler/lib/core/IRPrinter", JSImport.Namespace)
@js.native
object irprinterMod extends js.Object {
  def print(node: CompilerContextDocument): String = js.native
}

