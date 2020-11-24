package typings.sentryBrowser

import typings.sentryBrowser.tracekitMod.StackFrame
import typings.sentryBrowser.tracekitMod.StackTrace
import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.exceptionMod.Exception
import typings.std.Error
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/browser/dist/parsers", JSImport.Namespace)
@js.native
object parsersMod extends js.Object {
  
  def eventFromPlainObject(exception: Record[String, _]): Event = js.native
  def eventFromPlainObject(exception: Record[String, _], syntheticException: js.UndefOr[scala.Nothing], rejection: Boolean): Event = js.native
  def eventFromPlainObject(exception: Record[String, _], syntheticException: Error): Event = js.native
  def eventFromPlainObject(exception: Record[String, _], syntheticException: Error, rejection: Boolean): Event = js.native
  
  def eventFromStacktrace(stacktrace: StackTrace): Event = js.native
  
  def exceptionFromStacktrace(stacktrace: StackTrace): Exception = js.native
  
  def prepareFramesForEvent(stack: js.Array[StackFrame]): js.Array[typings.sentryTypes.stackframeMod.StackFrame] = js.native
}
