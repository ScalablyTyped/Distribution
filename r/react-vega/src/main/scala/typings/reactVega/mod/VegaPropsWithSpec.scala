package typings.reactVega.mod

import typings.vegaTypings.specMod.Spec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VegaPropsWithSpec extends VegaPropsWithoutSpec {
  var spec: Spec = js.native
}

object VegaPropsWithSpec {
  @scala.inline
  def apply(spec: Spec): VegaPropsWithSpec = {
    val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[VegaPropsWithSpec]
  }
  @scala.inline
  implicit class VegaPropsWithSpecOps[Self <: VegaPropsWithSpec] (val x: Self) extends AnyVal {
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
    def setSpec(value: Spec): Self = this.set("spec", value.asInstanceOf[js.Any])
  }
  
}

