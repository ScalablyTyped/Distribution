package typings.snykComposerLockfileParser

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/composer-lockfile-parser/dist/errors/invalid-user-input-error", JSImport.Namespace)
@js.native
object invalidUserInputErrorMod extends js.Object {
  @js.native
  class InvalidUserInputError protected () extends Error {
    def this(message: String) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
}

