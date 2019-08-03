package typings.slate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PreserveKeys extends js.Object {
  var preserveKeys: js.UndefOr[Boolean] = js.undefined
}

object Anon_PreserveKeys {
  @scala.inline
  def apply(preserveKeys: js.UndefOr[Boolean] = js.undefined): Anon_PreserveKeys = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preserveKeys)) __obj.updateDynamic("preserveKeys")(preserveKeys)
    __obj.asInstanceOf[Anon_PreserveKeys]
  }
}

