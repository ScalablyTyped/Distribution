package typings
package readDashPkgDashUpLib.readDashPkgDashUpMod.ReadPkgUpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Directory to start looking for a package.json file.
    *
    * @default 'process.cwd()'
    */
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Normalize](https://github.com/npm/normalize-package-data#what-normalization-currently-entails) the package data.
    *
    * @default true
    */
  var normalize: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(cwd: java.lang.String = null, normalize: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize)
    __obj.asInstanceOf[Options]
  }
}

