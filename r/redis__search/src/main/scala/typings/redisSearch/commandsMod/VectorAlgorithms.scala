package typings.redisSearch.commandsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VectorAlgorithms extends StObject
@JSImport("@redis/search/dist/commands", "VectorAlgorithms")
@js.native
object VectorAlgorithms extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[VectorAlgorithms & String] = js.native
  
  @js.native
  sealed trait FLAT
    extends StObject
       with VectorAlgorithms
  /* "FLAT" */ val FLAT: typings.redisSearch.commandsMod.VectorAlgorithms.FLAT & String = js.native
  
  @js.native
  sealed trait HNSW
    extends StObject
       with VectorAlgorithms
  /* "HNSW" */ val HNSW: typings.redisSearch.commandsMod.VectorAlgorithms.HNSW & String = js.native
}
