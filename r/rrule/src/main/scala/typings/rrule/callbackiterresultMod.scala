package typings.rrule

import typings.rrule.anon.PartialIterArgs
import typings.rrule.rruleStrings.all
import typings.rrule.rruleStrings.between
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callbackiterresultMod {
  
  @JSImport("rrule/dist/esm/src/callbackiterresult", JSImport.Default)
  @js.native
  class default protected () extends CallbackIterResult {
    def this(method: all, args: PartialIterArgs, iterator: Iterator) = this()
    def this(method: between, args: PartialIterArgs, iterator: Iterator) = this()
  }
  
  @js.native
  trait CallbackIterResult
    extends typings.rrule.iterresultMod.default[all | between] {
    
    var iterator: js.Any = js.native
  }
  
  type Iterator = js.Function2[/* d */ Date, /* len */ Double, Boolean]
}
