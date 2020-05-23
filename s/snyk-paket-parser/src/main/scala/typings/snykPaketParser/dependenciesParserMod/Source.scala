package typings.snykPaketParser.dependenciesParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  var options: Options
  var url: String
}

object Source {
  @scala.inline
  def apply(options: Options, url: String): Source = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

