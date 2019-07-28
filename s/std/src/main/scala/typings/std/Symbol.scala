package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Symbol extends js.Object {
  /**
    * expose the [[Description]] internal slot of a symbol directly
    */
  val description: java.lang.String = js.native
  @JSName(scala.scalajs.js.Symbol.toStringTag)
  val toStringTag: java.lang.String = js.native
}

@JSGlobal("Symbol")
@js.native
object Symbol extends SymbolConstructor

