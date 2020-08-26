package typings.serverless.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionDefinition extends js.Object {
  @JSName("package")
  var _package: Package = js.native
  var environment: js.UndefOr[StringDictionary[String]] = js.native
  var events: js.Array[Event] = js.native
  var handler: String = js.native
  var memorySize: js.UndefOr[Double] = js.native
  var name: String = js.native
  var runtime: js.UndefOr[String] = js.native
  var tags: js.UndefOr[StringDictionary[String]] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object FunctionDefinition {
  @scala.inline
  def apply(_package: Package, events: js.Array[Event], handler: String, name: String): FunctionDefinition = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionDefinition]
  }
  @scala.inline
  implicit class FunctionDefinitionOps[Self <: FunctionDefinition] (val x: Self) extends AnyVal {
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
    def set_package(value: Package): Self = this.set("package", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventsVarargs(value: Event*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: js.Array[Event]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandler(value: String): Self = this.set("handler", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironment(value: StringDictionary[String]): Self = this.set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    @scala.inline
    def setMemorySize(value: Double): Self = this.set("memorySize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemorySize: Self = this.set("memorySize", js.undefined)
    @scala.inline
    def setRuntime(value: String): Self = this.set("runtime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuntime: Self = this.set("runtime", js.undefined)
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

