package typings.snykGoPlugin

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-go-plugin/dist/errors/custom-error", JSImport.Namespace)
@js.native
object customErrorMod extends js.Object {
  @js.native
  class CustomError protected () extends Error {
    def this(message: String) = this()
    var code: js.UndefOr[Double] = js.native
    var innerError: js.Any = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    var strCode: js.UndefOr[String] = js.native
    var userMessage: js.UndefOr[String] = js.native
  }
  
}

