package typings.sourceMap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mapping extends js.Object {
  var generated: Position = js.native
  var name: js.UndefOr[String] = js.native
  var original: Position = js.native
  var source: String = js.native
}

object Mapping {
  @scala.inline
  def apply(generated: Position, original: Position, source: String): Mapping = {
    val __obj = js.Dynamic.literal(generated = generated.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mapping]
  }
  @scala.inline
  implicit class MappingOps[Self <: Mapping] (val x: Self) extends AnyVal {
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
    def setGenerated(value: Position): Self = this.set("generated", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginal(value: Position): Self = this.set("original", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

