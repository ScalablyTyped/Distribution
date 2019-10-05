package typings.prompts.promptsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prompts", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T /* <: String */](questions: js.Array[PromptObject[T]]): js.Promise[Answers[T]] = js.native
  def apply[T /* <: String */](questions: js.Array[PromptObject[T]], options: Options): js.Promise[Answers[T]] = js.native
  def apply[T /* <: String */](questions: PromptObject[T]): js.Promise[Answers[T]] = js.native
  def apply[T /* <: String */](questions: PromptObject[T], options: Options): js.Promise[Answers[T]] = js.native
}

