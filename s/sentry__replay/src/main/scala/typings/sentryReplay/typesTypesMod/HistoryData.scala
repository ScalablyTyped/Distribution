package typings.sentryReplay.typesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryData
  extends StObject
     with _AllEntryData {
  
  var previous: String
}
object HistoryData {
  
  inline def apply(previous: String): HistoryData = {
    val __obj = js.Dynamic.literal(previous = previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HistoryData] (val x: Self) extends AnyVal {
    
    inline def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
  }
}
