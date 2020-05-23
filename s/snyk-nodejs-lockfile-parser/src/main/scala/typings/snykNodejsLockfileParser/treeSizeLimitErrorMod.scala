package typings.snykNodejsLockfileParser

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-nodejs-lockfile-parser/dist/errors/tree-size-limit-error", JSImport.Namespace)
@js.native
object treeSizeLimitErrorMod extends js.Object {
  @js.native
  class TreeSizeLimitError () extends Error {
    var code: Double = js.native
    var currentTreeSize: js.Any = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
}

