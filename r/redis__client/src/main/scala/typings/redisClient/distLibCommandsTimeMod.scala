package typings.redisClient

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsTimeMod {
  
  @JSImport("@redis/client/dist/lib/commands/TIME", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")().asInstanceOf[js.Array[String]]
  
  inline def transformReply(reply: js.Tuple2[String, String]): TimeReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[TimeReply]
  
  @js.native
  trait TimeReply
    extends StObject
       with Date {
    
    var microseconds: Double = js.native
  }
}
