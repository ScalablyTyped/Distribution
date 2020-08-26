package typings.relayCompiler.iRMod

import typings.relayCompiler.relayCompilerStrings.Derived
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DerivedLocation extends Location {
  var kind: Derived = js.native
  var source: Location = js.native
}

object DerivedLocation {
  @scala.inline
  def apply(kind: Derived, source: Location): DerivedLocation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DerivedLocation]
  }
  @scala.inline
  implicit class DerivedLocationOps[Self <: DerivedLocation] (val x: Self) extends AnyVal {
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
    def setKind(value: Derived): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: Location): Self = this.set("source", value.asInstanceOf[js.Any])
  }
  
}

