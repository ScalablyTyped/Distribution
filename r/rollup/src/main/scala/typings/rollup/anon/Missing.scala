package typings.rollup.anon

import typings.rollup.mod.DecodedSourceMapOrMissing
import typings.rollup.rollupBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Missing extends DecodedSourceMapOrMissing {
  var missing: `true`
  var plugin: String
}

object Missing {
  @scala.inline
  def apply(missing: `true`, plugin: String): Missing = {
    val __obj = js.Dynamic.literal(missing = missing.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Missing]
  }
}

