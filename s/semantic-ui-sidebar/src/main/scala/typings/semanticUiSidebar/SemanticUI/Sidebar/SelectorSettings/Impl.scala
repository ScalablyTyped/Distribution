package typings.semanticUiSidebar.SemanticUI.Sidebar.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Impl extends js.Object {
  
  /**
    * @default '.fixed'
    */
  var fixed: String = js.native
  
  /**
    * @default 'script, link, style, .ui.modal, .ui.dimmer, .ui.nag, .ui.fixed'
    */
  var omitted: String = js.native
  
  /**
    * @default '.pusher'
    */
  var pusher: String = js.native
  
  /**
    * @default '.ui.sidebar'
    */
  var sidebar: String = js.native
}
object Impl {
  
  @scala.inline
  def apply(fixed: String, omitted: String, pusher: String, sidebar: String): Impl = {
    val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any], omitted = omitted.asInstanceOf[js.Any], pusher = pusher.asInstanceOf[js.Any], sidebar = sidebar.asInstanceOf[js.Any])
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
    def setFixed(value: String): Self = this.set("fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOmitted(value: String): Self = this.set("omitted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPusher(value: String): Self = this.set("pusher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSidebar(value: String): Self = this.set("sidebar", value.asInstanceOf[js.Any])
  }
}
