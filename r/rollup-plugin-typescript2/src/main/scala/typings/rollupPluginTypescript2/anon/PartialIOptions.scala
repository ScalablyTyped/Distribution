package typings.rollupPluginTypescript2.anon

import typings.rollupPluginTypescript2.ioptionsMod.TransformerFactoryCreator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rollup-plugin-typescript2.rollup-plugin-typescript2/dist/partial.Partial<rollup-plugin-typescript2.rollup-plugin-typescript2/dist/ioptions.IOptions> */
@js.native
trait PartialIOptions extends js.Object {
  var abortOnError: js.UndefOr[Boolean] = js.native
  var cacheRoot: js.UndefOr[String] = js.native
  var check: js.UndefOr[Boolean] = js.native
  var clean: js.UndefOr[Boolean] = js.native
  var cwd: js.UndefOr[String] = js.native
  var exclude: js.UndefOr[String | js.Array[String]] = js.native
  var include: js.UndefOr[String | js.Array[String]] = js.native
  var objectHashIgnoreUnknownHack: js.UndefOr[Boolean] = js.native
  var rollupCommonJSResolveHack: js.UndefOr[Boolean] = js.native
  var sourceMapCallback: js.UndefOr[js.Function2[/* id */ String, /* map */ String, Unit]] = js.native
  var transformers: js.UndefOr[js.Array[TransformerFactoryCreator]] = js.native
  var tsconfig: js.UndefOr[String] = js.native
  var tsconfigDefaults: js.UndefOr[js.Any] = js.native
  var tsconfigOverride: js.UndefOr[js.Any] = js.native
  var typescript: js.UndefOr[TypeoftsTypes] = js.native
  var useTsconfigDeclarationDir: js.UndefOr[Boolean] = js.native
  var verbosity: js.UndefOr[Double] = js.native
}

object PartialIOptions {
  @scala.inline
  def apply(): PartialIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIOptions]
  }
  @scala.inline
  implicit class PartialIOptionsOps[Self <: PartialIOptions] (val x: Self) extends AnyVal {
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
    def setAbortOnError(value: Boolean): Self = this.set("abortOnError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbortOnError: Self = this.set("abortOnError", js.undefined)
    @scala.inline
    def setCacheRoot(value: String): Self = this.set("cacheRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheRoot: Self = this.set("cacheRoot", js.undefined)
    @scala.inline
    def setCheck(value: Boolean): Self = this.set("check", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheck: Self = this.set("check", js.undefined)
    @scala.inline
    def setClean(value: Boolean): Self = this.set("clean", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClean: Self = this.set("clean", js.undefined)
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    @scala.inline
    def setExclude(value: String | js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setIncludeVarargs(value: String*): Self = this.set("include", js.Array(value :_*))
    @scala.inline
    def setInclude(value: String | js.Array[String]): Self = this.set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    @scala.inline
    def setObjectHashIgnoreUnknownHack(value: Boolean): Self = this.set("objectHashIgnoreUnknownHack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectHashIgnoreUnknownHack: Self = this.set("objectHashIgnoreUnknownHack", js.undefined)
    @scala.inline
    def setRollupCommonJSResolveHack(value: Boolean): Self = this.set("rollupCommonJSResolveHack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRollupCommonJSResolveHack: Self = this.set("rollupCommonJSResolveHack", js.undefined)
    @scala.inline
    def setSourceMapCallback(value: (/* id */ String, /* map */ String) => Unit): Self = this.set("sourceMapCallback", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSourceMapCallback: Self = this.set("sourceMapCallback", js.undefined)
    @scala.inline
    def setTransformersVarargs(value: TransformerFactoryCreator*): Self = this.set("transformers", js.Array(value :_*))
    @scala.inline
    def setTransformers(value: js.Array[TransformerFactoryCreator]): Self = this.set("transformers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformers: Self = this.set("transformers", js.undefined)
    @scala.inline
    def setTsconfig(value: String): Self = this.set("tsconfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTsconfig: Self = this.set("tsconfig", js.undefined)
    @scala.inline
    def setTsconfigDefaults(value: js.Any): Self = this.set("tsconfigDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTsconfigDefaults: Self = this.set("tsconfigDefaults", js.undefined)
    @scala.inline
    def setTsconfigOverride(value: js.Any): Self = this.set("tsconfigOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTsconfigOverride: Self = this.set("tsconfigOverride", js.undefined)
    @scala.inline
    def setTypescript(value: TypeoftsTypes): Self = this.set("typescript", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypescript: Self = this.set("typescript", js.undefined)
    @scala.inline
    def setUseTsconfigDeclarationDir(value: Boolean): Self = this.set("useTsconfigDeclarationDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseTsconfigDeclarationDir: Self = this.set("useTsconfigDeclarationDir", js.undefined)
    @scala.inline
    def setVerbosity(value: Double): Self = this.set("verbosity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbosity: Self = this.set("verbosity", js.undefined)
  }
  
}

