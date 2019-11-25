package typings.sparkpost.sparkpostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseRecipient extends js.Object {
  /** Key/value pairs associated with a recipient. */
  var metadata: js.UndefOr[js.Any] = js.undefined
  /** SparkPost Enterprise API only. Email to use for envelope FROM. */
  var return_path: js.UndefOr[String] = js.undefined
  /** Key/value pairs associated with a recipient that are provided to the substitution engine. */
  var substitution_data: js.UndefOr[js.Any] = js.undefined
  /** Array of text labels associated with a recipient. */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object BaseRecipient {
  @scala.inline
  def apply(
    metadata: js.Any = null,
    return_path: String = null,
    substitution_data: js.Any = null,
    tags: js.Array[String] = null
  ): BaseRecipient = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (return_path != null) __obj.updateDynamic("return_path")(return_path.asInstanceOf[js.Any])
    if (substitution_data != null) __obj.updateDynamic("substitution_data")(substitution_data.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseRecipient]
  }
}

