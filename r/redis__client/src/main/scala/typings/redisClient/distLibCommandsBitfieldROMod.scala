package typings.redisClient

import typings.redisClient.anon.OmitBitFieldGetOperationo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsBitfieldROMod {
  
  @JSImport("@redis/client/dist/lib/commands/BITFIELD_RO", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/BITFIELD_RO", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/client/dist/lib/commands/BITFIELD_RO", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: String, operations: BitFieldRoOperations): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], operations.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): js.Array[Double | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[js.Array[Double | Null]]
  
  type BitFieldRoOperations = js.Array[OmitBitFieldGetOperationo]
}
