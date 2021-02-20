package typings.rrule

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datewithzoneMod {
  
  @JSImport("rrule/dist/esm/src/datewithzone", "DateWithZone")
  @js.native
  class DateWithZone protected () extends StObject {
    def this(date: Date) = this()
    def this(date: Date, tzid: String) = this()
    
    var date: Date = js.native
    
    def getTime(): Double = js.native
    
    /* private */ def isUTC: js.Any = js.native
    
    def rezonedDate(): Date = js.native
    
    var tzid: js.UndefOr[String | Null] = js.native
  }
}
