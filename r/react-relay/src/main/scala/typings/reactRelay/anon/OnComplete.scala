package typings.reactRelay.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnComplete extends js.Object {
  var onComplete: js.UndefOr[js.Function1[/* arg */ typings.std.Error | Null, Unit]] = js.undefined
}

object OnComplete {
  @scala.inline
  def apply(onComplete: /* arg */ typings.std.Error | Null => Unit = null): OnComplete = {
    val __obj = js.Dynamic.literal()
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    __obj.asInstanceOf[OnComplete]
  }
}

