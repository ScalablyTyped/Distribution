package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementDefinitionOptions extends StObject {
  
  /* standard dom */
  var `extends`: js.UndefOr[java.lang.String] = js.undefined
}
object ElementDefinitionOptions {
  
  inline def apply(): ElementDefinitionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementDefinitionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementDefinitionOptions] (val x: Self) extends AnyVal {
    
    inline def setExtends(value: java.lang.String): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
  }
}
