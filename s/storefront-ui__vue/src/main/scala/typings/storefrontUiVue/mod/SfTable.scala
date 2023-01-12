package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfTable extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfTable")
  @js.native
  val ^ : Constructor = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait Constructor extends StObject {
    
    var methods: Methods
  }
  object Constructor {
    
    inline def apply(methods: Methods): Constructor = {
      val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constructor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Constructor] (val x: Self) extends AnyVal {
      
      inline def setMethods(value: Methods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    }
  }
  
  trait Methods extends StObject {
    
    def updateColumnsCount(columnsCount: Double): Unit
  }
  object Methods {
    
    inline def apply(updateColumnsCount: Double => Unit): Methods = {
      val __obj = js.Dynamic.literal(updateColumnsCount = js.Any.fromFunction1(updateColumnsCount))
      __obj.asInstanceOf[Methods]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Methods] (val x: Self) extends AnyVal {
      
      inline def setUpdateColumnsCount(value: Double => Unit): Self = StObject.set(x, "updateColumnsCount", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfTable.foo` */
  override def _to: Constructor = ^
}
