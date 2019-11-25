package typings.squirrelly.squirrellyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  @JSName("$cache")
  var $cache: js.UndefOr[Boolean] = js.undefined
  @JSName("$file")
  var $file: js.UndefOr[String] = js.undefined
  @JSName("$name")
  var $name: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply($cache: js.UndefOr[Boolean] = js.undefined, $file: String = null, $name: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($cache)) __obj.updateDynamic("$cache")($cache.asInstanceOf[js.Any])
    if ($file != null) __obj.updateDynamic("$file")($file.asInstanceOf[js.Any])
    if ($name != null) __obj.updateDynamic("$name")($name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

