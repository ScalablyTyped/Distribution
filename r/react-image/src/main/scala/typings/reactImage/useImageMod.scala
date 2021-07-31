package typings.reactImage

import typings.reactImage.anon.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useImageMod {
  
  @JSImport("react-image/useImage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(hasSrcListImgPromiseUseSuspense: useImageProps): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasSrcListImgPromiseUseSuspense.asInstanceOf[js.Any]).asInstanceOf[Error]
  
  trait useImageProps extends StObject {
    
    var imgPromise: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[Unit]]] = js.undefined
    
    var srcList: String | js.Array[String]
    
    var useSuspense: js.UndefOr[Boolean] = js.undefined
  }
  object useImageProps {
    
    @scala.inline
    def apply(srcList: String | js.Array[String]): useImageProps = {
      val __obj = js.Dynamic.literal(srcList = srcList.asInstanceOf[js.Any])
      __obj.asInstanceOf[useImageProps]
    }
    
    @scala.inline
    implicit class useImagePropsMutableBuilder[Self <: useImageProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImgPromise(value: /* repeated */ js.Any => js.Promise[Unit]): Self = StObject.set(x, "imgPromise", js.Any.fromFunction1(value))
      
      @scala.inline
      def setImgPromiseUndefined: Self = StObject.set(x, "imgPromise", js.undefined)
      
      @scala.inline
      def setSrcList(value: String | js.Array[String]): Self = StObject.set(x, "srcList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcListVarargs(value: String*): Self = StObject.set(x, "srcList", js.Array(value :_*))
      
      @scala.inline
      def setUseSuspense(value: Boolean): Self = StObject.set(x, "useSuspense", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseSuspenseUndefined: Self = StObject.set(x, "useSuspense", js.undefined)
    }
  }
}
