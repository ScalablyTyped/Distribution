package typings.rollup.mod

import typings.estree.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformSourceDescription extends SourceDescription {
  var dependencies: js.UndefOr[js.Array[String]] = js.undefined
}

object TransformSourceDescription {
  @scala.inline
  def apply(
    code: String,
    ast: Program = null,
    dependencies: js.Array[String] = null,
    map: SourceMapInput = null,
    moduleSideEffects: js.UndefOr[Boolean] = js.undefined,
    syntheticNamedExports: js.UndefOr[Boolean] = js.undefined
  ): TransformSourceDescription = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (ast != null) __obj.updateDynamic("ast")(ast.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (!js.isUndefined(moduleSideEffects)) __obj.updateDynamic("moduleSideEffects")(moduleSideEffects.asInstanceOf[js.Any])
    if (!js.isUndefined(syntheticNamedExports)) __obj.updateDynamic("syntheticNamedExports")(syntheticNamedExports.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformSourceDescription]
  }
}

