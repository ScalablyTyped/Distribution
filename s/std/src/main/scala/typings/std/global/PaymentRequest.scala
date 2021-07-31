package typings.std.global

import typings.std.PaymentDetailsInit
import typings.std.PaymentMethodData
import typings.std.PaymentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("PaymentRequest")
@js.native
class PaymentRequest protected ()
  extends StObject
     with typings.std.PaymentRequest {
  def this(methodData: js.Array[PaymentMethodData], details: PaymentDetailsInit) = this()
  def this(methodData: js.Array[PaymentMethodData], details: PaymentDetailsInit, options: PaymentOptions) = this()
}
