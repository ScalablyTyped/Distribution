package typings
package squirrellyLib.squirrellyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  @JSName("$cache")
  var $cache: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("$file")
  var $file: js.UndefOr[java.lang.String] = js.undefined
  @JSName("$name")
  var $name: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    $cache: js.UndefOr[scala.Boolean] = js.undefined,
    $file: java.lang.String = null,
    $name: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($cache)) __obj.updateDynamic("$cache")($cache)
    if ($file != null) __obj.updateDynamic("$file")($file)
    if ($name != null) __obj.updateDynamic("$name")($name)
    __obj.asInstanceOf[Options]
  }
}

