package typings.qwest.Qwest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Promise extends js.Object {
  /** Request has failed */
  def `catch`(
    callback: js.Function3[/* e */ js.Any, /* xhr */ js.UndefOr[js.Any], /* response */ js.UndefOr[js.Any], _]
  ): Promise
  /** Always run */
  def complete(callback: js.Function0[_]): Promise
  /** Request is successful */
  def `then`(callback: js.Function2[/* xhr */ js.Any, /* response */ js.UndefOr[js.Any], _]): Promise
}

object Promise {
  @scala.inline
  def apply(
    `catch`: js.Function3[/* e */ js.Any, /* xhr */ js.UndefOr[js.Any], /* response */ js.UndefOr[js.Any], _] => Promise,
    complete: js.Function0[_] => Promise,
    `then`: js.Function2[/* xhr */ js.Any, /* response */ js.UndefOr[js.Any], _] => Promise
  ): Promise = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
    __obj.updateDynamic("catch")(js.Any.fromFunction1(`catch`))
    __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
    __obj.asInstanceOf[Promise]
  }
}

