package typings.requireDashFromDashString.requireDashFromDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * List of `paths`, that will be appended to module `paths`.
    * Useful when you want to be able require modules from these paths.
    */
  var appendPaths: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * List of `paths`, that will be preppended to module `paths`.
    * Useful when you want to be able require modules from these paths.
    */
  var prependPaths: js.UndefOr[js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(appendPaths: js.Array[String] = null, prependPaths: js.Array[String] = null): Options = {
    val __obj = js.Dynamic.literal()
    if (appendPaths != null) __obj.updateDynamic("appendPaths")(appendPaths)
    if (prependPaths != null) __obj.updateDynamic("prependPaths")(prependPaths)
    __obj.asInstanceOf[Options]
  }
}

