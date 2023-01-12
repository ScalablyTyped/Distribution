package typings.redisClient.anon

import typings.redisClient.distLibCommandsClusterINFOMod.ClusterInfoReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCLUSTERINFO extends StObject {
  
  def extractLineValue(line: String): String
  
  def transformArguments(): js.Array[String]
  
  def transformReply(reply: String): ClusterInfoReply
}
object TypeofCLUSTERINFO {
  
  inline def apply(
    extractLineValue: String => String,
    transformArguments: () => js.Array[String],
    transformReply: String => ClusterInfoReply
  ): TypeofCLUSTERINFO = {
    val __obj = js.Dynamic.literal(extractLineValue = js.Any.fromFunction1(extractLineValue), transformArguments = js.Any.fromFunction0(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofCLUSTERINFO]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCLUSTERINFO] (val x: Self) extends AnyVal {
    
    inline def setExtractLineValue(value: String => String): Self = StObject.set(x, "extractLineValue", js.Any.fromFunction1(value))
    
    inline def setTransformArguments(value: () => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction0(value))
    
    inline def setTransformReply(value: String => ClusterInfoReply): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
