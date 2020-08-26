package typings.relayCompiler.iRMod

import typings.relayCompiler.relayCompilerStrings.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceLocation extends Location {
  var end: Double = js.native
  var kind: Source = js.native
  var source: typings.graphql.mod.Source = js.native
  var start: Double = js.native
}

object SourceLocation {
  @scala.inline
  def apply(end: Double, kind: Source, source: typings.graphql.mod.Source, start: Double): SourceLocation = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceLocation]
  }
  @scala.inline
  implicit class SourceLocationOps[Self <: SourceLocation] (val x: Self) extends AnyVal {
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
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: Source): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: typings.graphql.mod.Source): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

