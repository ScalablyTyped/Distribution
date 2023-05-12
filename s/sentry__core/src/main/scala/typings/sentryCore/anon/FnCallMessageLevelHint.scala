package typings.sentryCore.anon

import typings.sentryTypes.typesEventMod.EventHint
import typings.sentryTypes.typesSeverityMod.Severity
import typings.sentryTypes.typesSeverityMod.SeverityLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallMessageLevelHint extends StObject {
  
  def apply(message: String): String = js.native
  def apply(message: String, level: Unit, hint: EventHint): String = js.native
  def apply(message: String, level: Severity): String = js.native
  def apply(message: String, level: SeverityLevel): String = js.native
  def apply(message: String, level: SeverityLevel, hint: EventHint): String = js.native
  def apply(message: String, level: Severity, hint: EventHint): String = js.native
}
