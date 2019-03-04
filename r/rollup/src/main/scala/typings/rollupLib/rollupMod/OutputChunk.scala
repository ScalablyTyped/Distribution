package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputChunk extends RenderedChunk {
  var code: java.lang.String
  var map: js.UndefOr[SourceMap] = js.undefined
}

object OutputChunk {
  @scala.inline
  def apply(
    code: java.lang.String,
    dynamicImports: js.Array[java.lang.String],
    exports: js.Array[java.lang.String],
    fileName: java.lang.String,
    imports: js.Array[java.lang.String],
    isDynamicEntry: scala.Boolean,
    isEntry: scala.Boolean,
    modules: org.scalablytyped.runtime.StringDictionary[RenderedModule],
    name: java.lang.String,
    facadeModuleId: java.lang.String = null,
    map: SourceMap = null
  ): OutputChunk = {
    val __obj = js.Dynamic.literal(code = code, dynamicImports = dynamicImports, exports = exports, fileName = fileName, imports = imports, isDynamicEntry = isDynamicEntry, isEntry = isEntry, modules = modules, name = name)
    if (facadeModuleId != null) __obj.updateDynamic("facadeModuleId")(facadeModuleId)
    if (map != null) __obj.updateDynamic("map")(map)
    __obj.asInstanceOf[OutputChunk]
  }
}

