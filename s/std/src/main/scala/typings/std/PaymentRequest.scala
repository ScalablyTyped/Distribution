package typings.std

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.std.stdStrings.shippingaddresschange
import typings.std.stdStrings.shippingoptionchange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Payment Request API interface is the primary access point into the API, and lets web content and apps accept payments from the end user. */
@js.native
trait PaymentRequest extends EventTarget {
  val id: java.lang.String = js.native
  var onshippingaddresschange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onshippingoptionchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  val shippingAddress: PaymentAddress | Null = js.native
  val shippingOption: java.lang.String | Null = js.native
  val shippingType: PaymentShippingType | Null = js.native
  def abort(): js.Promise[Unit] = js.native
  @JSName("addEventListener")
  def addEventListener_shippingaddresschange(`type`: shippingaddresschange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shippingaddresschange(
    `type`: shippingaddresschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shippingaddresschange(
    `type`: shippingaddresschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shippingoptionchange(`type`: shippingoptionchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shippingoptionchange(
    `type`: shippingoptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shippingoptionchange(
    `type`: shippingoptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def canMakePayment(): js.Promise[scala.Boolean] = js.native
  @JSName("removeEventListener")
  def removeEventListener_shippingaddresschange(`type`: shippingaddresschange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shippingaddresschange(
    `type`: shippingaddresschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shippingaddresschange(
    `type`: shippingaddresschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shippingoptionchange(`type`: shippingoptionchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shippingoptionchange(
    `type`: shippingoptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shippingoptionchange(
    `type`: shippingoptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  def show(): js.Promise[PaymentResponse] = js.native
}

@JSGlobal("PaymentRequest")
@js.native
class PaymentRequestCls protected () extends PaymentRequest {
  def this(methodData: js.Array[PaymentMethodData], details: PaymentDetailsInit) = this()
  def this(methodData: js.Array[PaymentMethodData], details: PaymentDetailsInit, options: PaymentOptions) = this()
}

@JSGlobal("PaymentRequest")
@js.native
object PaymentRequest
  extends Instantiable2[
      /* methodData */ js.Array[PaymentMethodData], 
      /* details */ PaymentDetailsInit, 
      PaymentRequest
    ]
     with Instantiable3[
      /* methodData */ js.Array[PaymentMethodData], 
      /* details */ PaymentDetailsInit, 
      /* options */ PaymentOptions, 
      PaymentRequest
    ]

