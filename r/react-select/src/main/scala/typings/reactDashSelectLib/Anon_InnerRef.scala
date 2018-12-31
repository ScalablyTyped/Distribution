package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InnerRef extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var cx: js.Function3[
    /* a */ java.lang.String | scala.Null, 
    /* b */ reactDashSelectLib.libTypesMod.ClassNamesState, 
    /* c */ java.lang.String, 
    java.lang.String | scala.Unit
  ]
  /** Reference to the internal element */
  var innerRef: js.Function1[/* element */ reactLib.reactMod.ReactNs.Ref[_], scala.Unit]
  /** Whether the input is disabled */
  var isDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Set whether the input should be visible. Does not affect input size. */
  var isHidden: scala.Boolean
}

