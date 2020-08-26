package typings.stormReactDiagrams.baseModelMod

import typings.stormReactDiagrams.anon.BaseEventBaseModelBaseEnt
import typings.stormReactDiagrams.baseEntityMod.BaseEntity
import typings.stormReactDiagrams.baseEntityMod.BaseEvent
import typings.stormReactDiagrams.baseEntityMod.BaseListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseModelListener
  extends BaseListener[js.Any] {
  var entityRemoved: js.UndefOr[
    js.Function1[/* event */ BaseEvent[BaseModel[BaseEntity[BaseListener[_]], this.type]], Unit]
  ] = js.native
  var selectionChanged: js.UndefOr[js.Function1[/* event */ BaseEventBaseModelBaseEnt, Unit]] = js.native
}

object BaseModelListener {
  @scala.inline
  def apply(): BaseModelListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseModelListener]
  }
  @scala.inline
  implicit class BaseModelListenerOps[Self <: BaseModelListener] (val x: Self) extends AnyVal {
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
    def setEntityRemoved(value: /* event */ BaseEvent[BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]] => Unit): Self = this.set("entityRemoved", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEntityRemoved: Self = this.set("entityRemoved", js.undefined)
    @scala.inline
    def setSelectionChanged(value: /* event */ BaseEventBaseModelBaseEnt => Unit): Self = this.set("selectionChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelectionChanged: Self = this.set("selectionChanged", js.undefined)
  }
  
}

