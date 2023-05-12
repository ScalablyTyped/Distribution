package typings.sentryInternalTracing

import typings.sentryTypes.typesTransactionMod.Transaction
import typings.sentryTypes.typesTransactionMod.TransactionContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBrowserRouterMod {
  
  @JSImport("@sentry-internal/tracing/types/browser/router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def instrumentRoutingWithDefaults[T /* <: Transaction */](customStartTransaction: js.Function1[/* context */ TransactionContext, js.UndefOr[T]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("instrumentRoutingWithDefaults")(customStartTransaction.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def instrumentRoutingWithDefaults[T /* <: Transaction */](
    customStartTransaction: js.Function1[/* context */ TransactionContext, js.UndefOr[T]],
    startTransactionOnPageLoad: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("instrumentRoutingWithDefaults")(customStartTransaction.asInstanceOf[js.Any], startTransactionOnPageLoad.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def instrumentRoutingWithDefaults[T /* <: Transaction */](
    customStartTransaction: js.Function1[/* context */ TransactionContext, js.UndefOr[T]],
    startTransactionOnPageLoad: Boolean,
    startTransactionOnLocationChange: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("instrumentRoutingWithDefaults")(customStartTransaction.asInstanceOf[js.Any], startTransactionOnPageLoad.asInstanceOf[js.Any], startTransactionOnLocationChange.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def instrumentRoutingWithDefaults[T /* <: Transaction */](
    customStartTransaction: js.Function1[/* context */ TransactionContext, js.UndefOr[T]],
    startTransactionOnPageLoad: Unit,
    startTransactionOnLocationChange: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("instrumentRoutingWithDefaults")(customStartTransaction.asInstanceOf[js.Any], startTransactionOnPageLoad.asInstanceOf[js.Any], startTransactionOnLocationChange.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
