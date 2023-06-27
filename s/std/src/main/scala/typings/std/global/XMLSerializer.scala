package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("XMLSerializer")
@js.native
/* standard dom */
open class XMLSerializer ()
  extends StObject
     with typings.std.XMLSerializer {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLSerializer/serializeToString) */
  /* standard dom */
  /* CompleteClass */
  override def serializeToString(root: typings.std.Node): java.lang.String = js.native
}
