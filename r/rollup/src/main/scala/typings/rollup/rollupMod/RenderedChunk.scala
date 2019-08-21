package typings.rollup.rollupMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderedChunk extends PreRenderedChunk {
  var fileName: String
}

object RenderedChunk {
  @scala.inline
  def apply(
    dynamicImports: js.Array[String],
    exports: js.Array[String],
    fileName: String,
    imports: js.Array[String],
    isDynamicEntry: Boolean,
    isEntry: Boolean,
    modules: StringDictionary[RenderedModule],
    name: String,
    facadeModuleId: String = null
  ): RenderedChunk = {
    val __obj = js.Dynamic.literal(dynamicImports = dynamicImports, exports = exports, fileName = fileName, imports = imports, isDynamicEntry = isDynamicEntry, isEntry = isEntry, modules = modules, name = name)
    if (facadeModuleId != null) __obj.updateDynamic("facadeModuleId")(facadeModuleId)
    __obj.asInstanceOf[RenderedChunk]
  }
}

