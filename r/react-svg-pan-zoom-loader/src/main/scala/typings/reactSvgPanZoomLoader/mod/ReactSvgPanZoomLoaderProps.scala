package typings.reactSvgPanZoomLoader.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactSvgPanZoomLoaderProps extends js.Object {
  
  var proxy: js.UndefOr[ReactNode] = js.native
  
  def render(content: ReactNode): ReactNode = js.native
  
  var src: String = js.native
}
object ReactSvgPanZoomLoaderProps {
  
  @scala.inline
  def apply(render: ReactNode => ReactNode, src: String): ReactSvgPanZoomLoaderProps = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render), src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactSvgPanZoomLoaderProps]
  }
  
  @scala.inline
  implicit class ReactSvgPanZoomLoaderPropsOps[Self <: ReactSvgPanZoomLoaderProps] (val x: Self) extends AnyVal {
    
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
    def setRender(value: ReactNode => ReactNode): Self = this.set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxy(value: ReactNode): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
  }
}
