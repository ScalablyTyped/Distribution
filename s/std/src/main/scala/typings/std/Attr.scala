package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A DOM element's attribute as an object. In most DOM methods, you will probably directly retrieve the attribute as a string (e.g., Element.getAttribute(), but certain functions (e.g., Element.getAttributeNode()) or means of iterating give Attr types.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr)
  */
@js.native
trait Attr
  extends StObject
     with Node {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/localName) */
  /* standard dom */
  val localName: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/name) */
  /* standard dom */
  val name: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/namespaceURI) */
  /* standard dom */
  val namespaceURI: java.lang.String | Null = js.native
  
  /* standard dom */
  @JSName("ownerDocument")
  val ownerDocument_Attr: Document = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/ownerElement) */
  /* standard dom */
  val ownerElement: Element | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/prefix) */
  /* standard dom */
  val prefix: java.lang.String | Null = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/specified)
    */
  /* standard dom */
  val specified: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/value) */
  /* standard dom */
  var value: java.lang.String = js.native
}
