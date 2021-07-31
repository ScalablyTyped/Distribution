package typings.simperium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.simperium.mod.ModificationChange[T]
  - typings.simperium.mod.RemovalChange
*/
trait Change[T] extends StObject
object Change {
  
  @scala.inline
  def ModificationChange[T](ccid: String, id: String, v: JSONDiff[T]): typings.simperium.mod.ModificationChange[T] = {
    val __obj = js.Dynamic.literal(ccid = ccid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], o = "M", v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.simperium.mod.ModificationChange[T]]
  }
  
  @scala.inline
  def RemovalChange(ccid: String, id: String): typings.simperium.mod.RemovalChange = {
    val __obj = js.Dynamic.literal(ccid = ccid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], o = "-")
    __obj.asInstanceOf[typings.simperium.mod.RemovalChange]
  }
}
