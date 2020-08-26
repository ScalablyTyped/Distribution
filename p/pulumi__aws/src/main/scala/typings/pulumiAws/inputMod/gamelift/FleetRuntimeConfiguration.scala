package typings.pulumiAws.inputMod.gamelift

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetRuntimeConfiguration extends js.Object {
  /**
    * Maximum amount of time (in seconds) that a game session can remain in status `ACTIVATING`.
    */
  var gameSessionActivationTimeoutSeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * Maximum number of game sessions with status `ACTIVATING` to allow on an instance simultaneously.
    */
  var maxConcurrentGameSessionActivations: js.UndefOr[Input[Double]] = js.native
  /**
    * Collection of server process configurations that describe which server processes to run on each instance in a fleet. See below.
    */
  var serverProcesses: js.UndefOr[Input[js.Array[Input[FleetRuntimeConfigurationServerProcess]]]] = js.native
}

object FleetRuntimeConfiguration {
  @scala.inline
  def apply(): FleetRuntimeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetRuntimeConfiguration]
  }
  @scala.inline
  implicit class FleetRuntimeConfigurationOps[Self <: FleetRuntimeConfiguration] (val x: Self) extends AnyVal {
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
    def setGameSessionActivationTimeoutSeconds(value: Input[Double]): Self = this.set("gameSessionActivationTimeoutSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGameSessionActivationTimeoutSeconds: Self = this.set("gameSessionActivationTimeoutSeconds", js.undefined)
    @scala.inline
    def setMaxConcurrentGameSessionActivations(value: Input[Double]): Self = this.set("maxConcurrentGameSessionActivations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxConcurrentGameSessionActivations: Self = this.set("maxConcurrentGameSessionActivations", js.undefined)
    @scala.inline
    def setServerProcessesVarargs(value: Input[FleetRuntimeConfigurationServerProcess]*): Self = this.set("serverProcesses", js.Array(value :_*))
    @scala.inline
    def setServerProcesses(value: Input[js.Array[Input[FleetRuntimeConfigurationServerProcess]]]): Self = this.set("serverProcesses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerProcesses: Self = this.set("serverProcesses", js.undefined)
  }
  
}

