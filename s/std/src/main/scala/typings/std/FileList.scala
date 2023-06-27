package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object of this type is returned by the files property of the HTML <input> element; this lets you access the list of files selected with the <input type="file"> element. It's also used for a list of files dropped into web content when using the drag and drop API; see the DataTransfer object for details on this usage.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileList)
  */
@js.native
trait FileList
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[File] {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileList/item) */
  /* standard dom */
  def item(index: Double): File | Null = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[File]] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileList/length) */
  /* standard dom */
  val length: Double = js.native
}
