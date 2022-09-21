package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfPrice extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfPrice")
  @js.native
  val ^ : Constructor = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait Constructor extends StObject {
    
    var props: Props
  }
  object Constructor {
    
    inline def apply(props: Props): Constructor = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constructor]
    }
    
    extension [Self <: Constructor](x: Self) {
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props extends StObject {
    
    var regular: String | Double | Null
    
    var special: String | Double | Null
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal(regular = null, special = null)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setRegular(value: String | Double): Self = StObject.set(x, "regular", value.asInstanceOf[js.Any])
      
      inline def setRegularNull: Self = StObject.set(x, "regular", null)
      
      inline def setSpecial(value: String | Double): Self = StObject.set(x, "special", value.asInstanceOf[js.Any])
      
      inline def setSpecialNull: Self = StObject.set(x, "special", null)
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfPrice.foo` */
  override def _to: Constructor = ^
}
