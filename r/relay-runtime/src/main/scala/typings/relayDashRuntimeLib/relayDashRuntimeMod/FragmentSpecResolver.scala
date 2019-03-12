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
    dispose: () => scala.Unit,
    resolve: () => FragmentSpecResults,
    setProps: Props => scala.Unit,
    setVariables: Variables => scala.Unit
  ): FragmentSpecResolver = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), resolve = js.Any.fromFunction0(resolve), setProps = js.Any.fromFunction1(setProps), setVariables = js.Any.fromFunction1(setVariables))
  
    __obj.asInstanceOf[FragmentSpecResolver]
  }
}

