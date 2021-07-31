package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FocusNavigationEvent
  extends StObject
     with Event {
  
  val navigationReason: NavigationReason = js.native
  
  val originHeight: Double = js.native
  
  val originLeft: Double = js.native
  
  val originTop: Double = js.native
  
  val originWidth: Double = js.native
  
  def requestFocus(): Unit = js.native
}
