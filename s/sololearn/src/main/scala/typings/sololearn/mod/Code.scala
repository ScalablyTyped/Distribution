package typings.sololearn.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Code extends js.Object {
  
  /** The author's SoloLearn ID */
  var author: Double = js.native
  
  /** The code's ID */
  var id: String = js.native
  
  /** The language the code is written in */
  var language: CodeLanguage = js.native
  
  /** The date of the last modification made to the code, or `null` if it is unknown */
  var lastModified: Date | Null = js.native
  
  /** The name of the code */
  var name: String = js.native
  
  /** `true` if the code is public, `false` if it is private */
  var public: Boolean = js.native
  
  /** The amount of upvotes the code has */
  var upvotes: Double = js.native
}
object Code {
  
  @scala.inline
  def apply(author: Double, id: String, language: CodeLanguage, name: String, public: Boolean, upvotes: Double): Code = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], upvotes = upvotes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  
  @scala.inline
  implicit class CodeOps[Self <: Code] (val x: Self) extends AnyVal {
    
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
    def setAuthor(value: Double): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: CodeLanguage): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic(value: Boolean): Self = this.set("public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpvotes(value: Double): Self = this.set("upvotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModified(value: Date): Self = this.set("lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedNull: Self = this.set("lastModified", null)
  }
}
