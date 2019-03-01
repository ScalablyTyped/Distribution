package typings
package readDashPkgLib.readDashPkgMod.ReadPkgNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * [Normalize](https://github.com/npm/normalize-package-data#what-normalization-currently-entails) the package data.
    *
    * @default true
    */
  var normalize: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(normalize: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize)
    __obj.asInstanceOf[Options]
  }
}

