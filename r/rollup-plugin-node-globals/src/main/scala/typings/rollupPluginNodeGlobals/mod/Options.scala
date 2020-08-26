package typings.rollupPluginNodeGlobals.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var baseDir: js.UndefOr[String] = js.native
  var buffer: js.UndefOr[Boolean] = js.native
  var dirname: js.UndefOr[Boolean] = js.native
  var exclude: js.UndefOr[(js.Array[String | RegExp]) | String | RegExp | Null] = js.native
  var filename: js.UndefOr[Boolean] = js.native
  var global: js.UndefOr[Boolean] = js.native
  // Every files will be parsed by default, but you can specify which files to include or exclude
  var include: js.UndefOr[(js.Array[String | RegExp]) | String | RegExp | Null] = js.native
  // Plugin's options
  var process: js.UndefOr[Boolean] = js.native
  // Enable sourcemaps support
  var sourceMap: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setBaseDir(value: String): Self = this.set("baseDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseDir: Self = this.set("baseDir", js.undefined)
    @scala.inline
    def setBuffer(value: Boolean): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    @scala.inline
    def setDirname(value: Boolean): Self = this.set("dirname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirname: Self = this.set("dirname", js.undefined)
    @scala.inline
    def setExcludeVarargs(value: (String | RegExp)*): Self = this.set("exclude", js.Array(value :_*))
    @scala.inline
    def setExclude(value: (js.Array[String | RegExp]) | String | RegExp): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setExcludeNull: Self = this.set("exclude", null)
    @scala.inline
    def setFilename(value: Boolean): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setGlobal(value: Boolean): Self = this.set("global", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
    @scala.inline
    def setIncludeVarargs(value: (String | RegExp)*): Self = this.set("include", js.Array(value :_*))
    @scala.inline
    def setInclude(value: (js.Array[String | RegExp]) | String | RegExp): Self = this.set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    @scala.inline
    def setIncludeNull: Self = this.set("include", null)
    @scala.inline
    def setProcess(value: Boolean): Self = this.set("process", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcess: Self = this.set("process", js.undefined)
    @scala.inline
    def setSourceMap(value: Boolean): Self = this.set("sourceMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMap: Self = this.set("sourceMap", js.undefined)
  }
  
}

