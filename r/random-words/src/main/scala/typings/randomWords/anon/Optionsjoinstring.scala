package typings.randomWords.anon

import typings.randomWords.mod.WordFormatter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined random-words.random-words.Options & {  join :string} */
@js.native
trait Optionsjoinstring extends js.Object {
  
  var exactly: js.UndefOr[Double] = js.native
  
  var formatter: js.UndefOr[WordFormatter] = js.native
  
  var join: js.UndefOr[String] with String = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var maxLength: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var separator: js.UndefOr[String] = js.native
  
  var wordsPerString: js.UndefOr[Double] = js.native
}
object Optionsjoinstring {
  
  @scala.inline
  def apply(join: js.UndefOr[String] with String): Optionsjoinstring = {
    val __obj = js.Dynamic.literal(join = join.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optionsjoinstring]
  }
  
  @scala.inline
  implicit class OptionsjoinstringOps[Self <: Optionsjoinstring] (val x: Self) extends AnyVal {
    
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
    def setJoin(value: js.UndefOr[String] with String): Self = this.set("join", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactly(value: Double): Self = this.set("exactly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExactly: Self = this.set("exactly", js.undefined)
    
    @scala.inline
    def setFormatter(value: (/* word */ String, /* relativeIndex */ js.UndefOr[Double]) => String): Self = this.set("formatter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setWordsPerString(value: Double): Self = this.set("wordsPerString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordsPerString: Self = this.set("wordsPerString", js.undefined)
  }
}
