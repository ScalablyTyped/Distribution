package typings.pulumiCloud.serviceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceArguments extends Container {
  /**
    * A collection of containers that will be deployed as part of this Service, if there are multiple.
    */
  var containers: js.UndefOr[Containers] = js.undefined
  /**
    * The properties of the host where this service can run.
    */
  var host: js.UndefOr[HostProperties] = js.undefined
  /**
    * The number of copies of this Service's containers to deploy and maintain
    * as part of the running service.  Defaults to `1`.
    */
  var replicas: js.UndefOr[Double] = js.undefined
  /**
    *
    * Determines whether the service should wait to fully transition to a new steady state on creation and updates. If
    * set to false, the service may complete its deployment before it is fully ready to be used. Defaults to 'true'.
    */
  var waitForSteadyState: js.UndefOr[Boolean] = js.undefined
}

object ServiceArguments {
  @scala.inline
  def apply(
    build: String | ContainerBuild = null,
    command: Input[js.Array[String]] = null,
    containers: Containers = null,
    cpu: Input[Double] = null,
    dockerLabels: Input[StringDictionary[String]] = null,
    environment: StringDictionary[Input[String]] = null,
    function: () => Unit = null,
    host: HostProperties = null,
    image: Input[String] = null,
    memory: Input[Double] = null,
    memoryReservation: Input[Double] = null,
    ports: js.Array[ContainerPort] = null,
    replicas: Int | Double = null,
    volumes: js.Array[ContainerVolumeMount] = null,
    waitForSteadyState: js.UndefOr[Boolean] = js.undefined
  ): ServiceArguments = {
    val __obj = js.Dynamic.literal()
    if (build != null) __obj.updateDynamic("build")(build.asInstanceOf[js.Any])
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (containers != null) __obj.updateDynamic("containers")(containers.asInstanceOf[js.Any])
    if (cpu != null) __obj.updateDynamic("cpu")(cpu.asInstanceOf[js.Any])
    if (dockerLabels != null) __obj.updateDynamic("dockerLabels")(dockerLabels.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (function != null) __obj.updateDynamic("function")(js.Any.fromFunction0(function))
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (memory != null) __obj.updateDynamic("memory")(memory.asInstanceOf[js.Any])
    if (memoryReservation != null) __obj.updateDynamic("memoryReservation")(memoryReservation.asInstanceOf[js.Any])
    if (ports != null) __obj.updateDynamic("ports")(ports.asInstanceOf[js.Any])
    if (replicas != null) __obj.updateDynamic("replicas")(replicas.asInstanceOf[js.Any])
    if (volumes != null) __obj.updateDynamic("volumes")(volumes.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForSteadyState)) __obj.updateDynamic("waitForSteadyState")(waitForSteadyState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceArguments]
  }
}

