package typings
package redomLib.redomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedomComponent extends js.Object {
  var el: stdLib.HTMLElement
  var onmount: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onremount: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onunmount: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var update: js.UndefOr[
    js.Function4[
      /* item */ js.Any, 
      /* index */ scala.Double, 
      /* data */ js.Any, 
      /* context */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
}

object RedomComponent {
  @scala.inline
  def apply(
    el: stdLib.HTMLElement,
    onmount: () => scala.Unit = null,
    onremount: () => scala.Unit = null,
    onunmount: () => scala.Unit = null,
    update: (/* item */ js.Any, /* index */ scala.Double, /* data */ js.Any, /* context */ js.UndefOr[js.Any]) => scala.Unit = null
  ): RedomComponent = {
    val __obj = js.Dynamic.literal(el = el)
    if (onmount != null) __obj.updateDynamic("onmount")(js.Any.fromFunction0(onmount))
    if (onremount != null) __obj.updateDynamic("onremount")(js.Any.fromFunction0(onremount))
    if (onunmount != null) __obj.updateDynamic("onunmount")(js.Any.fromFunction0(onunmount))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction4(update))
    __obj.asInstanceOf[RedomComponent]
  }
}

