package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSUnparsedValue) */
@js.native
trait CSSUnparsedValue
  extends StObject
     with CSSStyleValue
     with /* standard dom */
/* index */ NumberDictionary[CSSUnparsedSegment] {
  
  /* standard dom.iterable */
  def entries(): IterableIterator[js.Tuple2[Double, CSSUnparsedSegment]] = js.native
  
  /* standard dom */
  def forEach(
    callbackfn: js.Function3[/* value */ CSSUnparsedSegment, /* key */ Double, /* parent */ this.type, Unit]
  ): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ CSSUnparsedSegment, /* key */ Double, /* parent */ this.type, Unit],
    thisArg: Any
  ): Unit = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[CSSUnparsedSegment]] = js.native
  
  /* standard dom.iterable */
  def keys(): IterableIterator[Double] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSUnparsedValue/length) */
  /* standard dom */
  val length: Double = js.native
  
  /* standard dom.iterable */
  def values(): IterableIterator[CSSUnparsedSegment] = js.native
}
