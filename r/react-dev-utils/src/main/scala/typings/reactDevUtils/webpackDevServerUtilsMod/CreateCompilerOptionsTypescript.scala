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

