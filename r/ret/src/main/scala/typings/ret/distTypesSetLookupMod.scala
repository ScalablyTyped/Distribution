package typings.ret

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSetLookupMod {
  
  trait SetLookup extends StObject {
    
    var len: Double
    
    def lookup(): Record[String | Double, Boolean]
  }
  object SetLookup {
    
    inline def apply(len: Double, lookup: () => Record[String | Double, Boolean]): SetLookup = {
      val __obj = js.Dynamic.literal(len = len.asInstanceOf[js.Any], lookup = js.Any.fromFunction0(lookup))
      __obj.asInstanceOf[SetLookup]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SetLookup] (val x: Self) extends AnyVal {
      
      inline def setLen(value: Double): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
      
      inline def setLookup(value: () => Record[String | Double, Boolean]): Self = StObject.set(x, "lookup", js.Any.fromFunction0(value))
    }
  }
}
