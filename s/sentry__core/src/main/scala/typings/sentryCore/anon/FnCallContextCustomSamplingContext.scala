package typings.sentryCore.anon

import typings.sentryTypes.typesTransactionMod.CustomSamplingContext
import typings.sentryTypes.typesTransactionMod.Transaction
import typings.sentryTypes.typesTransactionMod.TransactionContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallContextCustomSamplingContext extends StObject {
  
  def apply(context: TransactionContext): Transaction = js.native
  def apply(context: TransactionContext, customSamplingContext: CustomSamplingContext): Transaction = js.native
}
