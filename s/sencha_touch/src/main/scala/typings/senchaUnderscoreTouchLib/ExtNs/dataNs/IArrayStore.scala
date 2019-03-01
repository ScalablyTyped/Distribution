package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IArrayStore extends IStore {
  /** [Method] Loads an array of data straight into the Store
  		* @param data Object
  		* @param append Object
  		*/
  @JSName("loadData")
  var loadData_IArrayStore: js.UndefOr[
    js.Function2[/* data */ js.UndefOr[js.Any], /* append */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
}

object IArrayStore {
  @scala.inline
  def apply(
    IStore: IStore = null,
    getProxy: js.Function0[_] = null,
    loadData: js.Function2[/* data */ js.UndefOr[js.Any], /* append */ js.UndefOr[js.Any], scala.Unit] = null,
    proxy: js.Any = null,
    setProxy: js.Function1[/* proxy */ js.UndefOr[js.Any], scala.Unit] = null
  ): IArrayStore = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IStore)
    if (getProxy != null) __obj.updateDynamic("getProxy")(getProxy)
    if (loadData != null) __obj.updateDynamic("loadData")(loadData)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (setProxy != null) __obj.updateDynamic("setProxy")(setProxy)
    __obj.asInstanceOf[IArrayStore]
  }
}

