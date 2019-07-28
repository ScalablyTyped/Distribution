package typings.atPulumiPulumi.runtimeClosureCodePathsMod

import typings.atPulumiPulumi.resourceMod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodePathOptions extends js.Object {
  /**
    * Packages to explicitly exclude from the Assets for a serialized closure.  This can be used
    * when clients want to trim down the size of a closure, and they know that some package won't
    * ever actually be needed at runtime, but is still a dependency of some package that is being
    * used at runtime.
    */
  var extraExcludePackages: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Extra packages to include when producing the Assets for a serialized closure.  This can be
    * useful if the packages are acquired in a way that the serialization code does not understand.
    * For example, if there was some sort of module that was pulled in based off of a computed
    * string.
    */
  var extraIncludePackages: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Local file/directory paths that we always want to include when producing the Assets to be
    * included for a serialized closure.
    */
  var extraIncludePaths: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The resource to log any errors we encounter against.
    */
  var logResource: js.UndefOr[Resource] = js.undefined
}

object CodePathOptions {
  @scala.inline
  def apply(
    extraExcludePackages: js.Array[String] = null,
    extraIncludePackages: js.Array[String] = null,
    extraIncludePaths: js.Array[String] = null,
    logResource: Resource = null
  ): CodePathOptions = {
    val __obj = js.Dynamic.literal()
    if (extraExcludePackages != null) __obj.updateDynamic("extraExcludePackages")(extraExcludePackages)
    if (extraIncludePackages != null) __obj.updateDynamic("extraIncludePackages")(extraIncludePackages)
    if (extraIncludePaths != null) __obj.updateDynamic("extraIncludePaths")(extraIncludePaths)
    if (logResource != null) __obj.updateDynamic("logResource")(logResource)
    __obj.asInstanceOf[CodePathOptions]
  }
}

