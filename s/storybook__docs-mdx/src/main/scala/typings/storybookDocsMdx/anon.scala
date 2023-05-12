package typings.storybookDocsMdx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Imports extends StObject {
    
    var imports: Any
    
    var isTemplate: Any
    
    var name: Any
    
    var of: Any
    
    var title: Any
  }
  object Imports {
    
    inline def apply(imports: Any, isTemplate: Any, name: Any, of: Any, title: Any): Imports = {
      val __obj = js.Dynamic.literal(imports = imports.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], of = of.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Imports]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Imports] (val x: Self) extends AnyVal {
      
      inline def setImports(value: Any): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
      
      inline def setIsTemplate(value: Any): Self = StObject.set(x, "isTemplate", value.asInstanceOf[js.Any])
      
      inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOf(value: Any): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
