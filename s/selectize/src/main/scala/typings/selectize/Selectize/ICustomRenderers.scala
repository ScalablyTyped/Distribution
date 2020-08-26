package typings.selectize.Selectize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Custom rendering functions. Each function should accept two arguments: "data" and "escape" and return
  * HTML (string) with a single root element. The "escape" argument is a function that takes a string and
  * escapes all special HTML characters. This is very important to use to prevent XSS vulnerabilities.
  */
@js.native
trait ICustomRenderers[U] extends js.Object {
  // An item the user has selected.
  var item: js.UndefOr[
    js.Function2[/* data */ U, /* escape */ js.Function1[/* input */ String, String], String]
  ] = js.native
  // The wrapper for an optgroup. The "html" property in the data will be the raw html of the optgroup's header
  // and options.
  var optgroup: js.UndefOr[
    js.Function2[/* data */ U, /* escape */ js.Function1[/* input */ String, String], String]
  ] = js.native
  // The header of an option group.
  var optgroup_header: js.UndefOr[
    js.Function2[/* data */ U, /* escape */ js.Function1[/* input */ String, String], String]
  ] = js.native
  // An option in the dropdown list of available options.
  var option: js.UndefOr[
    js.Function2[/* data */ U, /* escape */ js.Function1[/* input */ String, String], String]
  ] = js.native
  // The "create new" option at the bottom of the dropdown. The data contains one property: "input"
  // (which is what the user has typed).
  var option_create: js.UndefOr[
    js.Function2[/* data */ U, /* escape */ js.Function1[/* input */ String, String], String]
  ] = js.native
}

object ICustomRenderers {
  @scala.inline
  def apply[U](): ICustomRenderers[U] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICustomRenderers[U]]
  }
  @scala.inline
  implicit class ICustomRenderersOps[Self <: ICustomRenderers[_], U] (val x: Self with ICustomRenderers[U]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setItem(value: (/* data */ U, /* escape */ js.Function1[/* input */ String, String]) => String): Self = this.set("item", js.Any.fromFunction2(value))
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def setOptgroup(value: (/* data */ U, /* escape */ js.Function1[/* input */ String, String]) => String): Self = this.set("optgroup", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOptgroup: Self = this.set("optgroup", js.undefined)
    @scala.inline
    def setOptgroup_header(value: (/* data */ U, /* escape */ js.Function1[/* input */ String, String]) => String): Self = this.set("optgroup_header", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOptgroup_header: Self = this.set("optgroup_header", js.undefined)
    @scala.inline
    def setOption(value: (/* data */ U, /* escape */ js.Function1[/* input */ String, String]) => String): Self = this.set("option", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOption: Self = this.set("option", js.undefined)
    @scala.inline
    def setOption_create(value: (/* data */ U, /* escape */ js.Function1[/* input */ String, String]) => String): Self = this.set("option_create", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOption_create: Self = this.set("option_create", js.undefined)
  }
  
}

