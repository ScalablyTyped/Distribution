package typings.reactNativeIndicators.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BallIndicatorProps extends BaseIndicatorProps {
  /**
    * Component color
    * @default 'rgb(0, 0, 0)'
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Component count
    * @default 8
    */
  var count: js.UndefOr[Double] = js.native
  /**
    * Base component size
    * @default 40
    */
  var size: js.UndefOr[Double] = js.native
}

object BallIndicatorProps {
  @scala.inline
  def apply(): BallIndicatorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BallIndicatorProps]
  }
  @scala.inline
  implicit class BallIndicatorPropsOps[Self <: BallIndicatorProps] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

