package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomEvent[T]
  extends StObject
     with Event {
  
  /** Returns any custom data event was created with. Typically used for synthetic events. */
  /* standard dom */
  val detail: T = js.native
  
  /** @deprecated */
  /* standard dom */
  def initCustomEvent(`type`: java.lang.String): Unit = js.native
  def initCustomEvent(`type`: java.lang.String, bubbles: scala.Boolean): Unit = js.native
  def initCustomEvent(`type`: java.lang.String, bubbles: scala.Boolean, cancelable: scala.Boolean): Unit = js.native
  def initCustomEvent(`type`: java.lang.String, bubbles: scala.Boolean, cancelable: scala.Boolean, detail: T): Unit = js.native
  def initCustomEvent(`type`: java.lang.String, bubbles: scala.Boolean, cancelable: Unit, detail: T): Unit = js.native
  def initCustomEvent(`type`: java.lang.String, bubbles: Unit, cancelable: scala.Boolean): Unit = js.native
  def initCustomEvent(`type`: java.lang.String, bubbles: Unit, cancelable: scala.Boolean, detail: T): Unit = js.native
  def initCustomEvent(`type`: java.lang.String, bubbles: Unit, cancelable: Unit, detail: T): Unit = js.native
}
