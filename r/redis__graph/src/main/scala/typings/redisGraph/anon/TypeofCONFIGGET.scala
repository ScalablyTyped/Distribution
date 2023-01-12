package typings.redisGraph.anon

import typings.redisGraph.distCommandsConfigGETMod.ConfigItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCONFIGGET extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean
  
  def transformArguments(configKey: String): js.Array[String]
  
  def transformReply(): ConfigItem | js.Array[ConfigItem]
}
object TypeofCONFIGGET {
  
  inline def apply(
    IS_READ_ONLY: /* true */ Boolean,
    transformArguments: String => js.Array[String],
    transformReply: () => ConfigItem | js.Array[ConfigItem]
  ): TypeofCONFIGGET = {
    val __obj = js.Dynamic.literal(IS_READ_ONLY = IS_READ_ONLY.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction1(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofCONFIGGET]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCONFIGGET] (val x: Self) extends AnyVal {
    
    inline def setIS_READ_ONLY(value: /* true */ Boolean): Self = StObject.set(x, "IS_READ_ONLY", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: String => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: () => ConfigItem | js.Array[ConfigItem]): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
