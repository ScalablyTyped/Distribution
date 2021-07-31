package typings.rrule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fakeLuxonMod {
  
  object DateTime {
    
    @JSImport("rrule/dist/esm/src/fake-luxon", "DateTime")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def fromJSDate(): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSDate")().asInstanceOf[scala.Nothing]
  }
}
