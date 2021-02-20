package typings.sentryBrowser

import typings.sentryBrowser.tracekitMod.StackFrame
import typings.sentryBrowser.tracekitMod.StackTrace
import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.exceptionMod.Exception
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parsersMod {
  
  @JSImport("@sentry/browser/dist/parsers", "eventFromPlainObject")
  @js.native
  def eventFromPlainObject(exception: Record[String, _]): Event = js.native
  @JSImport("@sentry/browser/dist/parsers", "eventFromPlainObject")
  @js.native
  def eventFromPlainObject(exception: Record[String, _], syntheticException: js.UndefOr[scala.Nothing], rejection: Boolean): Event = js.native
  @JSImport("@sentry/browser/dist/parsers", "eventFromPlainObject")
  @js.native
  def eventFromPlainObject(exception: Record[String, _], syntheticException: Error): Event = js.native
  @JSImport("@sentry/browser/dist/parsers", "eventFromPlainObject")
  @js.native
  def eventFromPlainObject(exception: Record[String, _], syntheticException: Error, rejection: Boolean): Event = js.native
  
  @JSImport("@sentry/browser/dist/parsers", "eventFromStacktrace")
  @js.native
  def eventFromStacktrace(stacktrace: StackTrace): Event = js.native
  
  @JSImport("@sentry/browser/dist/parsers", "exceptionFromStacktrace")
  @js.native
  def exceptionFromStacktrace(stacktrace: StackTrace): Exception = js.native
  
  @JSImport("@sentry/browser/dist/parsers", "prepareFramesForEvent")
  @js.native
  def prepareFramesForEvent(stack: js.Array[StackFrame]): js.Array[typings.sentryTypes.stackframeMod.StackFrame] = js.native
}
