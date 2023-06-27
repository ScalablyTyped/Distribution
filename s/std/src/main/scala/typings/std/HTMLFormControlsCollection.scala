package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of HTML form control elements.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormControlsCollection)
  */
@js.native
trait HTMLFormControlsCollection
  extends StObject
     with HTMLCollectionBase {
  
  /**
    * Returns the item with ID or name name from the collection.
    *
    * If there are multiple matching items, then a RadioNodeList object containing all those elements is returned.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormControlsCollection/namedItem)
    */
  /* standard dom */
  def namedItem(name: java.lang.String): RadioNodeList | Element | Null = js.native
}
