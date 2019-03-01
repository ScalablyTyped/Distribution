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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("dynamicImports")(dynamicImports)
    __obj.updateDynamic("exports")(exports)
    __obj.updateDynamic("fileName")(fileName)
    __obj.updateDynamic("imports")(imports)
    __obj.updateDynamic("isDynamicEntry")(isDynamicEntry)
    __obj.updateDynamic("isEntry")(isEntry)
    __obj.updateDynamic("modules")(modules)
    __obj.updateDynamic("name")(name)
    if (facadeModuleId != null) __obj.updateDynamic("facadeModuleId")(facadeModuleId)
    if (map != null) __obj.updateDynamic("map")(map)
    __obj.asInstanceOf[OutputChunk]
  }
}

