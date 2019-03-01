package typings
package qwestLib.QwestNs

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
    `catch`: js.Function1[
      js.Function3[/* e */ js.Any, /* xhr */ js.UndefOr[js.Any], /* response */ js.UndefOr[js.Any], _], 
      Promise
    ],
    complete: js.Function1[js.Function0[_], Promise],
    `then`: js.Function1[js.Function2[/* xhr */ js.Any, /* response */ js.UndefOr[js.Any], _], Promise]
  ): Promise = {
    val __obj = js.Dynamic.literal(`catch` = `catch`, `then` = `then`)
    __obj.updateDynamic("complete")(complete)
    __obj.asInstanceOf[Promise]
  }
}

