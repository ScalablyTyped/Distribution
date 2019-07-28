package typings.atPulumiAws.sagemakerNotebookInstanceLifecycleConfigurationMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotebookInstanceLifecycleConfigurationState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) assigned by AWS to this lifecycle configuration.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * A shell script (base64-encoded) that runs only once when the SageMaker Notebook Instance is created.
    */
  val onCreate: js.UndefOr[Input[String]] = js.undefined
  /**
    * A shell script (base64-encoded) that runs every time the SageMaker Notebook Instance is started including the time it's created.
    */
  val onStart: js.UndefOr[Input[String]] = js.undefined
}

object NotebookInstanceLifecycleConfigurationState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    name: Input[String] = null,
    onCreate: Input[String] = null,
    onStart: Input[String] = null
  ): NotebookInstanceLifecycleConfigurationState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onCreate != null) __obj.updateDynamic("onCreate")(onCreate.asInstanceOf[js.Any])
    if (onStart != null) __obj.updateDynamic("onStart")(onStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookInstanceLifecycleConfigurationState]
  }
}

