package typings.reduxFirstRouter.mod

import typings.reduxFirstRouter.anon.Pathname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryData extends StObject {
  
  var entries: HistoryEntries = js.native
  
  var index: Double = js.native
  
  var length: Double = js.native
}
object HistoryData {
  
  @scala.inline
  def apply(entries: HistoryEntries, index: Double, length: Double): HistoryData = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryData]
  }
  
  @scala.inline
  implicit class HistoryDataMutableBuilder[Self <: HistoryData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: HistoryEntries): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesVarargs(value: Pathname*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
