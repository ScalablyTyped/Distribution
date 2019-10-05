package typings.puppeteer

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("puppeteer/Errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  @js.native
  class TimeoutError () extends Error {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
}

