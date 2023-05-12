package typings.sentryCore.anon

import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesEventMod.EventHint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallEventHint extends StObject {
  
  def apply(event: Event): String = js.native
  def apply(event: Event, hint: EventHint): String = js.native
}
