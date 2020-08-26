package typings.riot.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RiotComponentExport[Props, State]
  extends /* key */ StringDictionary[js.Any] {
  // optional alias to map the children component names
  var components: js.UndefOr[StringDictionary[RiotComponentShell[Props, State]]] = js.native
  // lifecycle methods
  var onBeforeMount: js.UndefOr[js.Function2[/* currentProps */ Props, /* currentState */ State, Unit]] = js.native
  var onBeforeUnmount: js.UndefOr[js.Function2[/* currentProps */ Props, /* currentState */ State, Unit]] = js.native
  var onBeforeUpdate: js.UndefOr[js.Function2[/* currentProps */ Props, /* currentState */ State, Unit]] = js.native
  var onMounted: js.UndefOr[js.Function2[/* currentProps */ Props, /* currentState */ State, Unit]] = js.native
  var onUnmounted: js.UndefOr[js.Function2[/* currentProps */ Props, /* currentState */ State, Unit]] = js.native
  var onUpdated: js.UndefOr[js.Function2[/* currentProps */ Props, /* currentState */ State, Unit]] = js.native
  // state handling methods
  var shouldUpdate: js.UndefOr[js.Function2[/* newProps */ Props, /* currentProps */ Props, Boolean]] = js.native
  // optional on the component object
  var state: js.UndefOr[State] = js.native
}

object RiotComponentExport {
  @scala.inline
  def apply[Props, State](): RiotComponentExport[Props, State] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RiotComponentExport[Props, State]]
  }
  @scala.inline
  implicit class RiotComponentExportOps[Self <: RiotComponentExport[_, _], Props, State] (val x: Self with (RiotComponentExport[Props, State])) extends AnyVal {
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
    def setComponents(value: StringDictionary[RiotComponentShell[Props, State]]): Self = this.set("components", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    @scala.inline
    def setOnBeforeMount(value: (/* currentProps */ Props, /* currentState */ State) => Unit): Self = this.set("onBeforeMount", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnBeforeMount: Self = this.set("onBeforeMount", js.undefined)
    @scala.inline
    def setOnBeforeUnmount(value: (/* currentProps */ Props, /* currentState */ State) => Unit): Self = this.set("onBeforeUnmount", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnBeforeUnmount: Self = this.set("onBeforeUnmount", js.undefined)
    @scala.inline
    def setOnBeforeUpdate(value: (/* currentProps */ Props, /* currentState */ State) => Unit): Self = this.set("onBeforeUpdate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnBeforeUpdate: Self = this.set("onBeforeUpdate", js.undefined)
    @scala.inline
    def setOnMounted(value: (/* currentProps */ Props, /* currentState */ State) => Unit): Self = this.set("onMounted", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnMounted: Self = this.set("onMounted", js.undefined)
    @scala.inline
    def setOnUnmounted(value: (/* currentProps */ Props, /* currentState */ State) => Unit): Self = this.set("onUnmounted", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnUnmounted: Self = this.set("onUnmounted", js.undefined)
    @scala.inline
    def setOnUpdated(value: (/* currentProps */ Props, /* currentState */ State) => Unit): Self = this.set("onUpdated", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnUpdated: Self = this.set("onUpdated", js.undefined)
    @scala.inline
    def setShouldUpdate(value: (/* newProps */ Props, /* currentProps */ Props) => Boolean): Self = this.set("shouldUpdate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteShouldUpdate: Self = this.set("shouldUpdate", js.undefined)
    @scala.inline
    def setState(value: State): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

