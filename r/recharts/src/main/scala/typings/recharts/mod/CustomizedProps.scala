package typings.recharts.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomizedProps extends js.Object {
  var component: ContentRenderer[_] | ReactElement
}

object CustomizedProps {
  @scala.inline
  def apply(component: ContentRenderer[_] | ReactElement): CustomizedProps = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomizedProps]
  }
}

