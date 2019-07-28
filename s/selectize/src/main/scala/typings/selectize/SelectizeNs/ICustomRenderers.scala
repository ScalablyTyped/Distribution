package typings.selectize.SelectizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Custom rendering functions. Each function should accept two arguments: "data" and "escape" and return
  * HTML (string) with a single root element. The "escape" argument is a function that takes a string and
  * escapes all special HTML characters. This is very important to use to prevent XSS vulnerabilities.
  */
trait ICustomRenderers[U] extends js.Object {
  // An item the user has selected.
  var item: js.UndefOr[
    js.Function2[/* data */ U, /* escape */ js.Function1[/* input */ String, String], String]
  ] = js.undefined
  // The wrapper for an optgroup. The "html" property in the data will be the raw html of the optgroup's header
  // and options.
  var optgroup: js.UndefOr[
    js.Function2[/* data */ U, /* escape */ js.Function1[/* input */ String, String], String]
  ] = js.undefined
  // The header of an option group.
  var optgroup_header: js.UndefOr[
    js.Function2[/* data */ U, /* escape */ js.Function1[/* input */ String, String], String]
  ] = js.undefined
  // An option in the dropdown list of available options.
  var option: js.UndefOr[
    js.Function2[/* data */ U, /* escape */ js.Function1[/* input */ String, String], String]
  ] = js.undefined
  // The "create new" option at the bottom of the dropdown. The data contains one property: "input"
  // (which is what the user has typed).
  var option_create: js.UndefOr[
    js.Function2[/* data */ U, /* escape */ js.Function1[/* input */ String, String], String]
  ] = js.undefined
}

object ICustomRenderers {
  @scala.inline
  def apply[U](
    item: (/* data */ U, /* escape */ js.Function1[/* input */ String, String]) => String = null,
    optgroup: (/* data */ U, /* escape */ js.Function1[/* input */ String, String]) => String = null,
    optgroup_header: (/* data */ U, /* escape */ js.Function1[/* input */ String, String]) => String = null,
    option: (/* data */ U, /* escape */ js.Function1[/* input */ String, String]) => String = null,
    option_create: (/* data */ U, /* escape */ js.Function1[/* input */ String, String]) => String = null
  ): ICustomRenderers[U] = {
    val __obj = js.Dynamic.literal()
    if (item != null) __obj.updateDynamic("item")(js.Any.fromFunction2(item))
    if (optgroup != null) __obj.updateDynamic("optgroup")(js.Any.fromFunction2(optgroup))
    if (optgroup_header != null) __obj.updateDynamic("optgroup_header")(js.Any.fromFunction2(optgroup_header))
    if (option != null) __obj.updateDynamic("option")(js.Any.fromFunction2(option))
    if (option_create != null) __obj.updateDynamic("option_create")(js.Any.fromFunction2(option_create))
    __obj.asInstanceOf[ICustomRenderers[U]]
  }
}

