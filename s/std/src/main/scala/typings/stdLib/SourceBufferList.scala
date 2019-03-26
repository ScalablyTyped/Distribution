package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceBufferList
  extends EventTarget
     with /* index */ org.scalablytyped.runtime.NumberDictionary[SourceBuffer] {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SourceBuffer]] = js.native
  val length: scala.Double = js.native
  def item(index: scala.Double): SourceBuffer = js.native
}

@JSGlobal("SourceBufferList")
@js.native
class SourceBufferListCls () extends SourceBufferList

@JSGlobal("SourceBufferList")
@js.native
object SourceBufferList
  extends org.scalablytyped.runtime.Instantiable0[SourceBufferList]

