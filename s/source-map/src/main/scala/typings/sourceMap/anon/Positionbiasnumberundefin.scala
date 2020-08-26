package typings.sourceMap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined source-map.source-map.Position & {  bias :number | undefined} */
@js.native
trait Positionbiasnumberundefin extends js.Object {
  var bias: js.UndefOr[Double] = js.native
  var column: Double = js.native
  var line: Double = js.native
}

object Positionbiasnumberundefin {
  @scala.inline
  def apply(column: Double, line: Double): Positionbiasnumberundefin = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Positionbiasnumberundefin]
  }
  @scala.inline
  implicit class PositionbiasnumberundefinOps[Self <: Positionbiasnumberundefin] (val x: Self) extends AnyVal {
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
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def setBias(value: Double): Self = this.set("bias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBias: Self = this.set("bias", js.undefined)
  }
  
}

