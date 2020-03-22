package typings.reactRelay

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnComplete extends js.Object {
  var onComplete: js.UndefOr[js.Function1[/* arg */ Error | Null, Unit]] = js.undefined
}

object AnonOnComplete {
  @scala.inline
  def apply(onComplete: /* arg */ Error | Null => Unit = null): AnonOnComplete = {
    val __obj = js.Dynamic.literal()
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    __obj.asInstanceOf[AnonOnComplete]
  }
}

