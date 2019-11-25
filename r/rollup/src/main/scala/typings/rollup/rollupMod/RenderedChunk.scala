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
    val __obj = js.Dynamic.literal(dynamicImports = dynamicImports.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], isDynamicEntry = isDynamicEntry.asInstanceOf[js.Any], isEntry = isEntry.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (facadeModuleId != null) __obj.updateDynamic("facadeModuleId")(facadeModuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderedChunk]
  }
}

