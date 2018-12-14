package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Mixin[P, S]
  extends ComponentLifecycle[P, S, js.Any] {
  var childContextTypes: js.UndefOr[ValidationMap[_]] = js.undefined
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.undefined
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var getDefaultProps: js.UndefOr[js.Function0[P]] = js.undefined
  var getInitialState: js.UndefOr[js.Function0[S]] = js.undefined
  var mixins: js.UndefOr[js.Array[Mixin[P, S]]] = js.undefined
  var propTypes: js.UndefOr[ValidationMap[_]] = js.undefined
  var statics: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

