package typings.resizeImg

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(input: Buffer, options: ResizeImgOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  @JSImport("resize-img", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ResizeImgOptions extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object ResizeImgOptions {
    
    @scala.inline
    def apply(): ResizeImgOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeImgOptions]
    }
    
    @scala.inline
    implicit class ResizeImgOptionsMutableBuilder[Self <: ResizeImgOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
