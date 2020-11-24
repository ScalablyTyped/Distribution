package typings.rellax.mod

import typings.std.Element
import typings.std.NodeListOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RellaxInstance extends js.Object {
  
  /**
    * End Rellax and reset parallax elements to their original positions
    */
  def destroy(): Unit = js.native
  
  /**
    * Rellax elements
    */
  var elms: NodeListOf[Element] | js.Array[Element] = js.native
  
  /**
    * Options
    */
  var options: RellaxOptions = js.native
  
  /**
    * Destroy and create again parallax with previous settings
    */
  def refresh(): Unit = js.native
}
object RellaxInstance {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    elms: NodeListOf[Element] | js.Array[Element],
    options: RellaxOptions,
    refresh: () => Unit
  ): RellaxInstance = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), elms = elms.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], refresh = js.Any.fromFunction0(refresh))
    __obj.asInstanceOf[RellaxInstance]
  }
  
  @scala.inline
  implicit class RellaxInstanceOps[Self <: RellaxInstance] (val x: Self) extends AnyVal {
    
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setElmsVarargs(value: Element*): Self = this.set("elms", js.Array(value :_*))
    
    @scala.inline
    def setElms(value: NodeListOf[Element] | js.Array[Element]): Self = this.set("elms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: RellaxOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = this.set("refresh", js.Any.fromFunction0(value))
  }
}
