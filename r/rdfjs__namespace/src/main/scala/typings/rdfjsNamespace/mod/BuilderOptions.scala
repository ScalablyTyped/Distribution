package typings.rdfjsNamespace.mod

import typings.rdfJs.mod.DataFactory
import typings.rdfJs.mod.Quad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuilderOptions extends js.Object {
  var factory: js.UndefOr[DataFactory[Quad, Quad]] = js.native
}

object BuilderOptions {
  @scala.inline
  def apply(): BuilderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuilderOptions]
  }
  @scala.inline
  implicit class BuilderOptionsOps[Self <: BuilderOptions] (val x: Self) extends AnyVal {
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
    def setFactory(value: DataFactory[Quad, Quad]): Self = this.set("factory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFactory: Self = this.set("factory", js.undefined)
  }
  
}

