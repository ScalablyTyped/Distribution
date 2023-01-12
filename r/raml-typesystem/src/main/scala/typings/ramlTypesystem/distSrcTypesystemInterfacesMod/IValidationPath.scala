package typings.ramlTypesystem.distSrcTypesystemInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IValidationPath extends StObject {
  
  var child: js.UndefOr[IValidationPath] = js.undefined
  
  var name: String | Double
}
object IValidationPath {
  
  inline def apply(name: String | Double): IValidationPath = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidationPath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IValidationPath] (val x: Self) extends AnyVal {
    
    inline def setChild(value: IValidationPath): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
    
    inline def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
    
    inline def setName(value: String | Double): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
