package typings.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object of this type is returned by the files property of the HTML <input> element; this lets you access the list of files selected with the <input type="file"> element. It's also used for a list of files dropped into web content when using the drag and drop API; see the DataTransfer object for details on this usage. */
@js.native
trait FileList extends /* index */ NumberDictionary[File] {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[File]] = js.native
  val length: Double = js.native
  def item(index: Double): File | Null = js.native
}

