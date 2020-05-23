package typings.recurlyRecurlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object giftCardMod {
  type Done = js.Function2[
    /* error */ typings.recurlyRecurlyJs.errorMod.RecurlyError, 
    /* result */ typings.recurlyRecurlyJs.giftCardMod.GiftCardResult, 
    scala.Unit
  ]
  type GiftCard = js.Function2[
    /* giftCardOptions */ typings.recurlyRecurlyJs.giftCardMod.GiftCardOptions, 
    /* done */ typings.recurlyRecurlyJs.giftCardMod.Done, 
    scala.Unit
  ]
}
