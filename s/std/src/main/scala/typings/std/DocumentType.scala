package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A Node containing a doctype. */
@js.native
trait DocumentType
  extends StObject
     with ChildNode {
  
  /* standard dom */
  val name: java.lang.String = js.native
  
  /* standard dom */
  @JSName("ownerDocument")
  val ownerDocument_DocumentType: Document = js.native
  
  /* standard dom */
  val publicId: java.lang.String = js.native
  
  /* standard dom */
  val systemId: java.lang.String = js.native
}
