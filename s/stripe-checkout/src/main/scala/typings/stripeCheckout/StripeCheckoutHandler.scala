package typings.stripeCheckout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StripeCheckoutHandler extends js.Object {
  
  def close(): Unit = js.native
  
  def open(): Unit = js.native
  def open(options: StripeCheckoutOptions): Unit = js.native
}
