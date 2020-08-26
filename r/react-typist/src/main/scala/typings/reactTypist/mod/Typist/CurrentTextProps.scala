package typings.reactTypist.mod.Typist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentTextProps extends js.Object {
  var charIdx: Double = js.native
  var character: String = js.native
  var line: String = js.native
  var lineIdx: Double = js.native
  def defDelayGenerator(mn: Double, st: Double): js.Function1[/* params */ js.Any, Double] = js.native
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
  @scala.inline
  implicit class CurrentTextPropsOps[Self <: CurrentTextProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCharIdx(value: Double): Self = this.set("charIdx", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharacter(value: String): Self = this.set("character", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefDelayGenerator(value: (Double, Double) => js.Function1[/* params */ js.Any, Double]): Self = this.set("defDelayGenerator", js.Any.fromFunction2(value))
    @scala.inline
    def setLine(value: String): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineIdx(value: Double): Self = this.set("lineIdx", value.asInstanceOf[js.Any])
  }
  
}

