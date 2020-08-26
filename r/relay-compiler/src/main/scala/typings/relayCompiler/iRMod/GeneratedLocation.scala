package typings.relayCompiler.iRMod

import typings.relayCompiler.relayCompilerStrings.Generated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeneratedLocation extends Location {
  var kind: Generated = js.native
}

object GeneratedLocation {
  @scala.inline
  def apply(kind: Generated): GeneratedLocation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratedLocation]
  }
  @scala.inline
  implicit class GeneratedLocationOps[Self <: GeneratedLocation] (val x: Self) extends AnyVal {
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
    def setKind(value: Generated): Self = this.set("kind", value.asInstanceOf[js.Any])
  }
  
}

