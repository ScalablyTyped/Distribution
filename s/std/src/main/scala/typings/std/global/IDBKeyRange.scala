package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("IDBKeyRange")
@js.native
class IDBKeyRange ()
  extends StObject
     with typings.std.IDBKeyRange {
  
  /**
    * Returns true if key is included in the range, and false otherwise.
    */
  /* CompleteClass */
  override def includes(key: js.Any): scala.Boolean = js.native
  
  /**
    * Returns lower bound, or undefined if none.
    */
  /* CompleteClass */
  override val lower: js.Any = js.native
  
  /**
    * Returns true if the lower open flag is set, and false otherwise.
    */
  /* CompleteClass */
  override val lowerOpen: scala.Boolean = js.native
  
  /**
    * Returns upper bound, or undefined if none.
    */
  /* CompleteClass */
  override val upper: js.Any = js.native
  
  /**
    * Returns true if the upper open flag is set, and false otherwise.
    */
  /* CompleteClass */
  override val upperOpen: scala.Boolean = js.native
}
object IDBKeyRange {
  
  @JSGlobal("IDBKeyRange")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a new IDBKeyRange spanning from lower to upper. If lowerOpen is true, lower is not included in the range. If upperOpen is true, upper is not included in the range.
    */
  inline def bound(lower: js.Any, upper: js.Any): typings.std.IDBKeyRange = (^.asInstanceOf[js.Dynamic].applyDynamic("bound")(lower.asInstanceOf[js.Any], upper.asInstanceOf[js.Any])).asInstanceOf[typings.std.IDBKeyRange]
  inline def bound(lower: js.Any, upper: js.Any, lowerOpen: scala.Boolean): typings.std.IDBKeyRange = (^.asInstanceOf[js.Dynamic].applyDynamic("bound")(lower.asInstanceOf[js.Any], upper.asInstanceOf[js.Any], lowerOpen.asInstanceOf[js.Any])).asInstanceOf[typings.std.IDBKeyRange]
  inline def bound(lower: js.Any, upper: js.Any, lowerOpen: scala.Boolean, upperOpen: scala.Boolean): typings.std.IDBKeyRange = (^.asInstanceOf[js.Dynamic].applyDynamic("bound")(lower.asInstanceOf[js.Any], upper.asInstanceOf[js.Any], lowerOpen.asInstanceOf[js.Any], upperOpen.asInstanceOf[js.Any])).asInstanceOf[typings.std.IDBKeyRange]
  inline def bound(lower: js.Any, upper: js.Any, lowerOpen: Unit, upperOpen: scala.Boolean): typings.std.IDBKeyRange = (^.asInstanceOf[js.Dynamic].applyDynamic("bound")(lower.asInstanceOf[js.Any], upper.asInstanceOf[js.Any], lowerOpen.asInstanceOf[js.Any], upperOpen.asInstanceOf[js.Any])).asInstanceOf[typings.std.IDBKeyRange]
  
  /**
    * Returns a new IDBKeyRange starting at key with no upper bound. If open is true, key is not included in the range.
    */
  inline def lowerBound(lower: js.Any): typings.std.IDBKeyRange = ^.asInstanceOf[js.Dynamic].applyDynamic("lowerBound")(lower.asInstanceOf[js.Any]).asInstanceOf[typings.std.IDBKeyRange]
  inline def lowerBound(lower: js.Any, open: scala.Boolean): typings.std.IDBKeyRange = (^.asInstanceOf[js.Dynamic].applyDynamic("lowerBound")(lower.asInstanceOf[js.Any], open.asInstanceOf[js.Any])).asInstanceOf[typings.std.IDBKeyRange]
  
  /**
    * Returns a new IDBKeyRange spanning only key.
    */
  inline def only(value: js.Any): typings.std.IDBKeyRange = ^.asInstanceOf[js.Dynamic].applyDynamic("only")(value.asInstanceOf[js.Any]).asInstanceOf[typings.std.IDBKeyRange]
  
  /**
    * Returns a new IDBKeyRange with no lower bound and ending at key. If open is true, key is not included in the range.
    */
  inline def upperBound(upper: js.Any): typings.std.IDBKeyRange = ^.asInstanceOf[js.Dynamic].applyDynamic("upperBound")(upper.asInstanceOf[js.Any]).asInstanceOf[typings.std.IDBKeyRange]
  inline def upperBound(upper: js.Any, open: scala.Boolean): typings.std.IDBKeyRange = (^.asInstanceOf[js.Dynamic].applyDynamic("upperBound")(upper.asInstanceOf[js.Any], open.asInstanceOf[js.Any])).asInstanceOf[typings.std.IDBKeyRange]
}
