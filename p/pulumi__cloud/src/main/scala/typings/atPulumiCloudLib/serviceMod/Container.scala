package typings
package atPulumiCloudLib.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Container extends js.Object {
  /**
       * Either a path to a folder in which a Docker build should be run to construct the image for this
       * Container, or a ContainerBuild object with more detailed build instructions.  If `image` is also specified, the
       * built container will be tagged with that name, but otherwise will get an auto-generated image name.
       */
  var build: js.UndefOr[java.lang.String | ContainerBuild] = js.undefined
  /**
       * The command line that is passed to the container. This parameter maps to
       * `Cmd` in the [Create a
       * container](https://docs.docker.com/engine/reference/api/docker_remote_api_v1.19/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.docker.com/engine/reference/api/docker_remote_api_v1.19/)
       * and the `COMMAND` parameter to [docker run](https://docs.docker.com/engine/reference/commandline/run/). For more
       * information about the Docker `CMD` parameter, go to
       * https://docs.docker.com/engine/reference/builder/#cmd.
       */
  var command: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
  /**
       * Number of CPUs for the container to use. Maps to the Docker `--cpus` option - see
       * https://docs.docker.com/engine/reference/commandline/run.
       */
  var cpu: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
       * A key/value map of labels to add to the container. This parameter maps to Labels in the [Create a
       * container](https://docs.docker.com/engine/api/v1.27/#operation/ContainerCreate) section of the [Docker Remote
       * API](https://docs.docker.com/engine/api/v1.27/) and the --label option to [docker
       * run](https://docs.docker.com/engine/reference/run/).
       */
  var dockerLabels: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[java.lang.String]]
  ] = js.undefined
  /**
       * Optional environment variables to set and make available to the container
       * as it is running.
       */
  var environment: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]
  ] = js.undefined
  /**
       * The function code to use as the implementation of the contaner.  If `function` is specified,
       * neither `image` nor `build` are legal.
       */
  var function: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * The image to use for the container.  If `image` is specified, but not `build`, the image will be
       * pulled from the Docker Hub.  If `image` *and* `build` are specified, the `image` controls the
       * resulting image tag for the build image that gets pushed.
       */
  var image: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
       * The maximum amount of memory the container will be allowed to use. Maps to the Docker
       * `--memory` option - see
       * https://docs.docker.com/engine/reference/commandline/run.
       *
       * This should be supplied in MB. i.e. A value of 1024 would equal one gigabyte.
       */
  var memory: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
       * The amount of memory to reserve for the container, but the container will
       * be allowed to use more memory if it's available.  At least one of
       * `memory` and `memoryReservation` must be specified.  Maps to the Docker
       * `--memory-reservation` option - see
       * https://docs.docker.com/engine/reference/commandline/run.
       *
       * This should be supplied in MB. i.e. A value of 1024 would equal one gigabyte.
       */
  var memoryReservation: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
       * An array of ports to publish from the container.  Ports are exposed using the TCP protocol.  If the [external]
       * flag is true, the port will be exposed to the Internet even if the service is running in a private network.
       * Maps to the Docker `--publish` option - see
       * https://docs.docker.com/engine/reference/commandline/run.
       */
  var ports: js.UndefOr[js.Array[ContainerPort]] = js.undefined
  /**
       * An array of volume mounts, indicating a volume to mount and a path within
       * the container at which to moung the volume.  Maps to the Docker
       * `--volume` option - see
       * https://docs.docker.com/engine/reference/commandline/run.
       */
  var volumes: js.UndefOr[js.Array[ContainerVolumeMount]] = js.undefined
}

