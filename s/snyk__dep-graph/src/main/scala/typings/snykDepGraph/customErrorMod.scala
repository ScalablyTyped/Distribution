package typings.snykDepGraph

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/dep-graph/dist/core/errors/custom-error", JSImport.Namespace)
@js.native
object customErrorMod extends js.Object {
  @js.native
  class CustomError protected () extends Error {
    def this(message: String) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
}

