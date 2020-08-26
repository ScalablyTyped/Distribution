package typings.reactCompass.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactCompassProps extends js.Object {
  var direction: Double = js.native
  var directionNames: js.UndefOr[js.Array[String]] = js.native
}

object ReactCompassProps {
  @scala.inline
  def apply(direction: Double): ReactCompassProps = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactCompassProps]
  }
  @scala.inline
  implicit class ReactCompassPropsOps[Self <: ReactCompassProps] (val x: Self) extends AnyVal {
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
    def setDirection(value: Double): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectionNamesVarargs(value: String*): Self = this.set("directionNames", js.Array(value :_*))
    @scala.inline
    def setDirectionNames(value: js.Array[String]): Self = this.set("directionNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectionNames: Self = this.set("directionNames", js.undefined)
  }
  
}

