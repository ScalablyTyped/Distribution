package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomEvent[T]
  extends StObject
     with Event {
  
  /**
    * Returns any custom data event was created with. Typically used for synthetic events.
    */
  val detail: T = js.native
  
  def initCustomEvent(typeArg: java.lang.String, canBubbleArg: scala.Boolean, cancelableArg: scala.Boolean, detailArg: T): Unit = js.native
}
