package typings.rollup.rollupMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputChunk extends RenderedChunk {
  var code: String
  var map: js.UndefOr[SourceMap] = js.undefined
}

object OutputChunk {
  @scala.inline
  def apply(
    code: String,
    dynamicImports: js.Array[String],
    exports: js.Array[String],
    fileName: String,
    imports: js.Array[String],
    isDynamicEntry: Boolean,
    isEntry: Boolean,
    modules: StringDictionary[RenderedModule],
    name: String,
    facadeModuleId: String = null,
    map: SourceMap = null
  ): OutputChunk = {
    val __obj = js.Dynamic.literal(code = code, dynamicImports = dynamicImports, exports = exports, fileName = fileName, imports = imports, isDynamicEntry = isDynamicEntry, isEntry = isEntry, modules = modules, name = name)
    if (facadeModuleId != null) __obj.updateDynamic("facadeModuleId")(facadeModuleId)
    if (map != null) __obj.updateDynamic("map")(map)
    __obj.asInstanceOf[OutputChunk]
  }
}

