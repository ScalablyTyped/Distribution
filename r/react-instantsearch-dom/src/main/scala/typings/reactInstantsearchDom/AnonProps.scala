package typings.reactInstantsearchDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProps extends js.Object {
  var Root: String | (js.Function1[/* repeated */ js.Any, _])
  var props: js.UndefOr[js.Object] = js.undefined
}

object AnonProps {
  @scala.inline
  def apply(Root: String | (js.Function1[/* repeated */ js.Any, _]), props: js.Object = null): AnonProps = {
    val __obj = js.Dynamic.literal(Root = Root.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProps]
  }
}

