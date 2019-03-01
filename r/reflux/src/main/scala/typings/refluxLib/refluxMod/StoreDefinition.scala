package typings
package refluxLib.refluxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreDefinition
  extends /* propertyName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var getInitialState: js.UndefOr[js.Function] = js.undefined
  var init: js.UndefOr[js.Function] = js.undefined
  var listenables: js.UndefOr[js.Array[_]] = js.undefined
}

object StoreDefinition {
  @scala.inline
  def apply(
    StringDictionary: /* propertyName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    getInitialState: js.Function = null,
    init: js.Function = null,
    listenables: js.Array[_] = null
  ): StoreDefinition = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (getInitialState != null) __obj.updateDynamic("getInitialState")(getInitialState)
    if (init != null) __obj.updateDynamic("init")(init)
    if (listenables != null) __obj.updateDynamic("listenables")(listenables)
    __obj.asInstanceOf[StoreDefinition]
  }
}

