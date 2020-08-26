package typings.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseRecipient extends js.Object {
  /** Key/value pairs associated with a recipient. */
  var metadata: js.UndefOr[js.Any] = js.native
  /** SparkPost Enterprise API only. Email to use for envelope FROM. */
  var return_path: js.UndefOr[String] = js.native
  /** Key/value pairs associated with a recipient that are provided to the substitution engine. */
  var substitution_data: js.UndefOr[js.Any] = js.native
  /** Array of text labels associated with a recipient. */
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object BaseRecipient {
  @scala.inline
  def apply(): BaseRecipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseRecipient]
  }
  @scala.inline
  implicit class BaseRecipientOps[Self <: BaseRecipient] (val x: Self) extends AnyVal {
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
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setReturn_path(value: String): Self = this.set("return_path", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_path: Self = this.set("return_path", js.undefined)
    @scala.inline
    def setSubstitution_data(value: js.Any): Self = this.set("substitution_data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubstitution_data: Self = this.set("substitution_data", js.undefined)
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

