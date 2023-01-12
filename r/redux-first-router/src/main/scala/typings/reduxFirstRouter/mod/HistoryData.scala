package typings.reduxFirstRouter.mod

import typings.reduxFirstRouter.anon.Pathname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryData extends StObject {
  
  var entries: HistoryEntries
  
  var index: Double
  
  var length: Double
}
object HistoryData {
  
  inline def apply(entries: HistoryEntries, index: Double, length: Double): HistoryData = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HistoryData] (val x: Self) extends AnyVal {
    
    inline def setEntries(value: HistoryEntries): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: Pathname*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
