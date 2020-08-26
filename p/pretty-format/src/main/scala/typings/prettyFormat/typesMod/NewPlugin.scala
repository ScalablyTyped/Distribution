package typings.prettyFormat.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewPlugin extends Plugin {
  var test: Test = js.native
  def serialize(`val`: js.Any, config: Config, indentation: String, depth: Double, refs: Refs, printer: Printer): String = js.native
}

object NewPlugin {
  @scala.inline
  def apply(
    serialize: (js.Any, Config, String, Double, Refs, Printer) => String,
    test: /* arg0 */ js.Any => Boolean
  ): NewPlugin = {
    val __obj = js.Dynamic.literal(serialize = js.Any.fromFunction6(serialize), test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[NewPlugin]
  }
  @scala.inline
  implicit class NewPluginOps[Self <: NewPlugin] (val x: Self) extends AnyVal {
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
    def setSerialize(value: (js.Any, Config, String, Double, Refs, Printer) => String): Self = this.set("serialize", js.Any.fromFunction6(value))
    @scala.inline
    def setTest(value: /* arg0 */ js.Any => Boolean): Self = this.set("test", js.Any.fromFunction1(value))
  }
  
}

