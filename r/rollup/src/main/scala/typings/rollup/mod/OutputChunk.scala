package typings.rollup.mod

import org.scalablytyped.runtime.StringDictionary
import typings.rollup.rollupStrings.chunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputChunk extends RenderedChunk {
  var code: String
  var map: js.UndefOr[SourceMap] = js.undefined
  var `type`: chunk
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
    `type`: chunk,
    facadeModuleId: String = null,
    map: SourceMap = null
  ): OutputChunk = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], dynamicImports = dynamicImports.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], isDynamicEntry = isDynamicEntry.asInstanceOf[js.Any], isEntry = isEntry.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (facadeModuleId != null) __obj.updateDynamic("facadeModuleId")(facadeModuleId.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputChunk]
  }
}

