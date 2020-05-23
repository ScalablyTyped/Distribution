package typings.snykComposerLockfileParser

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/composer-lockfile-parser/dist/errors/parse-error", JSImport.Namespace)
@js.native
object parseErrorMod extends js.Object {
  @js.native
  class ParseError protected () extends Error {
    def this(message: String) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
}

