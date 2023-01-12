package typings.redisSearch.anon

import typings.redisSearch.distCommandsMod.SchemaFieldTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type[T /* <: SchemaFieldTypes */] extends StObject {
  
  var AS: js.UndefOr[String] = js.undefined
  
  var `type`: T
}
object Type {
  
  inline def apply[T /* <: SchemaFieldTypes */](`type`: T): Type[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Type[?], T /* <: SchemaFieldTypes */] (val x: Self & Type[T]) extends AnyVal {
    
    inline def setAS(value: String): Self = StObject.set(x, "AS", value.asInstanceOf[js.Any])
    
    inline def setASUndefined: Self = StObject.set(x, "AS", js.undefined)
    
    inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
