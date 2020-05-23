package typings.snykDepGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/dep-graph/dist/core/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  @js.native
  class ValidationError protected ()
    extends typings.snykDepGraph.validationErrorMod.ValidationError {
    def this(message: String) = this()
  }
  
}

