package typings.pulumiAws.outputMod.ssm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentAttachmentsSource extends js.Object {
  var key: String = js.native
  /**
    * The name of the document.
    */
  var name: js.UndefOr[String] = js.native
  var values: js.Array[String] = js.native
}

object DocumentAttachmentsSource {
  @scala.inline
  def apply(key: String, values: js.Array[String], name: String = null): DocumentAttachmentsSource = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentAttachmentsSource]
  }
}

