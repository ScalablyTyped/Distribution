package typings.rrule

import typings.rrule.distEsmSrcIterresultMod.IterArgs
import typings.rrule.rruleStrings.all
import typings.rrule.rruleStrings.between
import typings.std.Date
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/callbackiterresult", JSImport.Namespace)
@js.native
object distEsmSrcCallbackiterresultMod extends js.Object {
  @js.native
  trait CallbackIterResult
    extends typings.rrule.distEsmSrcIterresultMod.default[all | between] {
    var iterator: js.Any = js.native
  }
  
  @js.native
  class default protected () extends CallbackIterResult {
    def this(method: all, args: Partial[IterArgs], iterator: Iterator) = this()
    def this(method: between, args: Partial[IterArgs], iterator: Iterator) = this()
  }
  
  type Iterator = js.Function2[/* d */ Date, /* len */ Double, Boolean]
}

