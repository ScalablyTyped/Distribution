package typings.reactBootstrapTypeahead.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderProps extends js.Object {
  var bsSize: TypeaheadBsSizes
}

object LoaderProps {
  @scala.inline
  def apply(bsSize: TypeaheadBsSizes): LoaderProps = {
    val __obj = js.Dynamic.literal(bsSize = bsSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderProps]
  }
}

