package typings.prosemirrorView.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnRemove extends js.Object {
  var onRemove: js.UndefOr[(js.Function1[/* decorationSpec */ StringDictionary[js.Any], Unit]) | Null] = js.undefined
}

object OnRemove {
  @scala.inline
  def apply(
    onRemove: js.UndefOr[Null | (/* decorationSpec */ StringDictionary[js.Any] => Unit)] = js.undefined
  ): OnRemove = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(onRemove)) __obj.updateDynamic("onRemove")(if (onRemove != null) js.Any.fromFunction1(onRemove.asInstanceOf[/* decorationSpec */ StringDictionary[js.Any] => Unit]) else null)
    __obj.asInstanceOf[OnRemove]
  }
}

