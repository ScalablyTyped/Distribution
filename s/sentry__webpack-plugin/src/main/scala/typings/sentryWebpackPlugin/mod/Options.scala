package typings.sentryWebpackPlugin.mod

import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var configFile: js.UndefOr[String] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var dryRun: js.UndefOr[Boolean] = js.native
  var entries: js.UndefOr[js.Array[_] | RegExp | EntriesFunction] = js.native
  var errorHandler: js.UndefOr[ErrorHandlerFunction] = js.native
  var ext: js.UndefOr[js.Array[String]] = js.native
  var ignore: js.UndefOr[String | js.Array[String]] = js.native
  var ignoreFile: js.UndefOr[String] = js.native
  var include: String | js.Array[String] = js.native
  var release: js.UndefOr[String] = js.native
  var rewrite: js.UndefOr[Boolean] = js.native
  var setCommits: js.UndefOr[SetCommitsOptions] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var sourceMapReference: js.UndefOr[Boolean] = js.native
  var stripCommonPrefix: js.UndefOr[Boolean] = js.native
  var stripPrefix: js.UndefOr[js.Array[js.Any]] = js.native
  var urlPrefix: js.UndefOr[String] = js.native
  var urlSuffix: js.UndefOr[String] = js.native
  var validate: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(include: String | js.Array[String]): Options = {
    val __obj = js.Dynamic.literal(include = include.asInstanceOf[js.Any])
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
    def setIncludeVarargs(value: String*): Self = this.set("include", js.Array(value :_*))
    @scala.inline
    def setInclude(value: String | js.Array[String]): Self = this.set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigFile(value: String): Self = this.set("configFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigFile: Self = this.set("configFile", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("dryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("dryRun", js.undefined)
    @scala.inline
    def setEntriesVarargs(value: js.Any*): Self = this.set("entries", js.Array(value :_*))
    @scala.inline
    def setEntriesFunction1(value: /* key */ String => Boolean): Self = this.set("entries", js.Any.fromFunction1(value))
    @scala.inline
    def setEntries(value: js.Array[_] | RegExp | EntriesFunction): Self = this.set("entries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
    @scala.inline
    def setErrorHandler(value: (/* err */ Error, /* invokeErr */ js.Function0[Unit]) => Unit): Self = this.set("errorHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteErrorHandler: Self = this.set("errorHandler", js.undefined)
    @scala.inline
    def setExtVarargs(value: String*): Self = this.set("ext", js.Array(value :_*))
    @scala.inline
    def setExt(value: js.Array[String]): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
    @scala.inline
    def setIgnoreVarargs(value: String*): Self = this.set("ignore", js.Array(value :_*))
    @scala.inline
    def setIgnore(value: String | js.Array[String]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setIgnoreFile(value: String): Self = this.set("ignoreFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreFile: Self = this.set("ignoreFile", js.undefined)
    @scala.inline
    def setRelease(value: String): Self = this.set("release", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelease: Self = this.set("release", js.undefined)
    @scala.inline
    def setRewrite(value: Boolean): Self = this.set("rewrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRewrite: Self = this.set("rewrite", js.undefined)
    @scala.inline
    def setSetCommits(value: SetCommitsOptions): Self = this.set("setCommits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetCommits: Self = this.set("setCommits", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setSourceMapReference(value: Boolean): Self = this.set("sourceMapReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMapReference: Self = this.set("sourceMapReference", js.undefined)
    @scala.inline
    def setStripCommonPrefix(value: Boolean): Self = this.set("stripCommonPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripCommonPrefix: Self = this.set("stripCommonPrefix", js.undefined)
    @scala.inline
    def setStripPrefixVarargs(value: js.Any*): Self = this.set("stripPrefix", js.Array(value :_*))
    @scala.inline
    def setStripPrefix(value: js.Array[js.Any]): Self = this.set("stripPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripPrefix: Self = this.set("stripPrefix", js.undefined)
    @scala.inline
    def setUrlPrefix(value: String): Self = this.set("urlPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlPrefix: Self = this.set("urlPrefix", js.undefined)
    @scala.inline
    def setUrlSuffix(value: String): Self = this.set("urlSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlSuffix: Self = this.set("urlSuffix", js.undefined)
    @scala.inline
    def setValidate(value: Boolean): Self = this.set("validate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
  
}

