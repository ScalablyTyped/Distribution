package typings.rollup.mod

import org.scalablytyped.runtime.StringDictionary
import typings.rollup.rollupStrings.chunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderedChunk extends PreRenderedChunk {
  var code: js.UndefOr[String] = js.native
  var dynamicImports: js.Array[String] = js.native
  var fileName: String = js.native
  var implicitlyLoadedBefore: js.Array[String] = js.native
  var imports: js.Array[String] = js.native
  var map: js.UndefOr[SourceMap] = js.native
  var referencedFiles: js.Array[String] = js.native
}

object RenderedChunk {
  @scala.inline
  def apply(
    dynamicImports: js.Array[String],
    exports: js.Array[String],
    fileName: String,
    implicitlyLoadedBefore: js.Array[String],
    imports: js.Array[String],
    isDynamicEntry: Boolean,
    isEntry: Boolean,
    isImplicitEntry: Boolean,
    modules: StringDictionary[RenderedModule],
    name: String,
    referencedFiles: js.Array[String],
    `type`: chunk
  ): RenderedChunk = {
    val __obj = js.Dynamic.literal(dynamicImports = dynamicImports.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], implicitlyLoadedBefore = implicitlyLoadedBefore.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], isDynamicEntry = isDynamicEntry.asInstanceOf[js.Any], isEntry = isEntry.asInstanceOf[js.Any], isImplicitEntry = isImplicitEntry.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], referencedFiles = referencedFiles.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderedChunk]
  }
  @scala.inline
  implicit class RenderedChunkOps[Self <: RenderedChunk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDynamicImportsVarargs(value: String*): Self = this.set("dynamicImports", js.Array(value :_*))
    @scala.inline
    def setDynamicImports(value: js.Array[String]): Self = this.set("dynamicImports", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setImplicitlyLoadedBeforeVarargs(value: String*): Self = this.set("implicitlyLoadedBefore", js.Array(value :_*))
    @scala.inline
    def setImplicitlyLoadedBefore(value: js.Array[String]): Self = this.set("implicitlyLoadedBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def setImportsVarargs(value: String*): Self = this.set("imports", js.Array(value :_*))
    @scala.inline
    def setImports(value: js.Array[String]): Self = this.set("imports", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferencedFilesVarargs(value: String*): Self = this.set("referencedFiles", js.Array(value :_*))
    @scala.inline
    def setReferencedFiles(value: js.Array[String]): Self = this.set("referencedFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setMap(value: SourceMap): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
  }
  
}

