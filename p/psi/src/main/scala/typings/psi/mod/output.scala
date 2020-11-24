package typings.psi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("psi", "output")
@js.native
object output extends js.Object {
  
  /**
    * Output the formatted report to the terminal.
    */
  def apply(url: String): js.Promise[ResponseData] = js.native
  def apply(url: String, options: Options): js.Promise[ResponseData] = js.native
}
