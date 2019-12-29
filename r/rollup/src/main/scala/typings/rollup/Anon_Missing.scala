package typings.rollup

import typings.rollup.rollupBooleans.`true`
import typings.rollup.rollupMod.DecodedSourceMapOrMissing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Missing extends DecodedSourceMapOrMissing {
  var missing: `true`
  var plugin: String
}

object Anon_Missing {
  @scala.inline
  def apply(missing: `true`, plugin: String): Anon_Missing = {
    val __obj = js.Dynamic.literal(missing = missing.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Missing]
  }
}

