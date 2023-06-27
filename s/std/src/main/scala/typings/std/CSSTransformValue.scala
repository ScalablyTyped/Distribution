package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTransformValue) */
@js.native
trait CSSTransformValue
  extends StObject
     with CSSStyleValue
     with /* standard dom */
/* index */ NumberDictionary[CSSTransformComponent] {
  
  /* standard dom.iterable */
  def entries(): IterableIterator[js.Tuple2[Double, CSSTransformComponent]] = js.native
  
  /* standard dom */
  def forEach(
    callbackfn: js.Function3[/* value */ CSSTransformComponent, /* key */ Double, /* parent */ this.type, Unit]
  ): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ CSSTransformComponent, /* key */ Double, /* parent */ this.type, Unit],
    thisArg: Any
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTransformValue/is2D) */
  /* standard dom */
  val is2D: scala.Boolean = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[CSSTransformComponent]] = js.native
  
  /* standard dom.iterable */
  def keys(): IterableIterator[Double] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTransformValue/length) */
  /* standard dom */
  val length: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTransformValue/toMatrix) */
  /* standard dom */
  def toMatrix(): DOMMatrix = js.native
  
  /* standard dom.iterable */
  def values(): IterableIterator[CSSTransformComponent] = js.native
}
