package typings.recurlyRecurlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object paypalMod {
  type PayPal = js.Function1[
    /* config */ js.UndefOr[typings.recurlyRecurlyJs.paypalMod.PayPalConfig], 
    typings.recurlyRecurlyJs.paypalMod.PayPalInstance
  ]
}
