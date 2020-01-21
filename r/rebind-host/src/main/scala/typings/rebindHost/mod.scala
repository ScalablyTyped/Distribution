package typings.rebindHost

import typings.express.mod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rebind-host", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(): Handler = js.native
  def apply(forceHost: String): Handler = js.native
}

