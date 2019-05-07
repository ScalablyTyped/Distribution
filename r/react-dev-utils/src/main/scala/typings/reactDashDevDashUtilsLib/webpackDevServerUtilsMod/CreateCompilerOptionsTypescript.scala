package typings
package reactDashDevDashUtilsLib.webpackDevServerUtilsMod

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
  var devSocket: reactDashDevDashUtilsLib.Anon_Errors = js.native
  /**
    * If `true`, TypeScript type checking will be enabled.
    * Be sure to provide the `devSocket` argument above if this is set to `true`.
    */
  var useTypeScript: scala.Boolean = js.native
}

