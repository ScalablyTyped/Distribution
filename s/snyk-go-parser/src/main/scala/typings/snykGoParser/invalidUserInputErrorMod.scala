package typings.snykGoParser

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-go-parser/dist/errors/invalid-user-input-error", JSImport.Namespace)
@js.native
object invalidUserInputErrorMod extends js.Object {
  @js.native
  class InvalidUserInputError protected () extends Error {
    def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any) = this()
    var code: Double = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
}

