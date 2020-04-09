package typings.recurlyRecurlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object adyenMod {
  type Adyen = js.Function1[
    /* adyenOptions */ js.UndefOr[typings.recurlyRecurlyJs.adyenMod.AdyenOptions], 
    typings.recurlyRecurlyJs.adyenMod.AdyenInstance
  ]
}
