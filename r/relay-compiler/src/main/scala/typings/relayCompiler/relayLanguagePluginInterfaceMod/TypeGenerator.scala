package typings.relayCompiler.relayLanguagePluginInterfaceMod

import typings.relayCompiler.compilerContextMod.IRTransform
import typings.relayCompiler.iRMod.Fragment
import typings.relayCompiler.iRMod.Root
import typings.relayCompiler.schemaMod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeGenerator extends js.Object {
  /**
    * Transforms that should be applied to the intermediate representation of the
    * GraphQL document before passing to the `generate` function.
    */
  var transforms: js.Array[IRTransform] = js.native
  def generate(schema: Schema, node: Fragment, options: TypeGeneratorOptions): String = js.native
  /**
    * Given GraphQL document IR, this function should generate type information
    * for e.g. the selections made. It can, however, also generate any other
    * content such as importing other files, including other artifacts.
    */
  def generate(schema: Schema, node: Root, options: TypeGeneratorOptions): String = js.native
}

