package typings.reactDevUtils.webpackDevServerUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCompilerOptions extends js.Object {
  /**
    * The name that will be printed to the terminal.
    */
  var appName: String = js.native
  /**
    * The webpack configuration options to be provided to the webpack constructor.
    */
  var config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ js.Any = js.native
  /**
    * To provide the `urls` argument, use `prepareUrls()` described below.
    */
  var urls: Urls = js.native
  /**
    * If `true`; yarn instructions will be emitted in the terminal instead of npm.
    */
  var useYarn: js.UndefOr[Boolean] = js.native
  /**
    * Takes the `require('webpack')` entry point.
    */
  var webpack: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof webpack */ js.Any = js.native
}

object CreateCompilerOptions {
  @scala.inline
  def apply(
    appName: String,
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ js.Any,
    urls: Urls,
    webpack: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof webpack */ js.Any
  ): CreateCompilerOptions = {
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any], webpack = webpack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCompilerOptions]
  }
  @scala.inline
  implicit class CreateCompilerOptionsOps[Self <: CreateCompilerOptions] (val x: Self) extends AnyVal {
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
    def setAppName(value: String): Self = this.set("appName", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfig(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ js.Any
    ): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrls(value: Urls): Self = this.set("urls", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebpack(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof webpack */ js.Any): Self = this.set("webpack", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseYarn(value: Boolean): Self = this.set("useYarn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseYarn: Self = this.set("useYarn", js.undefined)
  }
  
}

