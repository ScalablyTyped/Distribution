package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typings.relayRuntime.relayRuntimeTypesMod.Variables
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
  def setVariables(variables: Variables, node: ConcreteRequest): Unit = js.native
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
  @scala.inline
  implicit class FragmentSpecResolverOps[Self <: FragmentSpecResolver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    @scala.inline
    def setResolve(value: () => FragmentSpecResults): Self = this.set("resolve", js.Any.fromFunction0(value))
    @scala.inline
    def setSetCallback(value: js.Function0[Unit] => Unit): Self = this.set("setCallback", js.Any.fromFunction1(value))
    @scala.inline
    def setSetProps(value: Props => Unit): Self = this.set("setProps", js.Any.fromFunction1(value))
    @scala.inline
    def setSetVariables(value: (Variables, ConcreteRequest) => Unit): Self = this.set("setVariables", js.Any.fromFunction2(value))
  }
  
}

