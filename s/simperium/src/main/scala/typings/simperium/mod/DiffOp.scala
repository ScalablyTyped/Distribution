package typings.simperium.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.simperium.simperiumStrings.I
import typings.simperium.simperiumStrings.L
import typings.simperium.simperiumStrings.O
import typings.simperium.simperiumStrings.Plussign
import typings.simperium.simperiumStrings.`-_`
import typings.simperium.simperiumStrings.d
import typings.simperium.simperiumStrings.r
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.simperium.anon.O[T]
  - typings.simperium.anon.`0`
  - typings.simperium.anon.V[T]
  - typings.simperium.anon.OV
  - typings.simperium.anon.`1`[T]
  - typings.simperium.anon.VJSONDiff[T]
  - typings.simperium.anon.VDMPDiff
*/
trait DiffOp[T] extends js.Object

object DiffOp {
  @scala.inline
  def O[T](o: Plussign, v: T): DiffOp[T] = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffOp[T]]
  }
  @scala.inline
  def OV[T](o: I, v: Double): DiffOp[T] = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffOp[T]]
  }
  @scala.inline
  def VJSONDiff[T](o: O, v: JSONDiff[T]): DiffOp[T] = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffOp[T]]
  }
  @scala.inline
  def VDMPDiff[T](o: d, v: DMPDiff): DiffOp[T] = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffOp[T]]
  }
  @scala.inline
  def V[T](o: r, v: T): DiffOp[T] = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffOp[T]]
  }
  @scala.inline
  def `1`[T](o: L, v: NumberDictionary[js.Any]): DiffOp[T] = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffOp[T]]
  }
  @scala.inline
  def `0`[T](o: `-_`): DiffOp[T] = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffOp[T]]
  }
}

