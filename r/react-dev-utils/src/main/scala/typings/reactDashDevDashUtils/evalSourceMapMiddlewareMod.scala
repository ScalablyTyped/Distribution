package typings.reactDashDevDashUtils

import typings.express.expressMod.Handler
import typings.webpackDashDevDashServer.webpackDashDevDashServerMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dev-utils/evalSourceMapMiddleware", JSImport.Namespace)
@js.native
object evalSourceMapMiddlewareMod extends js.Object {
  /*
    * Middleware responsible for retrieving a generated source
    * Receives a webpack internal url: "webpack-internal:///<module-id>"
    * Returns a generated source: "<source-text><sourceMappingURL><sourceURL>"
    */
  def apply(server: ^): Handler = js.native
}

