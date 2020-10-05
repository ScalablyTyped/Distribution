package typings.serveStatic.mod

import typings.expressServeStaticCore.mod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("serve-static", "serveStatic")
@js.native
object serveStatic extends js.Object {
  def apply(root: String): Handler = js.native
  def apply(root: String, options: ServeStaticOptions): Handler = js.native
}

