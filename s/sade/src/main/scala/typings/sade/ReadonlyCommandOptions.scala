package typings.sade

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<sade.sade.CommandOptions> */
trait ReadonlyCommandOptions extends js.Object {
  val default: js.UndefOr[Boolean] = js.undefined
}

object ReadonlyCommandOptions {
  @scala.inline
  def apply(default: js.UndefOr[Boolean] = js.undefined): ReadonlyCommandOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyCommandOptions]
  }
}

