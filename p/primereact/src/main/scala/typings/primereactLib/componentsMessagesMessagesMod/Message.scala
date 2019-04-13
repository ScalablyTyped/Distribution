package typings
package primereactLib.componentsMessagesMessagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var closable: js.UndefOr[scala.Boolean] = js.undefined
  var detail: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var life: js.UndefOr[scala.Double] = js.undefined
  var severity: js.UndefOr[
    primereactLib.primereactLibStrings.success | primereactLib.primereactLibStrings.info | primereactLib.primereactLibStrings.warn | primereactLib.primereactLibStrings.error
  ] = js.undefined
  var sticky: js.UndefOr[scala.Boolean] = js.undefined
  var summary: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object Message {
  @scala.inline
  def apply(
    closable: js.UndefOr[scala.Boolean] = js.undefined,
    detail: reactLib.reactMod.ReactNode = null,
    id: java.lang.String = null,
    life: scala.Int | scala.Double = null,
    severity: primereactLib.primereactLibStrings.success | primereactLib.primereactLibStrings.info | primereactLib.primereactLibStrings.warn | primereactLib.primereactLibStrings.error = null,
    sticky: js.UndefOr[scala.Boolean] = js.undefined,
    summary: reactLib.reactMod.ReactNode = null
  ): Message = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (life != null) __obj.updateDynamic("life")(life.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (!js.isUndefined(sticky)) __obj.updateDynamic("sticky")(sticky)
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

