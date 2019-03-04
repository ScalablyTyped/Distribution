package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverageEntry extends js.Object {
  var ranges: js.Array[puppeteerLib.Anon_End]
  var text: java.lang.String
  var url: java.lang.String
}

object CoverageEntry {
  @scala.inline
  def apply(ranges: js.Array[puppeteerLib.Anon_End], text: java.lang.String, url: java.lang.String): CoverageEntry = {
    val __obj = js.Dynamic.literal(ranges = ranges, text = text, url = url)
  
    __obj.asInstanceOf[CoverageEntry]
  }
}

