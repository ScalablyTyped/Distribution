package typings.reactPose.transitionTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State extends js.Object {
  
  var displayedChildren: js.Array[ReactElement] = js.native
  
  var finishedLeaving: StringDictionary[Boolean] = js.native
  
  var hasInitialized: Boolean = js.native
  
  var indexedChildren: StringDictionary[ReactElement] = js.native
  
  def scheduleChildRemoval(key: String): Unit = js.native
}
object State {
  
  @scala.inline
  def apply(
    displayedChildren: js.Array[ReactElement],
    finishedLeaving: StringDictionary[Boolean],
    hasInitialized: Boolean,
    indexedChildren: StringDictionary[ReactElement],
    scheduleChildRemoval: String => Unit
  ): State = {
    val __obj = js.Dynamic.literal(displayedChildren = displayedChildren.asInstanceOf[js.Any], finishedLeaving = finishedLeaving.asInstanceOf[js.Any], hasInitialized = hasInitialized.asInstanceOf[js.Any], indexedChildren = indexedChildren.asInstanceOf[js.Any], scheduleChildRemoval = js.Any.fromFunction1(scheduleChildRemoval))
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    
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
    def setDisplayedChildrenVarargs(value: ReactElement*): Self = this.set("displayedChildren", js.Array(value :_*))
    
    @scala.inline
    def setDisplayedChildren(value: js.Array[ReactElement]): Self = this.set("displayedChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishedLeaving(value: StringDictionary[Boolean]): Self = this.set("finishedLeaving", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasInitialized(value: Boolean): Self = this.set("hasInitialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexedChildren(value: StringDictionary[ReactElement]): Self = this.set("indexedChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleChildRemoval(value: String => Unit): Self = this.set("scheduleChildRemoval", js.Any.fromFunction1(value))
  }
}
