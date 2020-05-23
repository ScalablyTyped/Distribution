package typings.snykComposerLockfileParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/composer-lockfile-parser/dist/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  @js.native
  class InvalidUserInputError protected ()
    extends typings.snykComposerLockfileParser.invalidUserInputErrorMod.InvalidUserInputError {
    def this(message: String) = this()
  }
  
  @js.native
  class ParseError protected ()
    extends typings.snykComposerLockfileParser.parseErrorMod.ParseError {
    def this(message: String) = this()
  }
  
}

