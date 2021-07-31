package typings.sentryMinimal

import org.scalablytyped.runtime.StringDictionary
import typings.sentryHub.mod.Scope
import typings.sentryTypes.breadcrumbMod.Breadcrumb
import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.extraMod.Extra
import typings.sentryTypes.extraMod.Extras
import typings.sentryTypes.scopeMod.CaptureContext
import typings.sentryTypes.severityMod.Severity
import typings.sentryTypes.transactionMod.CustomSamplingContext
import typings.sentryTypes.transactionMod.Transaction
import typings.sentryTypes.transactionMod.TransactionContext
import typings.sentryTypes.userMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sentry/minimal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addBreadcrumb(breadcrumb: Breadcrumb): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBreadcrumb")(breadcrumb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def callOnClient(method: String, args: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_callOnClient")(method.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def captureEvent(event: Event): String = ^.asInstanceOf[js.Dynamic].applyDynamic("captureEvent")(event.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def captureException(exception: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("captureException")(exception.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def captureException(exception: js.Any, captureContext: CaptureContext): String = (^.asInstanceOf[js.Dynamic].applyDynamic("captureException")(exception.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def captureMessage(message: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def captureMessage(message: String, captureContext: CaptureContext): String = (^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def captureMessage(message: String, captureContext: Severity): String = (^.asInstanceOf[js.Dynamic].applyDynamic("captureMessage")(message.asInstanceOf[js.Any], captureContext.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def configureScope(callback: js.Function1[/* scope */ Scope, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configureScope")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setContext(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def setContext(name: String, context: StringDictionary[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(name.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setExtra(key: String, extra: Extra): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setExtra")(key.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setExtras(extras: Extras): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setExtras")(extras.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setTag(key: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTag")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setTags(tags: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTags")(tags.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setUser(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUser")().asInstanceOf[Unit]
  @scala.inline
  def setUser(user: User): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUser")(user.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def startTransaction(context: TransactionContext): Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("startTransaction")(context.asInstanceOf[js.Any]).asInstanceOf[Transaction]
  @scala.inline
  def startTransaction(context: TransactionContext, customSamplingContext: CustomSamplingContext): Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startTransaction")(context.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any])).asInstanceOf[Transaction]
  
  @scala.inline
  def withScope(callback: js.Function1[/* scope */ Scope, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("withScope")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
