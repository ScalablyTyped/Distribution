package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Range")
@js.native
/* standard dom */
open class Range ()
  extends StObject
     with typings.std.Range {
  
  /** Returns true if range is collapsed, and false otherwise. */
  /* standard dom */
  /* CompleteClass */
  override val collapsed: scala.Boolean = js.native
  
  /** Returns range's end node. */
  /* standard dom */
  /* CompleteClass */
  override val endContainer: typings.std.Node = js.native
  
  /** Returns range's end offset. */
  /* standard dom */
  /* CompleteClass */
  override val endOffset: Double = js.native
  
  /** Returns range's start node. */
  /* standard dom */
  /* CompleteClass */
  override val startContainer: typings.std.Node = js.native
  
  /** Returns range's start offset. */
  /* standard dom */
  /* CompleteClass */
  override val startOffset: Double = js.native
}
object Range {
  
  @JSGlobal("Range")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard dom */
  @JSGlobal("Range.END_TO_END")
  @js.native
  val END_TO_END: Double = js.native
  
  /* standard dom */
  @JSGlobal("Range.END_TO_START")
  @js.native
  val END_TO_START: Double = js.native
  
  /* standard dom */
  @JSGlobal("Range.START_TO_END")
  @js.native
  val START_TO_END: Double = js.native
  
  /* standard dom */
  @JSGlobal("Range.START_TO_START")
  @js.native
  val START_TO_START: Double = js.native
  
  /* standard dom */
  inline def toString_(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[java.lang.String]
}
