package typings
package shelljsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object shelljsMod {
  type ExecCallback = js.Function3[
    /* code */ scala.Double, 
    /* stdout */ java.lang.String, 
    /* stderr */ java.lang.String, 
    js.Any
  ]
  type ShellArray = js.Array[java.lang.String] with ShellReturnValue
  type ShellString = java.lang.String with ShellReturnValue
  type TestOptions = shelljsLib.shelljsLibStrings.`-b` | shelljsLib.shelljsLibStrings.`-c` | shelljsLib.shelljsLibStrings.`-d` | shelljsLib.shelljsLibStrings.`-e` | shelljsLib.shelljsLibStrings.`-f` | shelljsLib.shelljsLibStrings.`-L` | shelljsLib.shelljsLibStrings.`-p` | shelljsLib.shelljsLibStrings.`-S`
  type TouchOptionsLiteral = shelljsLib.shelljsLibStrings.`-a` | shelljsLib.shelljsLibStrings.`-c` | shelljsLib.shelljsLibStrings.`-m` | shelljsLib.shelljsLibStrings.`-d` | shelljsLib.shelljsLibStrings.`-r`
}
