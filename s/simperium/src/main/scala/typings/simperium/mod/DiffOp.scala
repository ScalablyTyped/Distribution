package typings.simperium.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.simperium.simperiumStrings.I
import typings.simperium.simperiumStrings.L
import typings.simperium.simperiumStrings.O
import typings.simperium.simperiumStrings.Plussign
import typings.simperium.simperiumStrings.`-_`
import typings.simperium.simperiumStrings.d
import typings.simperium.simperiumStrings.r
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.simperium.anon.O[T]
  - typings.simperium.anon.`0`
  - typings.simperium.anon.V[T]
  - typings.simperium.anon.OV
  - typings.simperium.anon.`1`[T]
  - typings.simperium.anon.VJSONDiff[T]
  - typings.simperium.anon.VDMPDiff
*/
trait DiffOp[T] extends StObject
object DiffOp {
  
  @scala.inline
  def `0`(o: `-_`): typings.simperium.anon.`0` = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.simperium.anon.`0`]
  }
  
  @scala.inline
  def `1`[T](o: L, v: NumberDictionary[js.Any]): typings.simperium.anon.`1`[T] = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.simperium.anon.`1`[T]]
  }
  
  @scala.inline
  def O[T](o: Plussign, v: T): typings.simperium.anon.O[T] = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.simperium.anon.O[T]]
  }
  
  @scala.inline
  def OV(o: I, v: Double): typings.simperium.anon.OV = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.simperium.anon.OV]
  }
  
  @scala.inline
  def V[T](o: r, v: T): typings.simperium.anon.V[T] = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.simperium.anon.V[T]]
  }
  
  @scala.inline
  def VDMPDiff(o: d, v: DMPDiff): typings.simperium.anon.VDMPDiff = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.simperium.anon.VDMPDiff]
  }
  
  @scala.inline
  def VJSONDiff[T](o: O, v: JSONDiff[T]): typings.simperium.anon.VJSONDiff[T] = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.simperium.anon.VJSONDiff[T]]
  }
}
