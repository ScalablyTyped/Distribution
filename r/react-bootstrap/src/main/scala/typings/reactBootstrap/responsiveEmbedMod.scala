package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responsiveEmbedMod {
  
  @JSImport("react-bootstrap/lib/ResponsiveEmbed", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[ResponsiveEmbedProps, js.Object, js.Any]
  
  @js.native
  trait ResponsiveEmbed
    extends Component[ResponsiveEmbedProps, js.Object, js.Any]
  
  @js.native
  trait ResponsiveEmbedProps extends HTMLProps[ResponsiveEmbed] {
    
    var a16by9: js.UndefOr[Boolean] = js.native
    
    var a4by3: js.UndefOr[Boolean] = js.native
    
    var bsClass: js.UndefOr[String] = js.native
  }
  object ResponsiveEmbedProps {
    
    @scala.inline
    def apply(): ResponsiveEmbedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsiveEmbedProps]
    }
    
    @scala.inline
    implicit class ResponsiveEmbedPropsMutableBuilder[Self <: ResponsiveEmbedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA16by9(value: Boolean): Self = StObject.set(x, "a16by9", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setA16by9Undefined: Self = StObject.set(x, "a16by9", js.undefined)
      
      @scala.inline
      def setA4by3(value: Boolean): Self = StObject.set(x, "a4by3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setA4by3Undefined: Self = StObject.set(x, "a4by3", js.undefined)
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
    }
  }
}
