package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelayProfiler extends js.Object {
  def attachAggregateHandler(name: java.lang.String, handler: Handler): scala.Unit = js.native
  def attachProfileHandler(name: java.lang.String, handler: ProfileHandler): scala.Unit = js.native
  def detachAggregateHandler(name: java.lang.String, handler: Handler): scala.Unit = js.native
  def detachProfileHandler(name: java.lang.String, handler: ProfileHandler): scala.Unit = js.native
  def instrument[T /* <: js.Function1[/* repeated */ js.Any, _] */](name: java.lang.String, originalFunction: T): T = js.native
  def instrumentMethods(`object`: js.Object, names: org.scalablytyped.runtime.StringDictionary[java.lang.String]): scala.Unit = js.native
  def profile(name: java.lang.String): relayDashRuntimeLib.Anon_Error = js.native
  def profile(name: java.lang.String, state: js.Any): relayDashRuntimeLib.Anon_Error = js.native
}

