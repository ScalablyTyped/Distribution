package typings.riot.riotMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RiotComponentExport[P, S]
  extends /* key */ StringDictionary[js.Any] {
  // optional alias to map the children component names
  var components: js.UndefOr[StringDictionary[RiotComponentShell[P, S]]] = js.undefined
  // lifecycle methods
  var onBeforeMount: js.UndefOr[js.Function2[/* currentProps */ P, /* currentState */ S, Unit]] = js.undefined
  var onBeforeUnmount: js.UndefOr[js.Function2[/* currentProps */ P, /* currentState */ S, Unit]] = js.undefined
  var onBeforeUpdate: js.UndefOr[js.Function2[/* currentProps */ P, /* currentState */ S, Unit]] = js.undefined
  var onMounted: js.UndefOr[js.Function2[/* currentProps */ P, /* currentState */ S, Unit]] = js.undefined
  var onUnmounted: js.UndefOr[js.Function2[/* currentProps */ P, /* currentState */ S, Unit]] = js.undefined
  var onUpdated: js.UndefOr[js.Function2[/* currentProps */ P, /* currentState */ S, Unit]] = js.undefined
  // state handling methods
  var shouldUpdate: js.UndefOr[js.Function2[/* newProps */ P, /* currentProps */ P, Boolean]] = js.undefined
  // optional on the component object
  var state: js.UndefOr[S] = js.undefined
}

object RiotComponentExport {
  @scala.inline
  def apply[P, S](
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    components: StringDictionary[RiotComponentShell[P, S]] = null,
    onBeforeMount: (/* currentProps */ P, /* currentState */ S) => Unit = null,
    onBeforeUnmount: (/* currentProps */ P, /* currentState */ S) => Unit = null,
    onBeforeUpdate: (/* currentProps */ P, /* currentState */ S) => Unit = null,
    onMounted: (/* currentProps */ P, /* currentState */ S) => Unit = null,
    onUnmounted: (/* currentProps */ P, /* currentState */ S) => Unit = null,
    onUpdated: (/* currentProps */ P, /* currentState */ S) => Unit = null,
    shouldUpdate: (/* newProps */ P, /* currentProps */ P) => Boolean = null,
    state: S = null
  ): RiotComponentExport[P, S] = {
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
    __obj.asInstanceOf[RiotComponentExport[P, S]]
  }
}

