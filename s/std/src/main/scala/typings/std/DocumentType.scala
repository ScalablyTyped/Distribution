package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Node containing a doctype.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType)
  */
@js.native
trait DocumentType
  extends StObject
     with ChildNode {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/name) */
  /* standard dom */
  val name: java.lang.String = js.native
  
  /* standard dom */
  @JSName("ownerDocument")
  val ownerDocument_DocumentType: Document = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/publicId) */
  /* standard dom */
  val publicId: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/systemId) */
  /* standard dom */
  val systemId: java.lang.String = js.native
}
