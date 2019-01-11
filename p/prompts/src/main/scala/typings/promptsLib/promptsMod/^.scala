package typings
package promptsLib.promptsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prompts", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // Circular reference from prompts
  val prompt: js.Any = js.native
  def apply[T /* <: java.lang.String */](
    questions: promptsLib.promptsMod.promptsNs.PromptObject[T] | js.Array[promptsLib.promptsMod.promptsNs.PromptObject[T]]
  ): js.Promise[promptsLib.promptsMod.promptsNs.Answers[T]] = js.native
  def apply[T /* <: java.lang.String */](
    questions: promptsLib.promptsMod.promptsNs.PromptObject[T] | js.Array[promptsLib.promptsMod.promptsNs.PromptObject[T]],
    options: promptsLib.promptsMod.promptsNs.Options
  ): js.Promise[promptsLib.promptsMod.promptsNs.Answers[T]] = js.native
  def inject(obj: js.Any): scala.Unit = js.native
}

