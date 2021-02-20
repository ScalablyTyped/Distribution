package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragActions extends StObject {
  
  def cancel(): Unit = js.native
  def cancel(args: StopDragOptions): Unit = js.native
  
  def drop(): Unit = js.native
  def drop(args: StopDragOptions): Unit = js.native
  
  def isActive(): Boolean = js.native
  
  def shouldRespectForcePress(): Boolean = js.native
}
