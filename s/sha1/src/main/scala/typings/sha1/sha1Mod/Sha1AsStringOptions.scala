package typings.sha1.sha1Mod

import typings.sha1.sha1Numbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sha1AsStringOptions extends Sha1Options {
  var asBytes: js.UndefOr[`false`] = js.undefined
  var asString: js.UndefOr[Boolean] = js.undefined
}

object Sha1AsStringOptions {
  @scala.inline
  def apply(asBytes: `false` = null, asString: js.UndefOr[Boolean] = js.undefined): Sha1AsStringOptions = {
    val __obj = js.Dynamic.literal()
    if (asBytes != null) __obj.updateDynamic("asBytes")(asBytes)
    if (!js.isUndefined(asString)) __obj.updateDynamic("asString")(asString)
    __obj.asInstanceOf[Sha1AsStringOptions]
  }
}

