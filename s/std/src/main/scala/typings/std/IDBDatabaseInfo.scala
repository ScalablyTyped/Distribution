package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDBDatabaseInfo extends StObject {
  
  /* standard dom */
  var name: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var version: js.UndefOr[Double] = js.undefined
}
object IDBDatabaseInfo {
  
  inline def apply(): IDBDatabaseInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDBDatabaseInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDBDatabaseInfo] (val x: Self) extends AnyVal {
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
