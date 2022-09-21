package typings.reactWidgets.anon

import typings.reactWidgets.esmListMod.ListHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefRef extends StObject {
  
  var ref: typings.react.mod.Ref[ListHandle]
}
object RefRef {
  
  inline def apply(): RefRef = {
    val __obj = js.Dynamic.literal(ref = null)
    __obj.asInstanceOf[RefRef]
  }
  
  extension [Self <: RefRef](x: Self) {
    
    inline def setRef(value: typings.react.mod.Ref[ListHandle]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ ListHandle | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
  }
}
