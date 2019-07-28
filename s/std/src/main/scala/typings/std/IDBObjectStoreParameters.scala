package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDBObjectStoreParameters extends js.Object {
  var autoIncrement: js.UndefOr[scala.Boolean] = js.undefined
  var keyPath: js.UndefOr[java.lang.String | js.Array[java.lang.String] | Null] = js.undefined
}

object IDBObjectStoreParameters {
  @scala.inline
  def apply(
    autoIncrement: js.UndefOr[scala.Boolean] = js.undefined,
    keyPath: java.lang.String | js.Array[java.lang.String] = null
  ): IDBObjectStoreParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoIncrement)) __obj.updateDynamic("autoIncrement")(autoIncrement)
    if (keyPath != null) __obj.updateDynamic("keyPath")(keyPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBObjectStoreParameters]
  }
}

