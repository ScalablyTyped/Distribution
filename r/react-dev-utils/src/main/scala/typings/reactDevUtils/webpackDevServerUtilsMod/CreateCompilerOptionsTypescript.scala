package typings.reactDevUtils.webpackDevServerUtilsMod

import typings.reactDevUtils.anon.Errors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCompilerOptionsTypescript extends CreateCompilerOptions {
  /**
    * Required if useTypeScript is `true`.
    * This is useful when running fork-ts-checker-webpack-plugin with `async: true` to
    * report errors that are emitted after the webpack build is complete.
    */
  var devSocket: Errors = js.native
  /**
    * If `true`, TypeScript type checking will be enabled.
    * Be sure to provide the `devSocket` argument above if this is set to `true`.
    */
  var useTypeScript: Boolean = js.native
}

object CreateCompilerOptionsTypescript {
  @scala.inline
  def apply(
    appName: String,
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ js.Any,
    devSocket: Errors,
    urls: Urls,
    useTypeScript: Boolean,
    webpack: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof webpack */ js.Any
  ): CreateCompilerOptionsTypescript = {
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], devSocket = devSocket.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any], useTypeScript = useTypeScript.asInstanceOf[js.Any], webpack = webpack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCompilerOptionsTypescript]
  }
  @scala.inline
  implicit class CreateCompilerOptionsTypescriptOps[Self <: CreateCompilerOptionsTypescript] (val x: Self) extends AnyVal {
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
    def setDevSocket(value: Errors): Self = this.set("devSocket", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseTypeScript(value: Boolean): Self = this.set("useTypeScript", value.asInstanceOf[js.Any])
  }
  
}

