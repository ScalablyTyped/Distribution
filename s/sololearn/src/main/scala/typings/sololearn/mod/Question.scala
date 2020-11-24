package typings.sololearn.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Question extends js.Object {
  
  /** An array of the top 20 answers to the question, sorted by upvotes. This does not include the best answer */
  var answers: js.Array[Answer] = js.native
  
  /** The author's SoloLearn ID */
  var author: Double = js.native
  
  /** The answer that is marked as best, or `null` if there is no best answer */
  var bestAnswer: Answer | Null = js.native
  
  /** The content of the question */
  var content: String = js.native
  
  /** The date the question was written */
  var date: Date = js.native
  
  /** The question's ID */
  var id: Double = js.native
  
  /** The tags that the question has */
  var tags: js.Array[String] = js.native
  
  /** The title of the question */
  var title: String = js.native
  
  /** The amount of upvotes the question has */
  var upvotes: Double = js.native
}
object Question {
  
  @scala.inline
  def apply(
    answers: js.Array[Answer],
    author: Double,
    content: String,
    date: Date,
    id: Double,
    tags: js.Array[String],
    title: String,
    upvotes: Double
  ): Question = {
    val __obj = js.Dynamic.literal(answers = answers.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], upvotes = upvotes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Question]
  }
  
  @scala.inline
  implicit class QuestionOps[Self <: Question] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnswersVarargs(value: Answer*): Self = this.set("answers", js.Array(value :_*))
    
    @scala.inline
    def setAnswers(value: js.Array[Answer]): Self = this.set("answers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor(value: Double): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpvotes(value: Double): Self = this.set("upvotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBestAnswer(value: Answer): Self = this.set("bestAnswer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBestAnswerNull: Self = this.set("bestAnswer", null)
  }
}
