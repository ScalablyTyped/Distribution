package typings.sinonDashChrome.sinonDashChromeMod

import typings.sinonDashChrome.sinonDashChromeMod.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sinon-chrome", "storage")
@js.native
object storage extends js.Object {
  @js.native
  trait StubbedStorageArea extends js.Object {
    @JSName("clear")
    var clear_Original: SinonChromeStub = js.native
    @JSName("getBytesInUse")
    var getBytesInUse_Original: SinonChromeStub = js.native
    @JSName("get")
    var get_Original: SinonChromeStub = js.native
    @JSName("remove")
    var remove_Original: SinonChromeStub = js.native
    @JSName("set")
    var set_Original: SinonChromeStub = js.native
    // Methods
    def clear(args: js.Any*): js.Any = js.native
    // Methods
    def get(args: js.Any*): js.Any = js.native
    // Methods
    def getBytesInUse(args: js.Any*): js.Any = js.native
    // Methods
    def remove(args: js.Any*): js.Any = js.native
    // Methods
    def set(args: js.Any*): js.Any = js.native
  }
  
  var local: StubbedStorageArea = js.native
  var managed: StubbedStorageArea = js.native
  var onChanged: Event = js.native
  var sync: StubbedStorageArea = js.native
}

