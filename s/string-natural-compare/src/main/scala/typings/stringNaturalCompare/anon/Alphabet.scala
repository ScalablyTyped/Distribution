package typings.stringNaturalCompare.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alphabet extends js.Object {
  
  var alphabet: js.UndefOr[String] = js.native
  
  var caseInsensitive: js.UndefOr[Boolean] = js.native
}
object Alphabet {
  
  @scala.inline
  def apply(): Alphabet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alphabet]
  }
  
  @scala.inline
  implicit class AlphabetOps[Self <: Alphabet] (val x: Self) extends AnyVal {
    
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
    def setAlphabet(value: String): Self = this.set("alphabet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlphabet: Self = this.set("alphabet", js.undefined)
    
    @scala.inline
    def setCaseInsensitive(value: Boolean): Self = this.set("caseInsensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseInsensitive: Self = this.set("caseInsensitive", js.undefined)
  }
}
