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
  @JSName(ScalablyTyped.runtime.Symbol.toStringTag)
  val toStringTag: stdLib.stdLibStrings.Symbol
}

@JSGlobal("Symbol")
@js.native
object Symbol extends SymbolConstructor

