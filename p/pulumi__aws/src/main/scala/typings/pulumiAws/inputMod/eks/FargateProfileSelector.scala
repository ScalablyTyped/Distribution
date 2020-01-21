package typings.pulumiAws.inputMod.eks

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FargateProfileSelector extends js.Object {
  /**
    * Key-value mapping of Kubernetes labels for selection.
    */
  var labels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Kubernetes namespace for selection.
    */
  var namespace: Input[String] = js.native
}

object FargateProfileSelector {
  @scala.inline
  def apply(namespace: Input[String], labels: Input[StringDictionary[Input[String]]] = null): FargateProfileSelector = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[FargateProfileSelector]
  }
}

