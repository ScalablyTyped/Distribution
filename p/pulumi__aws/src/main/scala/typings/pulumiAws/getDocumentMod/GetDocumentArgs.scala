package typings.pulumiAws.getDocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDocumentArgs extends js.Object {
  /**
    * Returns the document in the specified format. The document format can be either JSON or YAML. JSON is the default format.
    */
  val documentFormat: js.UndefOr[String] = js.native
  /**
    * The document version for which you want information.
    */
  val documentVersion: js.UndefOr[String] = js.native
  /**
    * The name of the Systems Manager document.
    */
  val name: String = js.native
}

object GetDocumentArgs {
  @scala.inline
  def apply(name: String): GetDocumentArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDocumentArgs]
  }
  @scala.inline
  implicit class GetDocumentArgsOps[Self <: GetDocumentArgs] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocumentFormat(value: String): Self = this.set("documentFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentFormat: Self = this.set("documentFormat", js.undefined)
    @scala.inline
    def setDocumentVersion(value: String): Self = this.set("documentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentVersion: Self = this.set("documentVersion", js.undefined)
  }
  
}

