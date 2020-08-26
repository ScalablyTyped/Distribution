package typings.sourceMap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawSourceMap extends js.Object {
  var file: String = js.native
  var mappings: String = js.native
  var names: js.Array[String] = js.native
  var sourceRoot: js.UndefOr[String] = js.native
  var sources: js.Array[String] = js.native
  var sourcesContent: js.UndefOr[js.Array[String]] = js.native
  var version: Double = js.native
}

object RawSourceMap {
  @scala.inline
  def apply(
    file: String,
    mappings: String,
    names: js.Array[String],
    sources: js.Array[String],
    version: Double
  ): RawSourceMap = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawSourceMap]
  }
  @scala.inline
  implicit class RawSourceMapOps[Self <: RawSourceMap] (val x: Self) extends AnyVal {
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
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setMappings(value: String): Self = this.set("mappings", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamesVarargs(value: String*): Self = this.set("names", js.Array(value :_*))
    @scala.inline
    def setNames(value: js.Array[String]): Self = this.set("names", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourcesVarargs(value: String*): Self = this.set("sources", js.Array(value :_*))
    @scala.inline
    def setSources(value: js.Array[String]): Self = this.set("sources", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceRoot(value: String): Self = this.set("sourceRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceRoot: Self = this.set("sourceRoot", js.undefined)
    @scala.inline
    def setSourcesContentVarargs(value: String*): Self = this.set("sourcesContent", js.Array(value :_*))
    @scala.inline
    def setSourcesContent(value: js.Array[String]): Self = this.set("sourcesContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourcesContent: Self = this.set("sourcesContent", js.undefined)
  }
  
}

