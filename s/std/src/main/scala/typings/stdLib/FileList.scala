package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object of this type is returned by the files property of the HTML <input> element; this lets you access the list of files selected with the <input type="file"> element. It's also used for a list of files dropped into web content when using the drag and drop API; see the DataTransfer object for details on this usage. */
trait FileList
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[File] {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[File]]
  val length: scala.Double
  def item(index: scala.Double): File | scala.Null
}

@JSGlobal("FileList")
@js.native
class FileListCls () extends FileList {
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[IterableIterator[File]] = js.native
  /* CompleteClass */
  override val length: scala.Double = js.native
  /* CompleteClass */
  override def item(index: scala.Double): File | scala.Null = js.native
}

@JSGlobal("FileList")
@js.native
object FileList
  extends org.scalablytyped.runtime.Instantiable0[FileList]

