package typings.reactSizeme.mod

import typings.reactSizeme.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeMeProps extends js.Object {
  val size: Height
}

object SizeMeProps {
  @scala.inline
  def apply(size: Height): SizeMeProps = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeMeProps]
  }
}

