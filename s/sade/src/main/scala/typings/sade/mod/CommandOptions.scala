package typings.sade.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandOptions extends js.Object {
  /**
    * Optionally define one or more aliases for the current Command.
    * When declared, the `opts.alias` value is passed directly to the [`prog.alias`](#progaliasnames) method.
    */
  var alias: js.UndefOr[String | js.Array[String]] = js.undefined
  var default: js.UndefOr[Boolean] = js.undefined
}

object CommandOptions {
  @scala.inline
  def apply(alias: String | js.Array[String] = null, default: js.UndefOr[Boolean] = js.undefined): CommandOptions = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandOptions]
  }
}

