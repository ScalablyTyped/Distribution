package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDirectStore extends IStore

object IDirectStore {
  @scala.inline
  def apply(
    IStore: IStore = null,
    getProxy: js.Function0[_] = null,
    proxy: js.Any = null,
    setProxy: js.Function1[/* proxy */ js.UndefOr[js.Any], scala.Unit] = null
  ): IDirectStore = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IStore)
    if (getProxy != null) __obj.updateDynamic("getProxy")(getProxy)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (setProxy != null) __obj.updateDynamic("setProxy")(setProxy)
    __obj.asInstanceOf[IDirectStore]
  }
}

