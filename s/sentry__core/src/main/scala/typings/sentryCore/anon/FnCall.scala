package typings.sentryCore.anon

import typings.sentryTypes.typesEventMod.EventHint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply(exception: Any): String = js.native
  def apply(exception: Any, hint: EventHint): String = js.native
}
