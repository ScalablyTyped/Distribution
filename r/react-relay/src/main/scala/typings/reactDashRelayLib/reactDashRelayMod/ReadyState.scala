package typings
package reactDashRelayLib.reactDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReadyState[T /* <: relayDashRuntimeLib.relayDashRuntimeMod.Variables */] extends js.Object {
  var error: js.UndefOr[stdLib.Error | scala.Null]
  var props: js.UndefOr[T | scala.Null]
  var retry: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

