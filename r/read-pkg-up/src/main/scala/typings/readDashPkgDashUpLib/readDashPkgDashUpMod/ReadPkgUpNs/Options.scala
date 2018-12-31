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

