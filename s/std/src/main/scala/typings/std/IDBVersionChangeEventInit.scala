package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDBVersionChangeEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var newVersion: js.UndefOr[Double | Null] = js.undefined
  
  /* standard dom */
  var oldVersion: js.UndefOr[Double] = js.undefined
}
object IDBVersionChangeEventInit {
  
  inline def apply(): IDBVersionChangeEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDBVersionChangeEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDBVersionChangeEventInit] (val x: Self) extends AnyVal {
    
    inline def setNewVersion(value: Double): Self = StObject.set(x, "newVersion", value.asInstanceOf[js.Any])
    
    inline def setNewVersionNull: Self = StObject.set(x, "newVersion", null)
    
    inline def setNewVersionUndefined: Self = StObject.set(x, "newVersion", js.undefined)
    
    inline def setOldVersion(value: Double): Self = StObject.set(x, "oldVersion", value.asInstanceOf[js.Any])
    
    inline def setOldVersionUndefined: Self = StObject.set(x, "oldVersion", js.undefined)
  }
}
