package typings.remarkable.anon

import typings.remarkable.libMod.InlineParsingRule
import typings.remarkable.rulerMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ruler extends js.Object {
  var ruler: ^[InlineParsingRule]
}

object Ruler {
  @scala.inline
  def apply(ruler: ^[InlineParsingRule]): Ruler = {
    val __obj = js.Dynamic.literal(ruler = ruler.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ruler]
  }
}

