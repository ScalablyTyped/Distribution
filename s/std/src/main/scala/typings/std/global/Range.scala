package typings.std.global

import typings.std.stdInts.`0`
import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import typings.std.stdInts.`3`
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
  
  /**
    * Returns true if range is collapsed, and false otherwise.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbstractRange/collapsed)
    */
  /* standard dom */
  /* CompleteClass */
  override val collapsed: scala.Boolean = js.native
  
  /**
    * Returns range's end node.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbstractRange/endContainer)
    */
  /* standard dom */
  /* CompleteClass */
  override val endContainer: typings.std.Node = js.native
  
  /**
    * Returns range's end offset.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbstractRange/endOffset)
    */
  /* standard dom */
  /* CompleteClass */
  override val endOffset: Double = js.native
  
  /**
    * Returns range's start node.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbstractRange/startContainer)
    */
  /* standard dom */
  /* CompleteClass */
  override val startContainer: typings.std.Node = js.native
  
  /**
    * Returns range's start offset.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbstractRange/startOffset)
    */
  /* standard dom */
  /* CompleteClass */
  override val startOffset: Double = js.native
}
object Range {
  
  /* standard dom */
  @JSGlobal("Range.END_TO_END")
  @js.native
  val END_TO_END: `2` = js.native
  
  /* standard dom */
  @JSGlobal("Range.END_TO_START")
  @js.native
  val END_TO_START: `3` = js.native
  
  /* standard dom */
  @JSGlobal("Range.START_TO_END")
  @js.native
  val START_TO_END: `1` = js.native
  
  /* standard dom */
  @JSGlobal("Range.START_TO_START")
  @js.native
  val START_TO_START: `0` = js.native
}
