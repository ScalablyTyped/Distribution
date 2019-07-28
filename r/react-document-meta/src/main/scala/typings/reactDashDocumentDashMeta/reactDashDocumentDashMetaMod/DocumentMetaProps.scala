package typings.reactDashDocumentDashMeta.reactDashDocumentDashMetaMod

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
    if (canonical != null) __obj.updateDynamic("canonical")(canonical)
    if (description != null) __obj.updateDynamic("description")(description)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[DocumentMetaProps]
  }
}

