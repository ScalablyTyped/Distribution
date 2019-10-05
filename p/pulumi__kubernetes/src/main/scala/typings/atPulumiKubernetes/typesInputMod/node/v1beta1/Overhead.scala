package typings.atPulumiKubernetes.typesInputMod.node.v1beta1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Overhead structure represents the resource overhead associated with running a pod.
  */
trait Overhead extends js.Object {
  /**
    * PodFixed represents the fixed resource overhead associated with running a pod.
    */
  var podFixed: js.UndefOr[Input[js.Object]] = js.undefined
}

object Overhead {
  @scala.inline
  def apply(podFixed: Input[js.Object] = null): Overhead = {
    val __obj = js.Dynamic.literal()
    if (podFixed != null) __obj.updateDynamic("podFixed")(podFixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overhead]
  }
}

