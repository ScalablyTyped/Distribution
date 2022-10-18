package typings.redisSearch.distCommandsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SchemaFieldTypes extends StObject
@JSImport("@redis/search/dist/commands", "SchemaFieldTypes")
@js.native
object SchemaFieldTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SchemaFieldTypes & String] = js.native
  
  @js.native
  sealed trait GEO
    extends StObject
       with SchemaFieldTypes
  /* "GEO" */ val GEO: typings.redisSearch.distCommandsMod.SchemaFieldTypes.GEO & String = js.native
  
  @js.native
  sealed trait NUMERIC
    extends StObject
       with SchemaFieldTypes
  /* "NUMERIC" */ val NUMERIC: typings.redisSearch.distCommandsMod.SchemaFieldTypes.NUMERIC & String = js.native
  
  @js.native
  sealed trait TAG
    extends StObject
       with SchemaFieldTypes
  /* "TAG" */ val TAG: typings.redisSearch.distCommandsMod.SchemaFieldTypes.TAG & String = js.native
  
  @js.native
  sealed trait TEXT
    extends StObject
       with SchemaFieldTypes
  /* "TEXT" */ val TEXT: typings.redisSearch.distCommandsMod.SchemaFieldTypes.TEXT & String = js.native
  
  @js.native
  sealed trait VECTOR
    extends StObject
       with SchemaFieldTypes
  /* "VECTOR" */ val VECTOR: typings.redisSearch.distCommandsMod.SchemaFieldTypes.VECTOR & String = js.native
}
