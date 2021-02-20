package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formControlStaticMod {
  
  @JSImport("react-bootstrap/lib/FormControlStatic", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[FormControlStaticProps, js.Object, js.Any]
  
  @js.native
  trait FormControlStatic
    extends Component[FormControlStaticProps, js.Object, js.Any]
  
  @js.native
  trait FormControlStaticProps extends HTMLProps[FormControlStatic] {
    
    var bsClass: js.UndefOr[String] = js.native
    
    var componentClass: js.UndefOr[ReactType[_]] = js.native
  }
  object FormControlStaticProps {
    
    @scala.inline
    def apply(): FormControlStaticProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormControlStaticProps]
    }
    
    @scala.inline
    implicit class FormControlStaticPropsMutableBuilder[Self <: FormControlStaticProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      @scala.inline
      def setComponentClass(value: ReactType[_]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
