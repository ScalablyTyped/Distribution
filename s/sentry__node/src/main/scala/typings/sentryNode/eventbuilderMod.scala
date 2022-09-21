package typings.sentryNode

import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.eventMod.EventHint
import typings.sentryTypes.exceptionMod.Exception
import typings.sentryTypes.severityMod.Severity
import typings.sentryTypes.severityMod.SeverityLevel
import typings.sentryTypes.stackframeMod.StackFrame
import typings.sentryTypes.stacktraceMod.StackParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventbuilderMod {
  
  @JSImport("@sentry/node/types/eventbuilder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def eventFromMessage(stackParser: StackParser, message: String): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def eventFromMessage(stackParser: StackParser, message: String, level: Unit, hint: Unit, attachStacktrace: Boolean): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], hint.asInstanceOf[js.Any], attachStacktrace.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def eventFromMessage(stackParser: StackParser, message: String, level: Unit, hint: EventHint): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def eventFromMessage(stackParser: StackParser, message: String, level: Unit, hint: EventHint, attachStacktrace: Boolean): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], hint.asInstanceOf[js.Any], attachStacktrace.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def eventFromMessage(stackParser: StackParser, message: String, level: Severity): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def eventFromMessage(stackParser: StackParser, message: String, level: SeverityLevel): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def eventFromMessage(
    stackParser: StackParser,
    message: String,
    level: SeverityLevel,
    hint: Unit,
    attachStacktrace: Boolean
  ): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], hint.asInstanceOf[js.Any], attachStacktrace.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def eventFromMessage(stackParser: StackParser, message: String, level: SeverityLevel, hint: EventHint): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def eventFromMessage(
    stackParser: StackParser,
    message: String,
    level: SeverityLevel,
    hint: EventHint,
    attachStacktrace: Boolean
  ): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], hint.asInstanceOf[js.Any], attachStacktrace.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def eventFromMessage(stackParser: StackParser, message: String, level: Severity, hint: Unit, attachStacktrace: Boolean): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], hint.asInstanceOf[js.Any], attachStacktrace.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def eventFromMessage(stackParser: StackParser, message: String, level: Severity, hint: EventHint): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def eventFromMessage(
    stackParser: StackParser,
    message: String,
    level: Severity,
    hint: EventHint,
    attachStacktrace: Boolean
  ): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromMessage")(stackParser.asInstanceOf[js.Any], message.asInstanceOf[js.Any], level.asInstanceOf[js.Any], hint.asInstanceOf[js.Any], attachStacktrace.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def eventFromUnknownInput(stackParser: StackParser, exception: Any): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromUnknownInput")(stackParser.asInstanceOf[js.Any], exception.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def eventFromUnknownInput(stackParser: StackParser, exception: Any, hint: EventHint): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("eventFromUnknownInput")(stackParser.asInstanceOf[js.Any], exception.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def exceptionFromError(stackParser: StackParser, error: js.Error): Exception = (^.asInstanceOf[js.Dynamic].applyDynamic("exceptionFromError")(stackParser.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Exception]
  
  inline def parseStackFrames(stackParser: StackParser, error: js.Error): js.Array[StackFrame] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseStackFrames")(stackParser.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[js.Array[StackFrame]]
}
