package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Symbol extends js.Object {
  /**
    * expose the [[Description]] internal slot of a symbol directly
    */
  val description: java.lang.String
  @JSName(org.scalablytyped.runtime.Symbol.toStringTag)
  val toStringTag: java.lang.String
}

@JSGlobal("Symbol")
@js.native
object Symbol extends SymbolConstructor

