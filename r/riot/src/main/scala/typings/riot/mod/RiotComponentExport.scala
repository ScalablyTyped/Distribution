package typings.riot.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RiotComponentExport[Props, State]
  extends /* key */ StringDictionary[js.Any] {
  // optional alias to map the children component names
  var components: js.UndefOr[StringDictionary[RiotComponentShell[Props, State]]] = js.undefined
  // lifecycle methods
  var onBeforeMount: js.UndefOr[js.Function2[/* currentProps */ Props, /* currentState */ State, Unit]] = js.undefined
  var onBeforeUnmount: js.UndefOr[js.Function2[/* currentProps */ Props, /* currentState */ State, Unit]] = js.undefined
  var onBeforeUpdate: js.UndefOr[js.Function2[/* currentProps */ Props, /* currentState */ State, Unit]] = js.undefined
  var onMounted: js.UndefOr[js.Function2[/* currentProps */ Props, /* currentState */ State, Unit]] = js.undefined
  var onUnmounted: js.UndefOr[js.Function2[/* currentProps */ Props, /* currentState */ State, Unit]] = js.undefined
  var onUpdated: js.UndefOr[js.Function2[/* currentProps */ Props, /* currentState */ State, Unit]] = js.undefined
  // state handling methods
  var shouldUpdate: js.UndefOr[js.Function2[/* newProps */ Props, /* currentProps */ Props, Boolean]] = js.undefined
  // optional on the component object
  var state: js.UndefOr[State] = js.undefined
}

object RiotComponentExport {
  @scala.inline
  def apply[Props, State](
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    components: StringDictionary[RiotComponentShell[Props, State]] = null,
    onBeforeMount: (/* currentProps */ Props, /* currentState */ State) => Unit = null,
    onBeforeUnmount: (/* currentProps */ Props, /* currentState */ State) => Unit = null,
    onBeforeUpdate: (/* currentProps */ Props, /* currentState */ State) => Unit = null,
    onMounted: (/* currentProps */ Props, /* currentState */ State) => Unit = null,
    onUnmounted: (/* currentProps */ Props, /* currentState */ State) => Unit = null,
    onUpdated: (/* currentProps */ Props, /* currentState */ State) => Unit = null,
    shouldUpdate: (/* newProps */ Props, /* currentProps */ Props) => Boolean = null,
    state: State = null
  ): RiotComponentExport[Props, State] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (onBeforeMount != null) __obj.updateDynamic("onBeforeMount")(js.Any.fromFunction2(onBeforeMount))
    if (onBeforeUnmount != null) __obj.updateDynamic("onBeforeUnmount")(js.Any.fromFunction2(onBeforeUnmount))
    if (onBeforeUpdate != null) __obj.updateDynamic("onBeforeUpdate")(js.Any.fromFunction2(onBeforeUpdate))
    if (onMounted != null) __obj.updateDynamic("onMounted")(js.Any.fromFunction2(onMounted))
    if (onUnmounted != null) __obj.updateDynamic("onUnmounted")(js.Any.fromFunction2(onUnmounted))
    if (onUpdated != null) __obj.updateDynamic("onUpdated")(js.Any.fromFunction2(onUpdated))
    if (shouldUpdate != null) __obj.updateDynamic("shouldUpdate")(js.Any.fromFunction2(shouldUpdate))
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[RiotComponentExport[Props, State]]
  }
}

