package typings.snykPaketParser.dependenciesParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dependency extends js.Object {
  var source: String
}

object Dependency {
  @scala.inline
  def apply(source: String): Dependency = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dependency]
  }
}

