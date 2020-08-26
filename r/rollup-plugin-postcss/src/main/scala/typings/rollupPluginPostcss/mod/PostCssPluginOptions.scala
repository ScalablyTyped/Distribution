package typings.rollupPluginPostcss.mod

import typings.cssnano.mod.CssNanoOptions
import typings.rollupPluginPostcss.anon.Ctx
import typings.rollupPluginPostcss.anon.InsertAt
import typings.rollupPluginPostcss.rollupPluginPostcssStrings.`inline`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostCssPluginOptions extends js.Object {
  var autoModules: js.UndefOr[Boolean] = js.native
  var config: js.UndefOr[Boolean | Ctx] = js.native
  var exec: js.UndefOr[Boolean] = js.native
  var extensions: js.UndefOr[js.Array[String]] = js.native
  var extract: js.UndefOr[Boolean | String] = js.native
  var inject: js.UndefOr[Boolean | InsertAt] = js.native
  var loaders: js.UndefOr[js.Array[_]] = js.native
  var minimize: js.UndefOr[Boolean | CssNanoOptions] = js.native
  var modules: js.UndefOr[Boolean | js.Any] = js.native
  var name: js.UndefOr[js.Array[_ | js.Array[_]]] = js.native
  var namedExports: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit | Boolean]] = js.native
  var onImport: js.UndefOr[js.Function1[/* id */ js.Any, Unit]] = js.native
  var parser: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit | String]] = js.native
  var plugins: js.UndefOr[js.Array[_]] = js.native
  var sourceMap: js.UndefOr[Boolean | `inline`] = js.native
  var stringifier: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit | String]] = js.native
  var syntax: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit | String]] = js.native
}

object PostCssPluginOptions {
  @scala.inline
  def apply(): PostCssPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostCssPluginOptions]
  }
  @scala.inline
  implicit class PostCssPluginOptionsOps[Self <: PostCssPluginOptions] (val x: Self) extends AnyVal {
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
    def setAutoModules(value: Boolean): Self = this.set("autoModules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoModules: Self = this.set("autoModules", js.undefined)
    @scala.inline
    def setConfig(value: Boolean | Ctx): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setExec(value: Boolean): Self = this.set("exec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExec: Self = this.set("exec", js.undefined)
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setExtract(value: Boolean | String): Self = this.set("extract", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtract: Self = this.set("extract", js.undefined)
    @scala.inline
    def setInject(value: Boolean | InsertAt): Self = this.set("inject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInject: Self = this.set("inject", js.undefined)
    @scala.inline
    def setLoadersVarargs(value: js.Any*): Self = this.set("loaders", js.Array(value :_*))
    @scala.inline
    def setLoaders(value: js.Array[_]): Self = this.set("loaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoaders: Self = this.set("loaders", js.undefined)
    @scala.inline
    def setMinimize(value: Boolean | CssNanoOptions): Self = this.set("minimize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimize: Self = this.set("minimize", js.undefined)
    @scala.inline
    def setModules(value: Boolean | js.Any): Self = this.set("modules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
    @scala.inline
    def setNameVarargs(value: (js.Any | js.Array[js.Any])*): Self = this.set("name", js.Array(value :_*))
    @scala.inline
    def setName(value: js.Array[_ | js.Array[_]]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNamedExports(value: /* repeated */ js.Any => Unit | Boolean): Self = this.set("namedExports", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNamedExports: Self = this.set("namedExports", js.undefined)
    @scala.inline
    def setOnImport(value: /* id */ js.Any => Unit): Self = this.set("onImport", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnImport: Self = this.set("onImport", js.undefined)
    @scala.inline
    def setParser(value: /* repeated */ js.Any => Unit | String): Self = this.set("parser", js.Any.fromFunction1(value))
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
    @scala.inline
    def setPluginsVarargs(value: js.Any*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: js.Array[_]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setSourceMap(value: Boolean | `inline`): Self = this.set("sourceMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMap: Self = this.set("sourceMap", js.undefined)
    @scala.inline
    def setStringifier(value: /* repeated */ js.Any => Unit | String): Self = this.set("stringifier", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStringifier: Self = this.set("stringifier", js.undefined)
    @scala.inline
    def setSyntax(value: /* repeated */ js.Any => Unit | String): Self = this.set("syntax", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSyntax: Self = this.set("syntax", js.undefined)
  }
  
}

