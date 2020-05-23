package typings.snykNodejsLockfileParser

import typings.snykNodejsLockfileParser.snykNodejsLockfileParserStrings.npm
import typings.snykNodejsLockfileParser.snykNodejsLockfileParserStrings.yarn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-nodejs-lockfile-parser/dist/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  @js.native
  class InvalidUserInputError protected ()
    extends typings.snykNodejsLockfileParser.invalidUserInputErrorMod.InvalidUserInputError {
    def this(args: js.Any*) = this()
  }
  
  @js.native
  class OutOfSyncError protected ()
    extends typings.snykNodejsLockfileParser.outOfSyncErrorMod.OutOfSyncError {
    def this(dependencyName: String, lockFileType: npm) = this()
    def this(dependencyName: String, lockFileType: yarn) = this()
  }
  
  @js.native
  class TreeSizeLimitError ()
    extends typings.snykNodejsLockfileParser.treeSizeLimitErrorMod.TreeSizeLimitError
  
  @js.native
  class UnsupportedRuntimeError protected ()
    extends typings.snykNodejsLockfileParser.unsupportedRuntimeErrorMod.UnsupportedRuntimeError {
    def this(args: js.Any*) = this()
  }
  
}

