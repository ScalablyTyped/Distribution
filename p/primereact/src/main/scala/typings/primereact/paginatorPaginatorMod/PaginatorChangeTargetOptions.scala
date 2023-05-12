package typings.primereact.paginatorPaginatorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom paginator change target options
  */
trait PaginatorChangeTargetOptions extends StObject {
  
  /**
    * The id attribute of the target options.
    */
  var id: String
  
  /**
    * The name attribute of the target options.
    */
  var name: String
  
  /**
    * The value attribute of the target options.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object PaginatorChangeTargetOptions {
  
  inline def apply(id: String, name: String): PaginatorChangeTargetOptions = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginatorChangeTargetOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaginatorChangeTargetOptions] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
