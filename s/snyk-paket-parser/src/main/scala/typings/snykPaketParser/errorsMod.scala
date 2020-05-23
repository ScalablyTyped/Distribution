package typings.snykPaketParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-paket-parser/dist/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  @js.native
  class InvalidUserInputError protected ()
    extends typings.snykPaketParser.invalidUserInputErrorMod.InvalidUserInputError {
    def this(args: js.Any*) = this()
  }
  
  @js.native
  class OutOfSyncError protected ()
    extends typings.snykPaketParser.outOfSyncErrorMod.OutOfSyncError {
    def this(dependencyName: String) = this()
  }
  
}

