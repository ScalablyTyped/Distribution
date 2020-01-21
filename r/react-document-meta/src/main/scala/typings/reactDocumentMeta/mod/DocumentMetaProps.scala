package typings.reactDocumentMeta.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentMetaProps extends js.Object {
  val canonical: js.UndefOr[String] = js.undefined
  val description: js.UndefOr[String] = js.undefined
  val title: js.UndefOr[String] = js.undefined
}

object DocumentMetaProps {
  @scala.inline
  def apply(canonical: String = null, description: String = null, title: String = null): DocumentMetaProps = {
    val __obj = js.Dynamic.literal()
    if (canonical != null) __obj.updateDynamic("canonical")(canonical.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentMetaProps]
  }
}

