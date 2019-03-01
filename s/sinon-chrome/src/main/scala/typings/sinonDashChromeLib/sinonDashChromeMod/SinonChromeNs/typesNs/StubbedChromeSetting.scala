package typings
package sinonDashChromeLib.sinonDashChromeMod.SinonChromeNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StubbedChromeSetting extends js.Object {
  var clear: sinonDashChromeLib.sinonDashChromeMod.SinonChromeStub
  var get: sinonDashChromeLib.sinonDashChromeMod.SinonChromeStub
  var onChange: sinonDashChromeLib.sinonDashChromeMod.SinonChromeNs.eventsNs.Event
  var set: sinonDashChromeLib.sinonDashChromeMod.SinonChromeStub
}

object StubbedChromeSetting {
  @scala.inline
  def apply(
    clear: sinonDashChromeLib.sinonDashChromeMod.SinonChromeStub,
    get: sinonDashChromeLib.sinonDashChromeMod.SinonChromeStub,
    onChange: sinonDashChromeLib.sinonDashChromeMod.SinonChromeNs.eventsNs.Event,
    set: sinonDashChromeLib.sinonDashChromeMod.SinonChromeStub
  ): StubbedChromeSetting = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("onChange")(onChange)
    __obj.updateDynamic("set")(set)
    __obj.asInstanceOf[StubbedChromeSetting]
  }
}

