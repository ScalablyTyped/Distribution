package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLCollection
  extends StObject
     with HTMLCollectionBase {
  
  /**
    * Retrieves a select object or an object from an options collection.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCollection/namedItem)
    */
  /* standard dom */
  def namedItem(name: java.lang.String): Element | Null = js.native
}
