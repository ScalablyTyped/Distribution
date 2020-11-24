package typings.recurlyRecurlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@recurly/recurly-js/lib/validate", JSImport.Namespace)
@js.native
object validateMod extends js.Object {
  
  @js.native
  trait Validate extends js.Object {
    
    def cardNumber(cardNumber: String): Boolean = js.native
    def cardNumber(cardNumber: Double): Boolean = js.native
    
    def cardType(cardNumber: String, partial: Boolean): Boolean = js.native
    def cardType(cardNumber: Double, partial: Boolean): Boolean = js.native
    
    def cvv(cvv: String): Boolean = js.native
    def cvv(cvv: Double): Boolean = js.native
    
    def expiry(month: String, year: String): Boolean = js.native
    def expiry(month: String, year: Double): Boolean = js.native
    def expiry(month: Double, year: String): Boolean = js.native
    def expiry(month: Double, year: Double): Boolean = js.native
  }
}
