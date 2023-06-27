package typings.sentryReplay.typesTypesReplayFrameMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MutationFrameData extends StObject {
  
  var count: Double
  
  var limit: Boolean
}
object MutationFrameData {
  
  inline def apply(count: Double, limit: Boolean): MutationFrameData = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationFrameData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MutationFrameData] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: Boolean): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
  }
}
