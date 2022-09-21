package typings.rjsfUtils.mod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The properties that are passed to a `DescriptionFieldTemplate` implementation */
trait DescriptionFieldProps[T, F] extends StObject {
  
  /** The description of the field being rendered */
  var description: String | ReactElement
  
  /** The id of the field description in the hierarchy */
  var id: String
  
  /** The `registry` object */
  var registry: Registry[T, F]
}
object DescriptionFieldProps {
  
  inline def apply[T, F](description: String | ReactElement, id: String, registry: Registry[T, F]): DescriptionFieldProps[T, F] = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionFieldProps[T, F]]
  }
  
  extension [Self <: DescriptionFieldProps[?, ?], T, F](x: Self & (DescriptionFieldProps[T, F])) {
    
    inline def setDescription(value: String | ReactElement): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRegistry(value: Registry[T, F]): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
  }
}
