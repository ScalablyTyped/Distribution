package typings.reactNavigationCore.anon

import typings.reactNavigationCore.navigationBuilderContextMod.ChildBeforeRemoveListener
import typings.reactNavigationCore.navigationBuilderContextMod.GetStateListener
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeforeRemove extends js.Object {
  
  var beforeRemove: Record[String, js.UndefOr[ChildBeforeRemoveListener]] = js.native
  
  var getState: Record[String, js.UndefOr[GetStateListener]] = js.native
}
object BeforeRemove {
  
  @scala.inline
  def apply(
    beforeRemove: Record[String, js.UndefOr[ChildBeforeRemoveListener]],
    getState: Record[String, js.UndefOr[GetStateListener]]
  ): BeforeRemove = {
    val __obj = js.Dynamic.literal(beforeRemove = beforeRemove.asInstanceOf[js.Any], getState = getState.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeRemove]
  }
  
  @scala.inline
  implicit class BeforeRemoveOps[Self <: BeforeRemove] (val x: Self) extends AnyVal {
    
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
    def setBeforeRemove(value: Record[String, js.UndefOr[ChildBeforeRemoveListener]]): Self = this.set("beforeRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetState(value: Record[String, js.UndefOr[GetStateListener]]): Self = this.set("getState", value.asInstanceOf[js.Any])
  }
}
