package typings
package reactDashRelayLib.compatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatelessWithFragment[T]
  extends reactLib.reactMod.FunctionComponent[T]
     with ReactFragmentComponent[T] {
  @JSName("getFragment")
  var getFragment_Original: js.Function2[
    /* q */ java.lang.String, 
    /* v */ js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.Variables], 
    java.lang.String
  ] = js.native
  def getFragment(q: java.lang.String): java.lang.String = js.native
  def getFragment(q: java.lang.String, v: relayDashRuntimeLib.relayDashRuntimeMod.Variables): java.lang.String = js.native
}

