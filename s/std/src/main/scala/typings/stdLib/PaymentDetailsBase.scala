package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PaymentDetailsBase extends js.Object {
  var displayItems: js.UndefOr[js.Array[PaymentItem]] = js.undefined
  var modifiers: js.UndefOr[js.Array[PaymentDetailsModifier]] = js.undefined
  var shippingOptions: js.UndefOr[js.Array[PaymentShippingOption]] = js.undefined
}

