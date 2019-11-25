package typings.rollup.rollupMod

import typings.estree.estreeMod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceDescription extends js.Object {
  var ast: js.UndefOr[Program] = js.undefined
  var code: String
  var map: js.UndefOr[SourceMapInput] = js.undefined
  var moduleSideEffects: js.UndefOr[Boolean | Null] = js.undefined
}

object SourceDescription {
  @scala.inline
  def apply(
    code: String,
    ast: Program = null,
    map: SourceMapInput = null,
    moduleSideEffects: js.UndefOr[Boolean] = js.undefined
  ): SourceDescription = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (ast != null) __obj.updateDynamic("ast")(ast.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (!js.isUndefined(moduleSideEffects)) __obj.updateDynamic("moduleSideEffects")(moduleSideEffects.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceDescription]
  }
}

