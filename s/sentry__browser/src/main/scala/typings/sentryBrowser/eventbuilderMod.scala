package typings.sentryBrowser

import typings.sentryBrowser.anon.AttachStacktrace
import typings.sentryBrowser.anon.`0`
import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.eventMod.EventHint
import typings.sentryTypes.optionsMod.Options
import typings.sentryTypes.severityMod.Severity
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventbuilderMod {
  
  @JSImport("@sentry/browser/dist/eventbuilder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def eventFromException(options: Options, exception: js.Any): js.Thenable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromException")(options.asInstanceOf[js.Any], exception.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Event]]
  @scala.inline
  def eventFromException(options: Options, exception: js.Any, hint: EventHint): js.Thenable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromException")(options.asInstanceOf[js.Any], exception.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Event]]
  
  @scala.inline
  def eventFromMessage(options: Options, message: String): js.Thenable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(options.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Event]]
  @scala.inline
  def eventFromMessage(options: Options, message: String, level: Unit, hint: EventHint): js.Thenable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(options.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Event]]
  @scala.inline
  def eventFromMessage(options: Options, message: String, level: Severity): js.Thenable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(options.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Event]]
  @scala.inline
  def eventFromMessage(options: Options, message: String, level: Severity, hint: EventHint): js.Thenable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(options.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Event]]
  
  @scala.inline
  def eventFromString(input: String): Event = ^.asInstanceOf[js.Dynamic].applyDynamic("eventFromString")(input.asInstanceOf[js.Any]).asInstanceOf[Event]
  @scala.inline
  def eventFromString(input: String, syntheticException: Unit, options: `0`): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromString")(input.asInstanceOf[js.Any], syntheticException.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Event]
  @scala.inline
  def eventFromString(input: String, syntheticException: Error): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromString")(input.asInstanceOf[js.Any], syntheticException.asInstanceOf[js.Any])).asInstanceOf[Event]
  @scala.inline
  def eventFromString(input: String, syntheticException: Error, options: `0`): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromString")(input.asInstanceOf[js.Any], syntheticException.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  @scala.inline
  def eventFromUnknownInput(exception: js.Any): Event = ^.asInstanceOf[js.Dynamic].applyDynamic("eventFromUnknownInput")(exception.asInstanceOf[js.Any]).asInstanceOf[Event]
  @scala.inline
  def eventFromUnknownInput(exception: js.Any, syntheticException: Unit, options: AttachStacktrace): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromUnknownInput")(exception.asInstanceOf[js.Any], syntheticException.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Event]
  @scala.inline
  def eventFromUnknownInput(exception: js.Any, syntheticException: Error): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromUnknownInput")(exception.asInstanceOf[js.Any], syntheticException.asInstanceOf[js.Any])).asInstanceOf[Event]
  @scala.inline
  def eventFromUnknownInput(exception: js.Any, syntheticException: Error, options: AttachStacktrace): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromUnknownInput")(exception.asInstanceOf[js.Any], syntheticException.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Event]
}
