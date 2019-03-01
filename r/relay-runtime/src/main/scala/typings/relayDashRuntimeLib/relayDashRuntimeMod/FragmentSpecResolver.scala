package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FragmentSpecResolver extends js.Object {
  /**
    * Stop watching for changes to the results of the fragments.
    */
  def dispose(): scala.Unit
  /**
    * Get the current results.
    */
  def resolve(): FragmentSpecResults
  /**
    * Update the resolver with new inputs. Call `resolve()` to get the updated
    * results.
    */
  def setProps(props: Props): scala.Unit
  /**
    * Override the variables used to read the results of the fragments. Call
    * `resolve()` to get the updated results.
    */
  def setVariables(variables: Variables): scala.Unit
}

object FragmentSpecResolver {
  @scala.inline
  def apply(
    dispose: js.Function0[scala.Unit],
    resolve: js.Function0[FragmentSpecResults],
    setProps: js.Function1[Props, scala.Unit],
    setVariables: js.Function1[Variables, scala.Unit]
  ): FragmentSpecResolver = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("resolve")(resolve)
    __obj.updateDynamic("setProps")(setProps)
    __obj.updateDynamic("setVariables")(setVariables)
    __obj.asInstanceOf[FragmentSpecResolver]
  }
}

