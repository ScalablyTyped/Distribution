package typings.rethinkdb.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type BooleanMap = {[key: string] : std.Boolean | rethinkdb.rethinkdb.BooleanMap}
}}}
to avoid circular code involving: 
- rethinkdb.rethinkdb.BooleanMap
*/
trait BooleanMap
  extends StObject
     with /* key */ StringDictionary[Boolean | BooleanMap]
object BooleanMap {
  
  inline def apply(): BooleanMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BooleanMap]
  }
}
