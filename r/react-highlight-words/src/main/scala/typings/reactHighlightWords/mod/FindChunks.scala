package typings.reactHighlightWords.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindChunks extends js.Object {
  
  var autoEscape: js.UndefOr[Boolean] = js.native
  
  var caseSensitive: js.UndefOr[Boolean] = js.native
  
  var sanitize: js.UndefOr[js.Function1[/* text */ String, String]] = js.native
  
  var searchWords: js.Array[String] = js.native
  
  var textToHighlight: String = js.native
}
object FindChunks {
  
  @scala.inline
  def apply(searchWords: js.Array[String], textToHighlight: String): FindChunks = {
    val __obj = js.Dynamic.literal(searchWords = searchWords.asInstanceOf[js.Any], textToHighlight = textToHighlight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindChunks]
  }
  
  @scala.inline
  implicit class FindChunksOps[Self <: FindChunks] (val x: Self) extends AnyVal {
    
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
    def setSearchWordsVarargs(value: String*): Self = this.set("searchWords", js.Array(value :_*))
    
    @scala.inline
    def setSearchWords(value: js.Array[String]): Self = this.set("searchWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextToHighlight(value: String): Self = this.set("textToHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoEscape(value: Boolean): Self = this.set("autoEscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoEscape: Self = this.set("autoEscape", js.undefined)
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    
    @scala.inline
    def setSanitize(value: /* text */ String => String): Self = this.set("sanitize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSanitize: Self = this.set("sanitize", js.undefined)
  }
}
