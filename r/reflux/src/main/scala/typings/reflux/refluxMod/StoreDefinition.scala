package typings.reflux.refluxMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreDefinition
  extends /* propertyName */ StringDictionary[js.Any] {
  var getInitialState: js.UndefOr[js.Function] = js.undefined
  var init: js.UndefOr[js.Function] = js.undefined
  var listenables: js.UndefOr[js.Array[_]] = js.undefined
}

object StoreDefinition {
  @scala.inline
  def apply(
    StringDictionary: /* propertyName */ StringDictionary[js.Any] = null,
    getInitialState: js.Function = null,
    init: js.Function = null,
    listenables: js.Array[_] = null
  ): StoreDefinition = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (getInitialState != null) __obj.updateDynamic("getInitialState")(getInitialState.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (listenables != null) __obj.updateDynamic("listenables")(listenables.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreDefinition]
  }
}

