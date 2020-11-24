package typings.sololearn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sololearn", "searchQuestions")
@js.native
object searchQuestions extends js.Object {
  
  def apply(): js.Promise[js.Array[Question]] = js.native
  def apply(searchQuery: js.UndefOr[scala.Nothing], order: js.UndefOr[scala.Nothing], page: Double): js.Promise[js.Array[Question]] = js.native
  def apply(searchQuery: js.UndefOr[scala.Nothing], order: QuestionOrder): js.Promise[js.Array[Question]] = js.native
  def apply(searchQuery: js.UndefOr[scala.Nothing], order: QuestionOrder, page: Double): js.Promise[js.Array[Question]] = js.native
  def apply(searchQuery: String): js.Promise[js.Array[Question]] = js.native
  def apply(searchQuery: String, order: js.UndefOr[scala.Nothing], page: Double): js.Promise[js.Array[Question]] = js.native
  def apply(searchQuery: String, order: QuestionOrder): js.Promise[js.Array[Question]] = js.native
  def apply(searchQuery: String, order: QuestionOrder, page: Double): js.Promise[js.Array[Question]] = js.native
}
