package typings.reactImage.useImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait useImageProps extends js.Object {
  
  var imgPromise: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[Unit]]] = js.native
  
  var srcList: String | js.Array[String] = js.native
  
  var useSuspense: js.UndefOr[Boolean] = js.native
}
object useImageProps {
  
  @scala.inline
  def apply(srcList: String | js.Array[String]): useImageProps = {
    val __obj = js.Dynamic.literal(srcList = srcList.asInstanceOf[js.Any])
    __obj.asInstanceOf[useImageProps]
  }
  
  @scala.inline
  implicit class useImagePropsOps[Self <: useImageProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSrcListVarargs(value: String*): Self = this.set("srcList", js.Array(value :_*))
    
    @scala.inline
    def setSrcList(value: String | js.Array[String]): Self = this.set("srcList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImgPromise(value: /* repeated */ js.Any => js.Promise[Unit]): Self = this.set("imgPromise", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteImgPromise: Self = this.set("imgPromise", js.undefined)
    
    @scala.inline
    def setUseSuspense(value: Boolean): Self = this.set("useSuspense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSuspense: Self = this.set("useSuspense", js.undefined)
  }
}
