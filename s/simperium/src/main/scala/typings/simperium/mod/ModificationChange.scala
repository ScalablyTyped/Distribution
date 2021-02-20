package typings.simperium.mod

import typings.simperium.simperiumStrings.M
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModificationChange[T] extends Change[T] {
  
  var ccid: String = js.native
  
  var d: js.UndefOr[T] = js.native
  
  var id: String = js.native
  
  var o: M = js.native
  
  var sv: js.UndefOr[Double] = js.native
  
  var v: JSONDiff[T] = js.native
}
object ModificationChange {
  
  @scala.inline
  def apply[T](ccid: String, id: String, o: M, v: JSONDiff[T]): ModificationChange[T] = {
    val __obj = js.Dynamic.literal(ccid = ccid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModificationChange[T]]
  }
  
  @scala.inline
  implicit class ModificationChangeMutableBuilder[Self <: ModificationChange[_], T] (val x: Self with ModificationChange[T]) extends AnyVal {
    
    @scala.inline
    def setCcid(value: String): Self = StObject.set(x, "ccid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setD(value: T): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setO(value: M): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSv(value: Double): Self = StObject.set(x, "sv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvUndefined: Self = StObject.set(x, "sv", js.undefined)
    
    @scala.inline
    def setV(value: JSONDiff[T]): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
