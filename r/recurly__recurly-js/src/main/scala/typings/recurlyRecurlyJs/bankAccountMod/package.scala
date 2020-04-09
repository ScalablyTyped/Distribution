package typings.recurlyRecurlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bankAccountMod {
  type BankInfo = js.Function2[
    /* bankInfoOptions */ typings.recurlyRecurlyJs.bankAccountMod.BankInfoOptions, 
    /* BankInfoHandler */ typings.recurlyRecurlyJs.bankAccountMod.BankInfoHandler, 
    scala.Unit
  ]
  type BankInfoHandler = js.Function2[
    /* err */ typings.recurlyRecurlyJs.errorMod.RecurlyError, 
    /* bankInfo */ typings.recurlyRecurlyJs.bankAccountMod.BankInfoPayload, 
    scala.Unit
  ]
}
