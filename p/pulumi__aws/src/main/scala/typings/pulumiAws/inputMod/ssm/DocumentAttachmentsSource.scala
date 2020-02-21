package typings.pulumiAws.inputMod.ssm

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentAttachmentsSource extends js.Object {
  var key: Input[String] = js.native
  /**
    * The name of the document.
    */
  var name: js.UndefOr[Input[String]] = js.native
  var values: Input[js.Array[Input[String]]] = js.native
}

object DocumentAttachmentsSource {
  @scala.inline
  def apply(key: Input[String], values: Input[js.Array[Input[String]]], name: Input[String] = null): DocumentAttachmentsSource = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentAttachmentsSource]
  }
}

