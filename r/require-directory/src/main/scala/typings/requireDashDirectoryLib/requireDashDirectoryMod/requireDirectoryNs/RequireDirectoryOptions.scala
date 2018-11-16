package typings
package requireDashDirectoryLib.requireDashDirectoryMod.requireDirectoryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RequireDirectoryOptions[T, U] extends js.Object {
  /**
           * @description RegExp or function for blacklisting modules
           * @default undefined
           */
  var exclude: js.UndefOr[stdLib.RegExp | CheckPathFn] = js.undefined
  /**
           * @description array of file extensions that will be included in resulting hash as modules
           * @default "['js', 'json', 'coffee']"
           */
  var extensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * @description RegExp or function for whitelisting modules
           * @default undefined
           */
  var include: js.UndefOr[stdLib.RegExp | CheckPathFn] = js.undefined
  /**
           * @description option to include subdirectories
           * @default true
           */
  var recurse: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * @description function for renaming modules in resulting hash
           * @param name name of required module
           * @returns transformed name of module
           * @default "change nothing"
           */
  var rename: js.UndefOr[js.Function1[/* name */ java.lang.String, java.lang.String]] = js.undefined
  /**
           * @description function that will be called for each required module
           * @param obj required module
           * @returns transformed module OR nothing (in second case module itself will be added to hash)
           * @default "change nothing"
           */
  var visit: js.UndefOr[js.Function1[/* obj */ T, U | scala.Unit]] = js.undefined
}

