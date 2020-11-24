package typings.reactStickyBox.mod

import typings.std.HTMLElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StickyBoxInstance extends js.Object {
  
  var latestScrollY: Double = js.native
  
  var mode: StickyBoxMode = js.native
  
  var naturalTop: Double = js.native
  
  var node: HTMLElement = js.native
  
  var nodeHeight: Double = js.native
  
  var offset: Double = js.native
  
  var parentHeight: Double = js.native
  
  var scrollPane: HTMLElement | Window = js.native
  
  var viewportHeight: Double = js.native
}
object StickyBoxInstance {
  
  @scala.inline
  def apply(
    latestScrollY: Double,
    mode: StickyBoxMode,
    naturalTop: Double,
    node: HTMLElement,
    nodeHeight: Double,
    offset: Double,
    parentHeight: Double,
    scrollPane: HTMLElement | Window,
    viewportHeight: Double
  ): StickyBoxInstance = {
    val __obj = js.Dynamic.literal(latestScrollY = latestScrollY.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], naturalTop = naturalTop.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], nodeHeight = nodeHeight.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], parentHeight = parentHeight.asInstanceOf[js.Any], scrollPane = scrollPane.asInstanceOf[js.Any], viewportHeight = viewportHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickyBoxInstance]
  }
  
  @scala.inline
  implicit class StickyBoxInstanceOps[Self <: StickyBoxInstance] (val x: Self) extends AnyVal {
    
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
    def setLatestScrollY(value: Double): Self = this.set("latestScrollY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: StickyBoxMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNaturalTop(value: Double): Self = this.set("naturalTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: HTMLElement): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeHeight(value: Double): Self = this.set("nodeHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentHeight(value: Double): Self = this.set("parentHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPane(value: HTMLElement | Window): Self = this.set("scrollPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportHeight(value: Double): Self = this.set("viewportHeight", value.asInstanceOf[js.Any])
  }
}
