package typings.reactDocumentTitle.mod

import typings.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentTitleProps extends js.Object {
  var children: js.UndefOr[ReactChild | Null] = js.undefined
  var title: String
}

object DocumentTitleProps {
  @scala.inline
  def apply(title: String, children: js.UndefOr[Null | ReactChild] = js.undefined): DocumentTitleProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentTitleProps]
  }
}

