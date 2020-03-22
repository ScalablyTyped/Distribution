package typings.reduxForm.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ P in keyof FormData ]:? react.react.ReactElement | string | redux-form.redux-form.WarningOther<T>} */
trait FormWarnings[FormData, T] extends js.Object {
  var append: js.UndefOr[ReactElement | String | WarningOther[T]] = js.undefined
  var delete: js.UndefOr[ReactElement | String | WarningOther[T]] = js.undefined
  var entries: js.UndefOr[ReactElement | String | WarningOther[T]] = js.undefined
  var forEach: js.UndefOr[ReactElement | String | WarningOther[T]] = js.undefined
  var get: js.UndefOr[ReactElement | String | WarningOther[T]] = js.undefined
  var getAll: js.UndefOr[ReactElement | String | WarningOther[T]] = js.undefined
  var has: js.UndefOr[ReactElement | String | WarningOther[T]] = js.undefined
  var keys: js.UndefOr[ReactElement | String | WarningOther[T]] = js.undefined
  var set: js.UndefOr[ReactElement | String | WarningOther[T]] = js.undefined
  var values: js.UndefOr[ReactElement | String | WarningOther[T]] = js.undefined
}

object FormWarnings {
  @scala.inline
  def apply[FormData, T](
    append: ReactElement | String | WarningOther[T] = null,
    delete: ReactElement | String | WarningOther[T] = null,
    entries: ReactElement | String | WarningOther[T] = null,
    forEach: ReactElement | String | WarningOther[T] = null,
    get: ReactElement | String | WarningOther[T] = null,
    getAll: ReactElement | String | WarningOther[T] = null,
    has: ReactElement | String | WarningOther[T] = null,
    keys: ReactElement | String | WarningOther[T] = null,
    set: ReactElement | String | WarningOther[T] = null,
    values: ReactElement | String | WarningOther[T] = null
  ): FormWarnings[FormData, T] = {
    val __obj = js.Dynamic.literal()
    if (append != null) __obj.updateDynamic("append")(append.asInstanceOf[js.Any])
    if (delete != null) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (forEach != null) __obj.updateDynamic("forEach")(forEach.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(get.asInstanceOf[js.Any])
    if (getAll != null) __obj.updateDynamic("getAll")(getAll.asInstanceOf[js.Any])
    if (has != null) __obj.updateDynamic("has")(has.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormWarnings[FormData, T]]
  }
}

