package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thumbnailMod {
  
  @JSImport("react-bootstrap/lib/Thumbnail", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[ThumbnailProps, js.Object, js.Any]
  
  @js.native
  trait Thumbnail
    extends Component[ThumbnailProps, js.Object, js.Any]
  
  trait ThumbnailProps
    extends StObject
       with HTMLProps[Thumbnail] {
    
    var bsSize: js.UndefOr[Sizes] = js.undefined
    
    var bsStyle: js.UndefOr[String] = js.undefined
  }
  object ThumbnailProps {
    
    @scala.inline
    def apply(): ThumbnailProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThumbnailProps]
    }
    
    @scala.inline
    implicit class ThumbnailPropsMutableBuilder[Self <: ThumbnailProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      @scala.inline
      def setBsStyle(value: String): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsStyleUndefined: Self = StObject.set(x, "bsStyle", js.undefined)
    }
  }
}
