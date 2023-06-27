package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows manipulation of the browser session history, that is the pages visited in the tab or frame that the current page is loaded in.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/History)
  */
@js.native
trait History extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/back) */
  /* standard dom */
  def back(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/forward) */
  /* standard dom */
  def forward(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/go) */
  /* standard dom */
  def go(): Unit = js.native
  def go(delta: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/length) */
  /* standard dom */
  val length: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/pushState) */
  /* standard dom */
  def pushState(data: Any, unused: java.lang.String): Unit = js.native
  def pushState(data: Any, unused: java.lang.String, url: java.lang.String): Unit = js.native
  def pushState(data: Any, unused: java.lang.String, url: URL): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/replaceState) */
  /* standard dom */
  def replaceState(data: Any, unused: java.lang.String): Unit = js.native
  def replaceState(data: Any, unused: java.lang.String, url: java.lang.String): Unit = js.native
  def replaceState(data: Any, unused: java.lang.String, url: URL): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/scrollRestoration) */
  /* standard dom */
  var scrollRestoration: ScrollRestoration = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/state) */
  /* standard dom */
  val state: Any = js.native
}
