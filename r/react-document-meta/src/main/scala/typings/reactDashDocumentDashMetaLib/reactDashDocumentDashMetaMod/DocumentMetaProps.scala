package typings
package reactDashDocumentDashMetaLib.reactDashDocumentDashMetaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentMetaProps extends js.Object {
  val canonical: js.UndefOr[java.lang.String] = js.undefined
  val description: js.UndefOr[java.lang.String] = js.undefined
  val title: js.UndefOr[java.lang.String] = js.undefined
}

object DocumentMetaProps {
  @scala.inline
  def apply(
    canonical: java.lang.String = null,
    description: java.lang.String = null,
    title: java.lang.String = null
  ): DocumentMetaProps = {
    val __obj = js.Dynamic.literal()
    if (canonical != null) __obj.updateDynamic("canonical")(canonical)
    if (description != null) __obj.updateDynamic("description")(description)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[DocumentMetaProps]
  }
}

