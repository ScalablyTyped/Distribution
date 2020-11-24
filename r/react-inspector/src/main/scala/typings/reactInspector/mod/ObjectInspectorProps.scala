package typings.reactInspector.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectInspectorProps
  extends TreeViewProps
     with ThemedComponentProps {
  
  /**
    * Show non-enumerable properties.
    */
  var showNonenumerable: js.UndefOr[Boolean] = js.native
  
  /**
    * Sort object keys with optional compare function.
    */
  var sortObjectKeys: js.UndefOr[Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])] = js.native
}
object ObjectInspectorProps {
  
  @scala.inline
  def apply(): ObjectInspectorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectInspectorProps]
  }
  
  @scala.inline
  implicit class ObjectInspectorPropsOps[Self <: ObjectInspectorProps] (val x: Self) extends AnyVal {
    
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
    def setShowNonenumerable(value: Boolean): Self = this.set("showNonenumerable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowNonenumerable: Self = this.set("showNonenumerable", js.undefined)
    
    @scala.inline
    def setSortObjectKeysFunction2(value: (/* a */ js.Any, /* b */ js.Any) => Double): Self = this.set("sortObjectKeys", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSortObjectKeys(value: Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])): Self = this.set("sortObjectKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortObjectKeys: Self = this.set("sortObjectKeys", js.undefined)
  }
}
