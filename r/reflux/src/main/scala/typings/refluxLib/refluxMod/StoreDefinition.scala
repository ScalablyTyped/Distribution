package typings
package refluxLib.refluxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StoreDefinition
  extends /* propertyName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  var getInitialState: js.UndefOr[js.Function] = js.undefined
  var init: js.UndefOr[js.Function] = js.undefined
  var listenables: js.UndefOr[js.Array[_]] = js.undefined
}

