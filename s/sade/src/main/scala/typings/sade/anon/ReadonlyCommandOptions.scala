package typings.sade.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<sade.sade.CommandOptions> */
trait ReadonlyCommandOptions extends js.Object {
  val alias: js.UndefOr[String | js.Array[String]] = js.undefined
  val default: js.UndefOr[Boolean] = js.undefined
}

object ReadonlyCommandOptions {
  @scala.inline
  def apply(alias: String | js.Array[String] = null, default: js.UndefOr[Boolean] = js.undefined): ReadonlyCommandOptions = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyCommandOptions]
  }
}

