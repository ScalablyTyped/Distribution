package typings.sentryBrowser

import typings.sentryBrowser.anon.AttachStacktrace
import typings.sentryBrowser.anon.`0`
import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.eventMod.EventHint
import typings.sentryTypes.optionsMod.Options
import typings.sentryTypes.severityMod.Severity
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/browser/dist/eventbuilder", JSImport.Namespace)
@js.native
object eventbuilderMod extends js.Object {
  
  def eventFromException(options: Options, exception: js.Any): js.Thenable[Event] = js.native
  def eventFromException(options: Options, exception: js.Any, hint: EventHint): js.Thenable[Event] = js.native
  
  def eventFromMessage(options: Options, message: String): js.Thenable[Event] = js.native
  def eventFromMessage(options: Options, message: String, level: js.UndefOr[scala.Nothing], hint: EventHint): js.Thenable[Event] = js.native
  def eventFromMessage(options: Options, message: String, level: Severity): js.Thenable[Event] = js.native
  def eventFromMessage(options: Options, message: String, level: Severity, hint: EventHint): js.Thenable[Event] = js.native
  
  def eventFromString(input: String): Event = js.native
  def eventFromString(input: String, syntheticException: js.UndefOr[scala.Nothing], options: `0`): Event = js.native
  def eventFromString(input: String, syntheticException: Error): Event = js.native
  def eventFromString(input: String, syntheticException: Error, options: `0`): Event = js.native
  
  def eventFromUnknownInput(exception: js.Any): Event = js.native
  def eventFromUnknownInput(exception: js.Any, syntheticException: js.UndefOr[scala.Nothing], options: AttachStacktrace): Event = js.native
  def eventFromUnknownInput(exception: js.Any, syntheticException: Error): Event = js.native
  def eventFromUnknownInput(exception: js.Any, syntheticException: Error, options: AttachStacktrace): Event = js.native
}
