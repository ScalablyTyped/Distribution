package typings.reactDashInstantsearchDashDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var Root: String | (js.Function1[/* repeated */ js.Any, _])
  var props: js.UndefOr[js.Object] = js.undefined
}

object Anon_Args {
  @scala.inline
  def apply(Root: String | (js.Function1[/* repeated */ js.Any, _]), props: js.Object = null): Anon_Args = {
    val __obj = js.Dynamic.literal(Root = Root.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props)
    __obj.asInstanceOf[Anon_Args]
  }
}

