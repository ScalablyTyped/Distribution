package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AlternateStateData...
  */
@js.native
trait IAlternateStateData extends js.Object {
  
  /**
    * List of the selections <Array of BookmarkFieldItem>
    */
  var qFieldItems: js.Array[IBookmarkFieldItem] = js.native
  
  /**
    * Name of the alternate state.
    * Default is current selections: $
    */
  var qStateName: String = js.native
}
object IAlternateStateData {
  
  @scala.inline
  def apply(qFieldItems: js.Array[IBookmarkFieldItem], qStateName: String): IAlternateStateData = {
    val __obj = js.Dynamic.literal(qFieldItems = qFieldItems.asInstanceOf[js.Any], qStateName = qStateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAlternateStateData]
  }
  
  @scala.inline
  implicit class IAlternateStateDataOps[Self <: IAlternateStateData] (val x: Self) extends AnyVal {
    
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
    def setQFieldItemsVarargs(value: IBookmarkFieldItem*): Self = this.set("qFieldItems", js.Array(value :_*))
    
    @scala.inline
    def setQFieldItems(value: js.Array[IBookmarkFieldItem]): Self = this.set("qFieldItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQStateName(value: String): Self = this.set("qStateName", value.asInstanceOf[js.Any])
  }
}
