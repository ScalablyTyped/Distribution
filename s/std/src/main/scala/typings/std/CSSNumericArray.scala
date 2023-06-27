package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericArray) */
@js.native
trait CSSNumericArray
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[CSSNumericValue] {
  
  /* standard dom.iterable */
  def entries(): IterableIterator[js.Tuple2[Double, CSSNumericValue]] = js.native
  
  /* standard dom */
  def forEach(
    callbackfn: js.Function3[/* value */ CSSNumericValue, /* key */ Double, /* parent */ this.type, Unit]
  ): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ CSSNumericValue, /* key */ Double, /* parent */ this.type, Unit],
    thisArg: Any
  ): Unit = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[CSSNumericValue]] = js.native
  
  /* standard dom.iterable */
  def keys(): IterableIterator[Double] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericArray/length) */
  /* standard dom */
  val length: Double = js.native
  
  /* standard dom.iterable */
  def values(): IterableIterator[CSSNumericValue] = js.native
}
