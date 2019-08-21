package typings.rollup.rollupMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreRenderedChunk extends js.Object {
  var dynamicImports: js.Array[String]
  var exports: js.Array[String]
  var facadeModuleId: String | Null
  var imports: js.Array[String]
  var isDynamicEntry: Boolean
  var isEntry: Boolean
  var modules: StringDictionary[RenderedModule]
  var name: String
}

object PreRenderedChunk {
  @scala.inline
  def apply(
    dynamicImports: js.Array[String],
    exports: js.Array[String],
    imports: js.Array[String],
    isDynamicEntry: Boolean,
    isEntry: Boolean,
    modules: StringDictionary[RenderedModule],
    name: String,
    facadeModuleId: String = null
  ): PreRenderedChunk = {
    val __obj = js.Dynamic.literal(dynamicImports = dynamicImports, exports = exports, imports = imports, isDynamicEntry = isDynamicEntry, isEntry = isEntry, modules = modules, name = name)
    if (facadeModuleId != null) __obj.updateDynamic("facadeModuleId")(facadeModuleId)
    __obj.asInstanceOf[PreRenderedChunk]
  }
}

