package typings.reactTypist.mod.Typist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentTextProps extends js.Object {
  var charIdx: Double
  var character: String
  var line: String
  var lineIdx: Double
  def defDelayGenerator(mn: Double, st: Double): js.Function1[/* params */ js.Any, Double]
}

object CurrentTextProps {
  @scala.inline
  def apply(
    charIdx: Double,
    character: String,
    defDelayGenerator: (Double, Double) => js.Function1[/* params */ js.Any, Double],
    line: String,
    lineIdx: Double
  ): CurrentTextProps = {
    val __obj = js.Dynamic.literal(charIdx = charIdx.asInstanceOf[js.Any], character = character.asInstanceOf[js.Any], defDelayGenerator = js.Any.fromFunction2(defDelayGenerator), line = line.asInstanceOf[js.Any], lineIdx = lineIdx.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CurrentTextProps]
  }
}

