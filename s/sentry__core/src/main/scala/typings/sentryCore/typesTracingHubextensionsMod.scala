package typings.sentryCore

import typings.sentryCore.typesHubMod.Hub
import typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction
import typings.sentryTypes.typesTransactionMod.CustomSamplingContext
import typings.sentryTypes.typesTransactionMod.TransactionContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTracingHubextensionsMod {
  
  @JSImport("@sentry/core/types/tracing/hubextensions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addTracingExtensions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addTracingExtensions")().asInstanceOf[Unit]
  
  inline def startIdleTransaction(hub: Hub, transactionContext: TransactionContext, idleTimeout: Double, finalTimeout: Double): IdleTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startIdleTransaction")(hub.asInstanceOf[js.Any], transactionContext.asInstanceOf[js.Any], idleTimeout.asInstanceOf[js.Any], finalTimeout.asInstanceOf[js.Any])).asInstanceOf[IdleTransaction]
  inline def startIdleTransaction(
    hub: Hub,
    transactionContext: TransactionContext,
    idleTimeout: Double,
    finalTimeout: Double,
    onScope: Boolean
  ): IdleTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startIdleTransaction")(hub.asInstanceOf[js.Any], transactionContext.asInstanceOf[js.Any], idleTimeout.asInstanceOf[js.Any], finalTimeout.asInstanceOf[js.Any], onScope.asInstanceOf[js.Any])).asInstanceOf[IdleTransaction]
  inline def startIdleTransaction(
    hub: Hub,
    transactionContext: TransactionContext,
    idleTimeout: Double,
    finalTimeout: Double,
    onScope: Boolean,
    customSamplingContext: Unit,
    heartbeatInterval: Double
  ): IdleTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startIdleTransaction")(hub.asInstanceOf[js.Any], transactionContext.asInstanceOf[js.Any], idleTimeout.asInstanceOf[js.Any], finalTimeout.asInstanceOf[js.Any], onScope.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any], heartbeatInterval.asInstanceOf[js.Any])).asInstanceOf[IdleTransaction]
  inline def startIdleTransaction(
    hub: Hub,
    transactionContext: TransactionContext,
    idleTimeout: Double,
    finalTimeout: Double,
    onScope: Boolean,
    customSamplingContext: CustomSamplingContext
  ): IdleTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startIdleTransaction")(hub.asInstanceOf[js.Any], transactionContext.asInstanceOf[js.Any], idleTimeout.asInstanceOf[js.Any], finalTimeout.asInstanceOf[js.Any], onScope.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any])).asInstanceOf[IdleTransaction]
  inline def startIdleTransaction(
    hub: Hub,
    transactionContext: TransactionContext,
    idleTimeout: Double,
    finalTimeout: Double,
    onScope: Boolean,
    customSamplingContext: CustomSamplingContext,
    heartbeatInterval: Double
  ): IdleTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startIdleTransaction")(hub.asInstanceOf[js.Any], transactionContext.asInstanceOf[js.Any], idleTimeout.asInstanceOf[js.Any], finalTimeout.asInstanceOf[js.Any], onScope.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any], heartbeatInterval.asInstanceOf[js.Any])).asInstanceOf[IdleTransaction]
  inline def startIdleTransaction(
    hub: Hub,
    transactionContext: TransactionContext,
    idleTimeout: Double,
    finalTimeout: Double,
    onScope: Unit,
    customSamplingContext: Unit,
    heartbeatInterval: Double
  ): IdleTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startIdleTransaction")(hub.asInstanceOf[js.Any], transactionContext.asInstanceOf[js.Any], idleTimeout.asInstanceOf[js.Any], finalTimeout.asInstanceOf[js.Any], onScope.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any], heartbeatInterval.asInstanceOf[js.Any])).asInstanceOf[IdleTransaction]
  inline def startIdleTransaction(
    hub: Hub,
    transactionContext: TransactionContext,
    idleTimeout: Double,
    finalTimeout: Double,
    onScope: Unit,
    customSamplingContext: CustomSamplingContext
  ): IdleTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startIdleTransaction")(hub.asInstanceOf[js.Any], transactionContext.asInstanceOf[js.Any], idleTimeout.asInstanceOf[js.Any], finalTimeout.asInstanceOf[js.Any], onScope.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any])).asInstanceOf[IdleTransaction]
  inline def startIdleTransaction(
    hub: Hub,
    transactionContext: TransactionContext,
    idleTimeout: Double,
    finalTimeout: Double,
    onScope: Unit,
    customSamplingContext: CustomSamplingContext,
    heartbeatInterval: Double
  ): IdleTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startIdleTransaction")(hub.asInstanceOf[js.Any], transactionContext.asInstanceOf[js.Any], idleTimeout.asInstanceOf[js.Any], finalTimeout.asInstanceOf[js.Any], onScope.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any], heartbeatInterval.asInstanceOf[js.Any])).asInstanceOf[IdleTransaction]
}
