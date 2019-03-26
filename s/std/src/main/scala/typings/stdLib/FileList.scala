package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

