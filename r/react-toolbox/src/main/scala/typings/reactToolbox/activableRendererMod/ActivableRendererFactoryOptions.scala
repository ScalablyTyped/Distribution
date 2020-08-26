package typings.reactToolbox.activableRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivableRendererFactoryOptions extends js.Object {
  var delay: js.UndefOr[Double] = js.native
}

object ActivableRendererFactoryOptions {
  @scala.inline
  def apply(): ActivableRendererFactoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivableRendererFactoryOptions]
  }
  @scala.inline
  implicit class ActivableRendererFactoryOptionsOps[Self <: ActivableRendererFactoryOptions] (val x: Self) extends AnyVal {
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
  }
  
}

