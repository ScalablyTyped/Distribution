package typings.requireDashDirectory.requireDashDirectoryMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequireDirectoryOptions[T, U] extends js.Object {
  /**
    * @description RegExp or function for blacklisting modules
    * @default undefined
    */
  var exclude: js.UndefOr[RegExp | CheckPathFn] = js.undefined
  /**
    * @description array of file extensions that will be included in resulting hash as modules
    * @default "['js', 'json', 'coffee']"
    */
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * @description RegExp or function for whitelisting modules
    * @default undefined
    */
  var include: js.UndefOr[RegExp | CheckPathFn] = js.undefined
  /**
    * @description option to include subdirectories
    * @default true
    */
  var recurse: js.UndefOr[Boolean] = js.undefined
  /**
    * @description function for renaming modules in resulting hash
    * @param name name of required module
    * @returns transformed name of module
    * @default "change nothing"
    */
  var rename: js.UndefOr[js.Function1[/* name */ String, String]] = js.undefined
  /**
    * @description function that will be called for each required module
    * @param obj required module
    * @returns transformed module OR nothing (in second case module itself will be added to hash)
    * @default "change nothing"
    */
  var visit: js.UndefOr[js.Function1[/* obj */ T, U | Unit]] = js.undefined
}

object RequireDirectoryOptions {
  @scala.inline
  def apply[T, U](
    exclude: RegExp | CheckPathFn = null,
    extensions: js.Array[String] = null,
    include: RegExp | CheckPathFn = null,
    recurse: js.UndefOr[Boolean] = js.undefined,
    rename: /* name */ String => String = null,
    visit: /* obj */ T => U | Unit = null
  ): RequireDirectoryOptions[T, U] = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(recurse)) __obj.updateDynamic("recurse")(recurse.asInstanceOf[js.Any])
    if (rename != null) __obj.updateDynamic("rename")(js.Any.fromFunction1(rename))
    if (visit != null) __obj.updateDynamic("visit")(js.Any.fromFunction1(visit))
    __obj.asInstanceOf[RequireDirectoryOptions[T, U]]
  }
}

