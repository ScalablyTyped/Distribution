package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A DOM element's attribute as an object. In most DOM methods, you will probably directly retrieve the attribute as a string (e.g., Element.getAttribute(), but certain functions (e.g., Element.getAttributeNode()) or means of iterating give Attr types. */
@js.native
trait Attr
  extends StObject
     with Node {
  
  /* standard dom */
  val localName: java.lang.String = js.native
  
  /* standard dom */
  val name: java.lang.String = js.native
  
  /* standard dom */
  val namespaceURI: java.lang.String | Null = js.native
  
  /* standard dom */
  @JSName("ownerDocument")
  val ownerDocument_Attr: Document = js.native
  
  /* standard dom */
  val ownerElement: Element | Null = js.native
  
  /* standard dom */
  val prefix: java.lang.String | Null = js.native
  
  /** @deprecated */
  /* standard dom */
  val specified: scala.Boolean = js.native
  
  /* standard dom */
  var value: java.lang.String = js.native
}
