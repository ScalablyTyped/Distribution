package typings.reactNativeSortableGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortableGridItemProps extends js.Object {
  
  /**
    * Flag to mark a child node as being inactive. If set, no touch events
    * will be fired when users interact with the node.
    */
  var inactive: js.UndefOr[Boolean] = js.native
  
  var key: String = js.native
  
  /**
    * Function that is executed when the block is double tapped within a
    * timeframe of doubleTapTreshold (default 150ms). Assigning this will
    * delay the execution of onTap. Omitting this will cause all taps to be
    * handled as single taps, regardless of their frequency.
    */
  var onDoubleTap: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Function that is executed when the block is tapped once, but not pressed
    *  for long enough to activate the drag.
    */
  var onTap: js.UndefOr[js.Function0[Unit]] = js.native
}
object SortableGridItemProps {
  
  @scala.inline
  def apply(key: String): SortableGridItemProps = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortableGridItemProps]
  }
  
  @scala.inline
  implicit class SortableGridItemPropsOps[Self <: SortableGridItemProps] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInactive(value: Boolean): Self = this.set("inactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInactive: Self = this.set("inactive", js.undefined)
    
    @scala.inline
    def setOnDoubleTap(value: () => Unit): Self = this.set("onDoubleTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDoubleTap: Self = this.set("onDoubleTap", js.undefined)
    
    @scala.inline
    def setOnTap(value: () => Unit): Self = this.set("onTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnTap: Self = this.set("onTap", js.undefined)
  }
}
