package typings.std.Intl

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Segments extends StObject {
  
  /**
    * Returns an object describing the segment in the original string that includes the code unit at a specified index.
    *
    * @param codeUnitIndex - A number specifying the index of the code unit in the original input string. If the value is omitted, it defaults to `0`.
    */
  /* standard es2022.intl */
  def containing(): SegmentData = js.native
  def containing(codeUnitIndex: Double): SegmentData = js.native
  
  /** Returns an iterator to iterate over the segments. */
  /* standard es2022.intl */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SegmentData]] = js.native
}
