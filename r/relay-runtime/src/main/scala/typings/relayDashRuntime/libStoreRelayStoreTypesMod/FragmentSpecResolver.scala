package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import typings.relayDashRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FragmentSpecResolver extends js.Object {
  /**
    * Stop watching for changes to the results of the fragments.
    */
  def dispose(): Unit
  /**
    * Get the current results.
    */
  def resolve(): FragmentSpecResults
  /**
    * Subscribe to resolver updates.
    * Overrides existing callback (if one has been specified).
    */
  def setCallback(callback: js.Function0[Unit]): Unit
  /**
    * Update the resolver with new inputs. Call `resolve()` to get the updated
    * results.
    */
  def setProps(props: Props): Unit
  /**
    * Override the variables used to read the results of the fragments. Call
    * `resolve()` to get the updated results.
    */
  def setVariables(variables: Variables, node: ConcreteRequest): Unit
}

object FragmentSpecResolver {
  @scala.inline
  def apply(
    dispose: () => Unit,
    resolve: () => FragmentSpecResults,
    setCallback: js.Function0[Unit] => Unit,
    setProps: Props => Unit,
    setVariables: (Variables, ConcreteRequest) => Unit
  ): FragmentSpecResolver = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), resolve = js.Any.fromFunction0(resolve), setCallback = js.Any.fromFunction1(setCallback), setProps = js.Any.fromFunction1(setProps), setVariables = js.Any.fromFunction2(setVariables))
  
    __obj.asInstanceOf[FragmentSpecResolver]
  }
}

