package typings.recurlyRecurlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataCollector extends StObject {
  
  var dataCollector: js.UndefOr[Boolean] = js.native
}
object DataCollector {
  
  @scala.inline
  def apply(): DataCollector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataCollector]
  }
  
  @scala.inline
  implicit class DataCollectorMutableBuilder[Self <: DataCollector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataCollector(value: Boolean): Self = StObject.set(x, "dataCollector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataCollectorUndefined: Self = StObject.set(x, "dataCollector", js.undefined)
  }
}
