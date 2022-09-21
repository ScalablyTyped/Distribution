package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formControlStaticMod {
  
  @JSImport("react-bootstrap/lib/FormControlStatic", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[FormControlStaticProps, js.Object, Any]
  
  type FormControlStatic = Component[FormControlStaticProps, js.Object, Any]
  
  trait FormControlStaticProps
    extends StObject
       with HTMLProps[FormControlStatic] {
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var componentClass: js.UndefOr[ElementType[Any]] = js.undefined
  }
  object FormControlStaticProps {
    
    inline def apply(): FormControlStaticProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormControlStaticProps]
    }
    
    extension [Self <: FormControlStaticProps](x: Self) {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      inline def setComponentClass(value: ElementType[Any]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
