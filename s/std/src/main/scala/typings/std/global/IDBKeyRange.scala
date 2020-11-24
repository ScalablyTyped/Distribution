package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("IDBKeyRange")
@js.native
class IDBKeyRange ()
  extends typings.std.IDBKeyRange
@JSGlobal("IDBKeyRange")
@js.native
object IDBKeyRange
  extends Instantiable0[typings.std.IDBKeyRange] {
  
  /**
    * Returns a new IDBKeyRange spanning from lower to upper. If lowerOpen is true, lower is not included in the range. If upperOpen is true, upper is not included in the range.
    */
  def bound(lower: js.Any, upper: js.Any): typings.std.IDBKeyRange = js.native
  def bound(lower: js.Any, upper: js.Any, lowerOpen: js.UndefOr[scala.Nothing], upperOpen: scala.Boolean): typings.std.IDBKeyRange = js.native
  def bound(lower: js.Any, upper: js.Any, lowerOpen: scala.Boolean): typings.std.IDBKeyRange = js.native
  def bound(lower: js.Any, upper: js.Any, lowerOpen: scala.Boolean, upperOpen: scala.Boolean): typings.std.IDBKeyRange = js.native
  
  /**
    * Returns a new IDBKeyRange starting at key with no upper bound. If open is true, key is not included in the range.
    */
  def lowerBound(lower: js.Any): typings.std.IDBKeyRange = js.native
  def lowerBound(lower: js.Any, open: scala.Boolean): typings.std.IDBKeyRange = js.native
  
  /**
    * Returns a new IDBKeyRange spanning only key.
    */
  def only(value: js.Any): typings.std.IDBKeyRange = js.native
  
  /**
    * Returns a new IDBKeyRange with no lower bound and ending at key. If open is true, key is not included in the range.
    */
  def upperBound(upper: js.Any): typings.std.IDBKeyRange = js.native
  def upperBound(upper: js.Any, open: scala.Boolean): typings.std.IDBKeyRange = js.native
}
