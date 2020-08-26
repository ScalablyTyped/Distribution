package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyframeEffectOptions extends EffectTiming {
  var composite: js.UndefOr[CompositeOperation] = js.native
  var iterationComposite: js.UndefOr[IterationCompositeOperation] = js.native
}

object KeyframeEffectOptions {
  @scala.inline
  def apply(): KeyframeEffectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyframeEffectOptions]
  }
  @scala.inline
  implicit class KeyframeEffectOptionsOps[Self <: KeyframeEffectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComposite(value: CompositeOperation): Self = this.set("composite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComposite: Self = this.set("composite", js.undefined)
    @scala.inline
    def setIterationComposite(value: IterationCompositeOperation): Self = this.set("iterationComposite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIterationComposite: Self = this.set("iterationComposite", js.undefined)
  }
  
}

