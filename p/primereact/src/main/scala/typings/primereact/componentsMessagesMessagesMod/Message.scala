package typings.primereact.componentsMessagesMessagesMod

import typings.primereact.primereactStrings.error
import typings.primereact.primereactStrings.info
import typings.primereact.primereactStrings.success
import typings.primereact.primereactStrings.warn
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var closable: js.UndefOr[Boolean] = js.undefined
  var detail: js.UndefOr[ReactNode] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var life: js.UndefOr[Double] = js.undefined
  var severity: js.UndefOr[success | info | warn | error] = js.undefined
  var sticky: js.UndefOr[Boolean] = js.undefined
  var summary: js.UndefOr[ReactNode] = js.undefined
}

object Message {
  @scala.inline
  def apply(
    closable: js.UndefOr[Boolean] = js.undefined,
    detail: ReactNode = null,
    id: String = null,
    life: Int | Double = null,
    severity: success | info | warn | error = null,
    sticky: js.UndefOr[Boolean] = js.undefined,
    summary: ReactNode = null
  ): Message = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (life != null) __obj.updateDynamic("life")(life.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (!js.isUndefined(sticky)) __obj.updateDynamic("sticky")(sticky.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

