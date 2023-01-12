package typings.rcFieldForm.anon

import typings.rcFieldForm.esInterfaceMod.FormInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ref[Values] extends StObject {
  
  var ref: js.UndefOr[typings.react.mod.Ref[FormInstance[Values]]] = js.undefined
}
object Ref {
  
  inline def apply[Values](): Ref[Values] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ref[Values]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ref[?], Values] (val x: Self & Ref[Values]) extends AnyVal {
    
    inline def setRef(value: typings.react.mod.Ref[FormInstance[Values]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ FormInstance[Values] | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
