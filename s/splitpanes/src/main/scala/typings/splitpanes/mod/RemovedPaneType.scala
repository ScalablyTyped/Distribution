package typings.splitpanes.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemovedPaneType
  extends StObject
     with /* key */ NumberDictionary[Pane] {
  
  var index: Double
}
object RemovedPaneType {
  
  inline def apply(index: Double): RemovedPaneType = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovedPaneType]
  }
  
  extension [Self <: RemovedPaneType](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
