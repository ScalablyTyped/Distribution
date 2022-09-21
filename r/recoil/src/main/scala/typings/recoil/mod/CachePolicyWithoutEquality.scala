package typings.recoil.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.recoil.anon.Eviction
  - typings.recoil.anon.`0`
  - typings.recoil.anon.`1`
*/
trait CachePolicyWithoutEquality extends StObject
object CachePolicyWithoutEquality {
  
  inline def `0`(): typings.recoil.anon.`0` = {
    val __obj = js.Dynamic.literal(eviction = "keep-all")
    __obj.asInstanceOf[typings.recoil.anon.`0`]
  }
  
  inline def `1`(): typings.recoil.anon.`1` = {
    val __obj = js.Dynamic.literal(eviction = "most-recent")
    __obj.asInstanceOf[typings.recoil.anon.`1`]
  }
  
  inline def Eviction(maxSize: Double): typings.recoil.anon.Eviction = {
    val __obj = js.Dynamic.literal(eviction = "lru", maxSize = maxSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.recoil.anon.Eviction]
  }
}
