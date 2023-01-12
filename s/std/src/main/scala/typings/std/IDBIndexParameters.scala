package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDBIndexParameters extends StObject {
  
  /* standard dom */
  var multiEntry: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var unique: js.UndefOr[scala.Boolean] = js.undefined
}
object IDBIndexParameters {
  
  inline def apply(): IDBIndexParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDBIndexParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDBIndexParameters] (val x: Self) extends AnyVal {
    
    inline def setMultiEntry(value: scala.Boolean): Self = StObject.set(x, "multiEntry", value.asInstanceOf[js.Any])
    
    inline def setMultiEntryUndefined: Self = StObject.set(x, "multiEntry", js.undefined)
    
    inline def setUnique(value: scala.Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
  }
}
