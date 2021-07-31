package typings.sentryBrowser

import typings.sentryBrowser.tracekitMod.StackFrame
import typings.sentryBrowser.tracekitMod.StackTrace
import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.exceptionMod.Exception
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parsersMod {
  
  @JSImport("@sentry/browser/dist/parsers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def eventFromPlainObject(exception: Record[String, js.Any]): Event = ^.asInstanceOf[js.Dynamic].applyDynamic("eventFromPlainObject")(exception.asInstanceOf[js.Any]).asInstanceOf[Event]
  @scala.inline
  def eventFromPlainObject(exception: Record[String, js.Any], syntheticException: Unit, rejection: Boolean): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromPlainObject")(exception.asInstanceOf[js.Any], syntheticException.asInstanceOf[js.Any], rejection.asInstanceOf[js.Any])).asInstanceOf[Event]
  @scala.inline
  def eventFromPlainObject(exception: Record[String, js.Any], syntheticException: Error): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromPlainObject")(exception.asInstanceOf[js.Any], syntheticException.asInstanceOf[js.Any])).asInstanceOf[Event]
  @scala.inline
  def eventFromPlainObject(exception: Record[String, js.Any], syntheticException: Error, rejection: Boolean): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromPlainObject")(exception.asInstanceOf[js.Any], syntheticException.asInstanceOf[js.Any], rejection.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  @scala.inline
  def eventFromStacktrace(stacktrace: StackTrace): Event = ^.asInstanceOf[js.Dynamic].applyDynamic("eventFromStacktrace")(stacktrace.asInstanceOf[js.Any]).asInstanceOf[Event]
  
  @scala.inline
  def exceptionFromStacktrace(stacktrace: StackTrace): Exception = ^.asInstanceOf[js.Dynamic].applyDynamic("exceptionFromStacktrace")(stacktrace.asInstanceOf[js.Any]).asInstanceOf[Exception]
  
  @scala.inline
  def prepareFramesForEvent(stack: js.Array[StackFrame]): js.Array[typings.sentryTypes.stackframeMod.StackFrame] = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareFramesForEvent")(stack.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.sentryTypes.stackframeMod.StackFrame]]
}
