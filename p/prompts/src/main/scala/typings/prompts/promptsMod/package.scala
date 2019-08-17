package typings.prompts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object promptsMod {
  import typings.prompts.promptsNumbers.`false`

  type Answers[T /* <: String */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ id in T ]: any}
    */ typings.prompts.promptsStrings.Answers with js.Any
  type Falsy = js.UndefOr[`false` | Null]
  type PrevCaller[T /* <: String */, R] = js.Function3[/* prev */ js.Any, /* values */ Answers[T], /* prompt */ PromptObject[String], R]
  type ValueOrFunc[T /* <: String */] = T | (PrevCaller[T, T])
}
