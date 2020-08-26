package typings.pulumiAws.outputMod.ssm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentAttachmentsSource extends js.Object {
  /**
    * The key describing the location of an attachment to a document. Valid key types include: `SourceUrl` and `S3FileUrl`
    */
  var key: String = js.native
  /**
    * The name of the document attachment file
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The value describing the location of an attachment to a document
    */
  var values: js.Array[String] = js.native
}

object DocumentAttachmentsSource {
  @scala.inline
  def apply(key: String, values: js.Array[String]): DocumentAttachmentsSource = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentAttachmentsSource]
  }
  @scala.inline
  implicit class DocumentAttachmentsSourceOps[Self <: DocumentAttachmentsSource] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: String*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[String]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

