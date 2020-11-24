package typings.semanticUiSidebar.SemanticUI.Sidebar.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Impl extends js.Object {
  
  /**
    * @default 'The method you called is not defined.'
    */
  var method: String = js.native
  
  /**
    * @default 'Had to move sidebar. For optimal performance make sure sidebar and pusher are direct children of your body tag'
    */
  var movedSidebar: String = js.native
  
  /**
    * @default 'There were no elements that matched the specified selector'
    */
  var notFound: String = js.native
  
  /**
    * @default 'The overlay setting is no longer supported, use animation: overlay'
    */
  var overlay: String = js.native
  
  /**
    * @default 'Had to add pusher element. For optimal performance make sure body content is inside a pusher element'
    */
  var pusher: String = js.native
}
object Impl {
  
  @scala.inline
  def apply(method: String, movedSidebar: String, notFound: String, overlay: String, pusher: String): Impl = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], movedSidebar = movedSidebar.asInstanceOf[js.Any], notFound = notFound.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any], pusher = pusher.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    
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
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovedSidebar(value: String): Self = this.set("movedSidebar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotFound(value: String): Self = this.set("notFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlay(value: String): Self = this.set("overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPusher(value: String): Self = this.set("pusher", value.asInstanceOf[js.Any])
  }
}
