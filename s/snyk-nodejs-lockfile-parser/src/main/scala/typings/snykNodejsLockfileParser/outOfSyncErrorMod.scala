package typings.snykNodejsLockfileParser

import typings.snykNodejsLockfileParser.snykNodejsLockfileParserStrings.npm
import typings.snykNodejsLockfileParser.snykNodejsLockfileParserStrings.yarn
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-nodejs-lockfile-parser/dist/errors/out-of-sync-error", JSImport.Namespace)
@js.native
object outOfSyncErrorMod extends js.Object {
  @js.native
  class OutOfSyncError protected () extends Error {
    def this(dependencyName: String, lockFileType: npm) = this()
    def this(dependencyName: String, lockFileType: yarn) = this()
    var code: Double = js.native
    var dependencyName: String = js.native
    var lockFileType: String = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
}

