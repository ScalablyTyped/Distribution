package typings
package slonikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Handler extends js.Object {
  def transaction(handler: slonikLib.slonikMod.TransactionFunctionType): js.Promise[_]
}

object Anon_Handler {
  @scala.inline
  def apply(transaction: js.Function1[slonikLib.slonikMod.TransactionFunctionType, js.Promise[_]]): Anon_Handler = {
    val __obj = js.Dynamic.literal(transaction = transaction)
  
    __obj.asInstanceOf[Anon_Handler]
  }
}

