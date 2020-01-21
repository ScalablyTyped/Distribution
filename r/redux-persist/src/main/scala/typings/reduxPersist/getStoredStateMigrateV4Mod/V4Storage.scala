package typings.reduxPersist.getStoredStateMigrateV4Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V4Storage extends js.Object {
  var getAllKeys: js.UndefOr[
    js.Function1[/* cb */ js.Function2[/* err */ js.Any, /* allKeys */ js.Array[String], _], _]
  ] = js.undefined
  var getItem: js.UndefOr[
    js.Function1[
      /* cb */ js.Function2[/* err */ js.Any, /* serialized */ js.UndefOr[String | Null], _], 
      _
    ]
  ] = js.undefined
  var keys: js.UndefOr[
    js.Function1[/* cb */ js.Function2[/* err */ js.Any, /* allKeys */ js.Array[String], _], _]
  ] = js.undefined
}

object V4Storage {
  @scala.inline
  def apply(
    getAllKeys: /* cb */ js.Function2[/* err */ js.Any, /* allKeys */ js.Array[String], _] => _ = null,
    getItem: /* cb */ js.Function2[/* err */ js.Any, /* serialized */ js.UndefOr[String | Null], _] => _ = null,
    keys: /* cb */ js.Function2[/* err */ js.Any, /* allKeys */ js.Array[String], _] => _ = null
  ): V4Storage = {
    val __obj = js.Dynamic.literal()
    if (getAllKeys != null) __obj.updateDynamic("getAllKeys")(js.Any.fromFunction1(getAllKeys))
    if (getItem != null) __obj.updateDynamic("getItem")(js.Any.fromFunction1(getItem))
    if (keys != null) __obj.updateDynamic("keys")(js.Any.fromFunction1(keys))
    __obj.asInstanceOf[V4Storage]
  }
}

