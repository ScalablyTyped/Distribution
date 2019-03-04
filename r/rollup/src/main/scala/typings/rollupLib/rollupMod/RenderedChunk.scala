package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderedChunk extends js.Object {
  var dynamicImports: js.Array[java.lang.String]
  var exports: js.Array[java.lang.String]
  var facadeModuleId: java.lang.String | scala.Null
  var fileName: java.lang.String
  var imports: js.Array[java.lang.String]
  var isDynamicEntry: scala.Boolean
  var isEntry: scala.Boolean
  var modules: org.scalablytyped.runtime.StringDictionary[RenderedModule]
  var name: java.lang.String
}

object RenderedChunk {
  @scala.inline
  def apply(
    dynamicImports: js.Array[java.lang.String],
    exports: js.Array[java.lang.String],
    fileName: java.lang.String,
    imports: js.Array[java.lang.String],
    isDynamicEntry: scala.Boolean,
    isEntry: scala.Boolean,
    modules: org.scalablytyped.runtime.StringDictionary[RenderedModule],
    name: java.lang.String,
    facadeModuleId: java.lang.String = null
  ): RenderedChunk = {
    val __obj = js.Dynamic.literal(dynamicImports = dynamicImports, exports = exports, fileName = fileName, imports = imports, isDynamicEntry = isDynamicEntry, isEntry = isEntry, modules = modules, name = name)
    if (facadeModuleId != null) __obj.updateDynamic("facadeModuleId")(facadeModuleId)
    __obj.asInstanceOf[RenderedChunk]
  }
}

