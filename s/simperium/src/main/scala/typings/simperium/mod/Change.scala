package typings.simperium.mod

import typings.simperium.simperiumStrings.M
import typings.simperium.simperiumStrings.`-_`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.simperium.mod.ModificationChange[T]
  - typings.simperium.mod.RemovalChange
*/
trait Change[T] extends StObject
object Change {
  
  @scala.inline
  def ModificationChange[T](ccid: String, id: String, o: M, v: JSONDiff[T]): typings.simperium.mod.ModificationChange[T] = {
    val __obj = js.Dynamic.literal(ccid = ccid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.simperium.mod.ModificationChange[T]]
  }
  
  @scala.inline
  def RemovalChange(ccid: String, id: String, o: `-_`): typings.simperium.mod.RemovalChange = {
    val __obj = js.Dynamic.literal(ccid = ccid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], o = o.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.simperium.mod.RemovalChange]
  }
}
