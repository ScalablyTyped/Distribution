package typings.rcMenu

import typings.rcMenu.anon.Amazon
import typings.rcMenu.anon.Blackberry
import typings.rcMenu.anon.Device
import typings.rcMenu.anon.Phone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-menu/lib/utils/isMobile", JSImport.Namespace)
@js.native
object isMobileMod extends js.Object {
  @js.native
  object default extends js.Object {
    var amazon: Phone = js.native
    var android: Phone = js.native
    var any: js.Any = js.native
    var apple: Device = js.native
    var isMobile: js.Function1[/* userAgent */ js.UndefOr[String], Amazon] = js.native
    var other: Blackberry = js.native
    var phone: js.Any = js.native
    var tablet: js.Any = js.native
    var windows: Phone = js.native
  }
  
}

