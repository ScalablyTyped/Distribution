package typings.redisClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCLIENTID extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean
  
  def transformArguments(): js.Array[String]
  
  def transformReply(): Double
}
object TypeofCLIENTID {
  
  inline def apply(
    IS_READ_ONLY: /* true */ Boolean,
    transformArguments: () => js.Array[String],
    transformReply: () => Double
  ): TypeofCLIENTID = {
    val __obj = js.Dynamic.literal(IS_READ_ONLY = IS_READ_ONLY.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction0(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofCLIENTID]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCLIENTID] (val x: Self) extends AnyVal {
    
    inline def setIS_READ_ONLY(value: /* true */ Boolean): Self = StObject.set(x, "IS_READ_ONLY", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: () => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction0(value))
    
    inline def setTransformReply(value: () => Double): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
