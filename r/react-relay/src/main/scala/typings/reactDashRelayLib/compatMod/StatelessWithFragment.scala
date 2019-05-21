package typings
package reactDashRelayLib.compatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatelessWithFragment[T]
  extends reactLib.reactMod.FunctionComponent[T]
     with ReactFragmentComponent[T] {
  var getFragment: js.Function2[
    /* q */ java.lang.String, 
    /* v */ js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.Variables], 
    java.lang.String
  ] = js.native
}

