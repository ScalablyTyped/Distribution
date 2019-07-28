package typings.prosemirrorDashView

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DecorationSpec extends js.Object {
  var onRemove: js.UndefOr[(js.Function1[/* decorationSpec */ StringDictionary[js.Any], Unit]) | Null] = js.undefined
}

object Anon_DecorationSpec {
  @scala.inline
  def apply(onRemove: /* decorationSpec */ StringDictionary[js.Any] => Unit = null): Anon_DecorationSpec = {
    val __obj = js.Dynamic.literal()
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1(onRemove))
    __obj.asInstanceOf[Anon_DecorationSpec]
  }
}

