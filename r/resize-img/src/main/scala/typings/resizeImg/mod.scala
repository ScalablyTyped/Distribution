package typings.resizeImg

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("resize-img", JSImport.Namespace)
  @js.native
  def apply(input: Buffer, options: ResizeImgOptions): js.Promise[Buffer] = js.native
  
  @js.native
  trait ResizeImgOptions extends StObject {
    
    var height: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
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
