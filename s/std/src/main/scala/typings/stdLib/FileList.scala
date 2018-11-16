package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FileList
  extends /* index */ ScalablyTyped.runtime.NumberDictionary[File] {
  @JSName(ScalablyTyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[File]]
  val length: scala.Double
  def item(index: scala.Double): File | scala.Null
}

@JSGlobal("FileList")
@js.native
object FileList
  extends ScalablyTyped.runtime.Instantiable0[FileList]

