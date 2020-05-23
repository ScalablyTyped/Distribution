package typings.rollupPluginTypescript2.tscacheMod

import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rollup-plugin-typescript2/dist/tscache", "getAllReferences")
@js.native
object getAllReferences extends js.Object {
  def apply(importer: String, snapshot: js.UndefOr[IScriptSnapshot], options: CompilerOptions): js.Array[String] = js.native
}

