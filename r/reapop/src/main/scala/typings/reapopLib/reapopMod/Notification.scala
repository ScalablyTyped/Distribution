package typings
package reapopLib.reapopMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Notification extends js.Object {
  var allowHTML: js.UndefOr[scala.Boolean] = js.undefined
  var buttons: js.UndefOr[js.Array[Button]] = js.undefined
  var closeButton: js.UndefOr[scala.Boolean] = js.undefined
  var dismissAfter: js.UndefOr[scala.Double] = js.undefined
  var dismissible: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var image: js.UndefOr[java.lang.String] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var onAdd: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onRemove: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var position: js.UndefOr[java.lang.String | reapopLib.POSITION] = js.undefined
  var status: js.UndefOr[java.lang.String | scala.Double | reapopLib.STATUSES] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

