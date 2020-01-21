package typings.remarkable

import typings.remarkable.libMod.BlockParsingRule
import typings.remarkable.rulerMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRulerBlockParsingRule extends js.Object {
  var ruler: ^[BlockParsingRule]
}

object AnonRulerBlockParsingRule {
  @scala.inline
  def apply(ruler: ^[BlockParsingRule]): AnonRulerBlockParsingRule = {
    val __obj = js.Dynamic.literal(ruler = ruler.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRulerBlockParsingRule]
  }
}

