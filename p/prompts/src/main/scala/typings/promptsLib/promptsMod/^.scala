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
  def apply[T /* <: java.lang.String */](questions: PromptObject[T] | js.Array[PromptObject[T]]): js.Promise[Answers[T]] = js.native
  def apply[T /* <: java.lang.String */](questions: PromptObject[T] | js.Array[PromptObject[T]], options: Options): js.Promise[Answers[T]] = js.native
  def autocomplete(args: PromptObject[java.lang.String]): js.Any = js.native
  def confirm(args: PromptObject[java.lang.String]): scala.Unit = js.native
  def date(args: PromptObject[java.lang.String]): js.Any = js.native
  def inject(obj: js.Any): scala.Unit = js.native
  def invisible(args: PromptObject[java.lang.String]): js.Any = js.native
  def list(args: PromptObject[java.lang.String]): js.Any = js.native
  def multiselect(args: PromptObject[java.lang.String]): js.Any = js.native
  def number(args: PromptObject[java.lang.String]): scala.Unit = js.native
  def password(args: PromptObject[java.lang.String]): js.Any = js.native
  def select(args: PromptObject[java.lang.String]): scala.Unit = js.native
  def text(args: PromptObject[java.lang.String]): scala.Unit = js.native
  def toggle(args: PromptObject[java.lang.String]): scala.Unit = js.native
}

