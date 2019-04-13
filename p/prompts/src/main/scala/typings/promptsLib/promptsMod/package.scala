package typings
package promptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object promptsMod {
  type Answers[T /* <: java.lang.String */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ id in T ]: any}
    */ promptsLib.promptsLibStrings.Answers with js.Any
  type Falsy = js.UndefOr[promptsLib.promptsLibNumbers.`false` | scala.Null]
  type PrevCaller[T /* <: java.lang.String */, R] = js.Function3[
    /* prev */ js.Any, 
    /* values */ Answers[T], 
    /* prompt */ PromptObject[java.lang.String], 
    R
  ]
  type ValueOrFunc[T /* <: java.lang.String */] = T | (PrevCaller[T, T])
}
