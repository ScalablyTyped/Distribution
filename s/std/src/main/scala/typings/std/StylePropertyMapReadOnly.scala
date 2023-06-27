package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StylePropertyMapReadOnly) */
@js.native
trait StylePropertyMapReadOnly extends StObject {
  
  /* standard dom.iterable */
  def entries(): IterableIterator[js.Tuple2[java.lang.String, js.Iterable[CSSStyleValue]]] = js.native
  
  /* standard dom */
  def forEach(
    callbackfn: js.Function3[
      /* value */ js.Array[CSSStyleValue], 
      /* key */ java.lang.String, 
      /* parent */ this.type, 
      Unit
    ]
  ): Unit = js.native
  def forEach(
    callbackfn: js.Function3[
      /* value */ js.Array[CSSStyleValue], 
      /* key */ java.lang.String, 
      /* parent */ this.type, 
      Unit
    ],
    thisArg: Any
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StylePropertyMapReadOnly/get) */
  /* standard dom */
  def get(property: java.lang.String): js.UndefOr[CSSStyleValue] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StylePropertyMapReadOnly/getAll) */
  /* standard dom */
  def getAll(property: java.lang.String): js.Array[CSSStyleValue] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StylePropertyMapReadOnly/has) */
  /* standard dom */
  def has(property: java.lang.String): scala.Boolean = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[js.Tuple2[java.lang.String, js.Iterable[CSSStyleValue]]]] = js.native
  
  /* standard dom.iterable */
  def keys(): IterableIterator[java.lang.String] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StylePropertyMapReadOnly/size) */
  /* standard dom */
  val size: Double = js.native
  
  /* standard dom.iterable */
  def values(): IterableIterator[js.Iterable[CSSStyleValue]] = js.native
}
