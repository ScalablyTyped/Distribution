package typings.redisSearch.distCommandsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type SearchDocumentValue = {[key: string] : string | number | null | std.Array<@redis/search.@redis/search/dist/commands.SearchDocumentValue> | @redis/search.@redis/search/dist/commands.SearchDocumentValue}
}}}
to avoid circular code involving: 
- @redis/search.@redis/search/dist/commands.SearchDocumentValue
*/
trait SearchDocumentValue
  extends StObject
     with /* key */ StringDictionary[String | Double | Null | js.Array[SearchDocumentValue] | SearchDocumentValue]
object SearchDocumentValue {
  
  inline def apply(): SearchDocumentValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchDocumentValue]
  }
}
