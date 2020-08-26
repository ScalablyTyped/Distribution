package typings.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RollupWarning extends RollupLogProps {
  var chunkName: js.UndefOr[String] = js.native
  var cycle: js.UndefOr[js.Array[String]] = js.native
  var exportName: js.UndefOr[String] = js.native
  var exporter: js.UndefOr[String] = js.native
  var guess: js.UndefOr[String] = js.native
  var importer: js.UndefOr[String] = js.native
  var missing: js.UndefOr[String] = js.native
  var modules: js.UndefOr[js.Array[String]] = js.native
  var names: js.UndefOr[js.Array[String]] = js.native
  var reexporter: js.UndefOr[String] = js.native
  var source: js.UndefOr[String] = js.native
  var sources: js.UndefOr[js.Array[String]] = js.native
}

object RollupWarning {
  @scala.inline
  def apply(message: String): RollupWarning = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupWarning]
  }
  @scala.inline
  implicit class RollupWarningOps[Self <: RollupWarning] (val x: Self) extends AnyVal {
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
    def setChunkName(value: String): Self = this.set("chunkName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChunkName: Self = this.set("chunkName", js.undefined)
    @scala.inline
    def setCycleVarargs(value: String*): Self = this.set("cycle", js.Array(value :_*))
    @scala.inline
    def setCycle(value: js.Array[String]): Self = this.set("cycle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCycle: Self = this.set("cycle", js.undefined)
    @scala.inline
    def setExportName(value: String): Self = this.set("exportName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportName: Self = this.set("exportName", js.undefined)
    @scala.inline
    def setExporter(value: String): Self = this.set("exporter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExporter: Self = this.set("exporter", js.undefined)
    @scala.inline
    def setGuess(value: String): Self = this.set("guess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuess: Self = this.set("guess", js.undefined)
    @scala.inline
    def setImporter(value: String): Self = this.set("importer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImporter: Self = this.set("importer", js.undefined)
    @scala.inline
    def setMissing(value: String): Self = this.set("missing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMissing: Self = this.set("missing", js.undefined)
    @scala.inline
    def setModulesVarargs(value: String*): Self = this.set("modules", js.Array(value :_*))
    @scala.inline
    def setModules(value: js.Array[String]): Self = this.set("modules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
    @scala.inline
    def setNamesVarargs(value: String*): Self = this.set("names", js.Array(value :_*))
    @scala.inline
    def setNames(value: js.Array[String]): Self = this.set("names", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNames: Self = this.set("names", js.undefined)
    @scala.inline
    def setReexporter(value: String): Self = this.set("reexporter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReexporter: Self = this.set("reexporter", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setSourcesVarargs(value: String*): Self = this.set("sources", js.Array(value :_*))
    @scala.inline
    def setSources(value: js.Array[String]): Self = this.set("sources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSources: Self = this.set("sources", js.undefined)
  }
  
}

