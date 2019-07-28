package typings.rollup

import typings.rollup.rollupMod.DecodedSourceMapOrMissing
import typings.rollup.rollupNumbers.`true`
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
    val __obj = js.Dynamic.literal(missing = missing, plugin = plugin)
  
    __obj.asInstanceOf[Anon_Missing]
  }
}

