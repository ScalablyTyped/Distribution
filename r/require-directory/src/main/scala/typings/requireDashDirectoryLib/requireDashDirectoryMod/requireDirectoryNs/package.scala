package typings
package requireDashDirectoryLib.requireDashDirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requireDirectoryNs {
  /**
       * @description function that checks path for whitelisting/blacklisting
       * @param path path of required module
       * @returns true if path have to be whitelisted/blacklisted, false otherwise
       */
  type CheckPathFn = js.Function1[/* path */ java.lang.String, scala.Boolean]
}
