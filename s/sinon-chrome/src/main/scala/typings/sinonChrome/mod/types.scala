package typings.sinonChrome.mod

import typings.sinonChrome.mod.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sinon-chrome", "types")
@js.native
object types extends js.Object {
  @js.native
  trait StubbedChromeSetting extends js.Object {
    @JSName("clear")
    var clear_Original: SinonChromeStub = js.native
    @JSName("get")
    var get_Original: SinonChromeStub = js.native
    var onChange: Event = js.native
    @JSName("set")
    var set_Original: SinonChromeStub = js.native
    // Methods
    def clear(args: js.Any*): js.Any = js.native
    // Methods
    def get(args: js.Any*): js.Any = js.native
    // Methods
    def set(args: js.Any*): js.Any = js.native
  }
  
}

