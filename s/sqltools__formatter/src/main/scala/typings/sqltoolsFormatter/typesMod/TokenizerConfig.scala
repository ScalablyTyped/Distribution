package typings.sqltoolsFormatter.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenizerConfig extends js.Object {
  
  var closeParens: js.Array[String] = js.native
  
  var indexedPlaceholderTypes: js.UndefOr[js.Array[String]] = js.native
  
  var lineCommentTypes: js.Array[String] = js.native
  
  var namedPlaceholderTypes: js.Array[String] = js.native
  
  var openParens: js.Array[String] = js.native
  
  var reservedNewlineWords: js.Array[String] = js.native
  
  var reservedTopLevelWords: js.Array[String] = js.native
  
  var reservedTopLevelWordsNoIndent: js.Array[String] = js.native
  
  var reservedWords: js.Array[String] = js.native
  
  var specialWordChars: js.Array[String] = js.native
  
  var stringTypes: js.Array[String] = js.native
}
object TokenizerConfig {
  
  @scala.inline
  def apply(
    closeParens: js.Array[String],
    lineCommentTypes: js.Array[String],
    namedPlaceholderTypes: js.Array[String],
    openParens: js.Array[String],
    reservedNewlineWords: js.Array[String],
    reservedTopLevelWords: js.Array[String],
    reservedTopLevelWordsNoIndent: js.Array[String],
    reservedWords: js.Array[String],
    specialWordChars: js.Array[String],
    stringTypes: js.Array[String]
  ): TokenizerConfig = {
    val __obj = js.Dynamic.literal(closeParens = closeParens.asInstanceOf[js.Any], lineCommentTypes = lineCommentTypes.asInstanceOf[js.Any], namedPlaceholderTypes = namedPlaceholderTypes.asInstanceOf[js.Any], openParens = openParens.asInstanceOf[js.Any], reservedNewlineWords = reservedNewlineWords.asInstanceOf[js.Any], reservedTopLevelWords = reservedTopLevelWords.asInstanceOf[js.Any], reservedTopLevelWordsNoIndent = reservedTopLevelWordsNoIndent.asInstanceOf[js.Any], reservedWords = reservedWords.asInstanceOf[js.Any], specialWordChars = specialWordChars.asInstanceOf[js.Any], stringTypes = stringTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenizerConfig]
  }
  
  @scala.inline
  implicit class TokenizerConfigOps[Self <: TokenizerConfig] (val x: Self) extends AnyVal {
    
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
    def setCloseParensVarargs(value: String*): Self = this.set("closeParens", js.Array(value :_*))
    
    @scala.inline
    def setCloseParens(value: js.Array[String]): Self = this.set("closeParens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCommentTypesVarargs(value: String*): Self = this.set("lineCommentTypes", js.Array(value :_*))
    
    @scala.inline
    def setLineCommentTypes(value: js.Array[String]): Self = this.set("lineCommentTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedPlaceholderTypesVarargs(value: String*): Self = this.set("namedPlaceholderTypes", js.Array(value :_*))
    
    @scala.inline
    def setNamedPlaceholderTypes(value: js.Array[String]): Self = this.set("namedPlaceholderTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenParensVarargs(value: String*): Self = this.set("openParens", js.Array(value :_*))
    
    @scala.inline
    def setOpenParens(value: js.Array[String]): Self = this.set("openParens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedNewlineWordsVarargs(value: String*): Self = this.set("reservedNewlineWords", js.Array(value :_*))
    
    @scala.inline
    def setReservedNewlineWords(value: js.Array[String]): Self = this.set("reservedNewlineWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedTopLevelWordsVarargs(value: String*): Self = this.set("reservedTopLevelWords", js.Array(value :_*))
    
    @scala.inline
    def setReservedTopLevelWords(value: js.Array[String]): Self = this.set("reservedTopLevelWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedTopLevelWordsNoIndentVarargs(value: String*): Self = this.set("reservedTopLevelWordsNoIndent", js.Array(value :_*))
    
    @scala.inline
    def setReservedTopLevelWordsNoIndent(value: js.Array[String]): Self = this.set("reservedTopLevelWordsNoIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedWordsVarargs(value: String*): Self = this.set("reservedWords", js.Array(value :_*))
    
    @scala.inline
    def setReservedWords(value: js.Array[String]): Self = this.set("reservedWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecialWordCharsVarargs(value: String*): Self = this.set("specialWordChars", js.Array(value :_*))
    
    @scala.inline
    def setSpecialWordChars(value: js.Array[String]): Self = this.set("specialWordChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringTypesVarargs(value: String*): Self = this.set("stringTypes", js.Array(value :_*))
    
    @scala.inline
    def setStringTypes(value: js.Array[String]): Self = this.set("stringTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexedPlaceholderTypesVarargs(value: String*): Self = this.set("indexedPlaceholderTypes", js.Array(value :_*))
    
    @scala.inline
    def setIndexedPlaceholderTypes(value: js.Array[String]): Self = this.set("indexedPlaceholderTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexedPlaceholderTypes: Self = this.set("indexedPlaceholderTypes", js.undefined)
  }
}
