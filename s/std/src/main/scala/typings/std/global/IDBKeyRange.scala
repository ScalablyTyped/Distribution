package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("IDBKeyRange")
@js.native
class IDBKeyRange ()
  extends typings.std.IDBKeyRange
object IDBKeyRange {
  
  /**
    * Returns a new IDBKeyRange spanning from lower to upper. If lowerOpen is true, lower is not included in the range. If upperOpen is true, upper is not included in the range.
    */
  @JSGlobal("IDBKeyRange.bound")
  @js.native
  def bound(lower: js.Any, upper: js.Any): typings.std.IDBKeyRange = js.native
  @JSGlobal("IDBKeyRange.bound")
  @js.native
  def bound(lower: js.Any, upper: js.Any, lowerOpen: js.UndefOr[scala.Nothing], upperOpen: scala.Boolean): typings.std.IDBKeyRange = js.native
  @JSGlobal("IDBKeyRange.bound")
  @js.native
  def bound(lower: js.Any, upper: js.Any, lowerOpen: scala.Boolean): typings.std.IDBKeyRange = js.native
  @JSGlobal("IDBKeyRange.bound")
  @js.native
  def bound(lower: js.Any, upper: js.Any, lowerOpen: scala.Boolean, upperOpen: scala.Boolean): typings.std.IDBKeyRange = js.native
  
  /**
    * Returns a new IDBKeyRange starting at key with no upper bound. If open is true, key is not included in the range.
    */
  @JSGlobal("IDBKeyRange.lowerBound")
  @js.native
  def lowerBound(lower: js.Any): typings.std.IDBKeyRange = js.native
  @JSGlobal("IDBKeyRange.lowerBound")
  @js.native
  def lowerBound(lower: js.Any, open: scala.Boolean): typings.std.IDBKeyRange = js.native
  
  /**
    * Returns a new IDBKeyRange spanning only key.
    */
  @JSGlobal("IDBKeyRange.only")
  @js.native
  def only(value: js.Any): typings.std.IDBKeyRange = js.native
  
  /**
    * Returns a new IDBKeyRange with no lower bound and ending at key. If open is true, key is not included in the range.
    */
  @JSGlobal("IDBKeyRange.upperBound")
  @js.native
  def upperBound(upper: js.Any): typings.std.IDBKeyRange = js.native
  @JSGlobal("IDBKeyRange.upperBound")
  @js.native
  def upperBound(upper: js.Any, open: scala.Boolean): typings.std.IDBKeyRange = js.native
}
