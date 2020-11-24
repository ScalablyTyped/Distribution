package typings.reactPose.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-pose.react-pose/lib/components/Transition/types.State> */
@js.native
trait PartialState extends js.Object {
  
  var displayedChildren: js.UndefOr[js.Array[ReactElement]] = js.native
  
  var finishedLeaving: js.UndefOr[StringDictionary[Boolean]] = js.native
  
  var hasInitialized: js.UndefOr[Boolean] = js.native
  
  var indexedChildren: js.UndefOr[StringDictionary[ReactElement]] = js.native
  
  var scheduleChildRemoval: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.native
}
object PartialState {
  
  @scala.inline
  def apply(): PartialState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialState]
  }
  
  @scala.inline
  implicit class PartialStateOps[Self <: PartialState] (val x: Self) extends AnyVal {
    
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
    def deleteDisplayedChildren: Self = this.set("displayedChildren", js.undefined)
    
    @scala.inline
    def setFinishedLeaving(value: StringDictionary[Boolean]): Self = this.set("finishedLeaving", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinishedLeaving: Self = this.set("finishedLeaving", js.undefined)
    
    @scala.inline
    def setHasInitialized(value: Boolean): Self = this.set("hasInitialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasInitialized: Self = this.set("hasInitialized", js.undefined)
    
    @scala.inline
    def setIndexedChildren(value: StringDictionary[ReactElement]): Self = this.set("indexedChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexedChildren: Self = this.set("indexedChildren", js.undefined)
    
    @scala.inline
    def setScheduleChildRemoval(value: /* key */ String => Unit): Self = this.set("scheduleChildRemoval", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteScheduleChildRemoval: Self = this.set("scheduleChildRemoval", js.undefined)
  }
}
