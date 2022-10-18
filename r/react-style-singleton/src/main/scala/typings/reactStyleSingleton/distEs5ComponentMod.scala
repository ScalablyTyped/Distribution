package typings.reactStyleSingleton

import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5ComponentMod {
  
  @JSImport("react-style-singleton/dist/es5/component", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def styleSingleton(): FC[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("styleSingleton")().asInstanceOf[FC[Props]]
  
  trait Props extends StObject {
    
    /**
      * marks style as dynamic, so it will be reapplied on styles change
      * note: this is not expected behavior from a "singleton"
      * @default false
      */
    var dynamic: js.UndefOr[Boolean] = js.undefined
    
    /**
      * styles to apply
      */
    var styles: String
  }
  object Props {
    
    inline def apply(styles: String): Props = {
      val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setDynamic(value: Boolean): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
      
      inline def setDynamicUndefined: Self = StObject.set(x, "dynamic", js.undefined)
      
      inline def setStyles(value: String): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    }
  }
}
