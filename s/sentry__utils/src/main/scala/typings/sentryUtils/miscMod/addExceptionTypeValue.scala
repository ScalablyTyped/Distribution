package typings.sentryUtils.miscMod

import typings.sentryTypes.eventMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/utils/dist/misc", "addExceptionTypeValue")
@js.native
object addExceptionTypeValue extends js.Object {
  
  def apply(event: Event): Unit = js.native
  def apply(event: Event, value: js.UndefOr[scala.Nothing], `type`: String): Unit = js.native
  def apply(event: Event, value: String): Unit = js.native
  def apply(event: Event, value: String, `type`: String): Unit = js.native
}
