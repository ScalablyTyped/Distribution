package typings.reactDocumentMeta.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentMetaProps extends js.Object {
  val canonical: js.UndefOr[String] = js.native
  val description: js.UndefOr[String] = js.native
  val title: js.UndefOr[String] = js.native
}

object DocumentMetaProps {
  @scala.inline
  def apply(): DocumentMetaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentMetaProps]
  }
  @scala.inline
  implicit class DocumentMetaPropsOps[Self <: DocumentMetaProps] (val x: Self) extends AnyVal {
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
    def setCanonical(value: String): Self = this.set("canonical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanonical: Self = this.set("canonical", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

