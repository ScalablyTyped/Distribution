package typings.relayDashRuntime.relayDashRuntimeMod

import typings.relayDashRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FragmentSpecResolver extends js.Object {
  /**
    * Stop watching for changes to the results of the fragments.
    */
  def dispose(): Unit = js.native
  /**
    * Get the current results.
    */
  def resolve(): FragmentSpecResults = js.native
  /**
    * Subscribe to resolver updates.
    * Overrides existing callback (if one has been specified).
    */
  def setCallback(callback: js.Function0[Unit]): Unit = js.native
  /**
    * Update the resolver with new inputs. Call `resolve()` to get the updated
    * results.
    */
  def setProps(props: Props): Unit = js.native
  /**
    * Override the variables used to read the results of the fragments. Call
    * `resolve()` to get the updated results.
    */
  def setVariables(variables: Variables): Unit = js.native
  def setVariables(variables: Variables, request: ConcreteRequest): Unit = js.native
}

