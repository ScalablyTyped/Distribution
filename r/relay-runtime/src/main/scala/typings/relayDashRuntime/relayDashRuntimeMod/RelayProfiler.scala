package typings.relayDashRuntime.relayDashRuntimeMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayDashRuntime.Anon_Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelayProfiler extends js.Object {
  def attachAggregateHandler(name: String, handler: Handler): Unit = js.native
  def attachProfileHandler(name: String, handler: ProfileHandler): Unit = js.native
  def detachAggregateHandler(name: String, handler: Handler): Unit = js.native
  def detachProfileHandler(name: String, handler: ProfileHandler): Unit = js.native
  def instrument[T /* <: js.Function1[/* repeated */ js.Any, _] */](name: String, originalFunction: T): T = js.native
  def instrumentMethods(`object`: js.Object, names: StringDictionary[String]): Unit = js.native
  def profile(name: String): Anon_Error = js.native
  def profile(name: String, state: js.Any): Anon_Error = js.native
}

