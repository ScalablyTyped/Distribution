package typings.sawtoothSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "processor")
@js.native
object processor extends js.Object {
  
  @js.native
  class TransactionProcessor protected ()
    extends typings.sawtoothSdk.processorMod.TransactionProcessor {
    /** Constructs a new TransactionProcessor */
    def this(url: String) = this()
  }
}
