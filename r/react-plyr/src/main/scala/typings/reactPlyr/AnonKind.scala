package typings.reactPlyr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKind extends js.Object {
  var default: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[js.Any] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var src: String
  var srclang: js.UndefOr[String] = js.undefined
}

object AnonKind {
  @scala.inline
  def apply(
    src: String,
    default: js.UndefOr[Boolean] = js.undefined,
    key: js.Any = null,
    kind: String = null,
    label: String = null,
    srclang: String = null
  ): AnonKind = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (srclang != null) __obj.updateDynamic("srclang")(srclang.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKind]
  }
}

