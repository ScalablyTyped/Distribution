package typings.secureRandomPassword.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RandomPasswordCharactersSet extends js.Object {
  
  var characters: String = js.native
  
  var exactly: js.UndefOr[Double] = js.native
}
object RandomPasswordCharactersSet {
  
  @scala.inline
  def apply(characters: String): RandomPasswordCharactersSet = {
    val __obj = js.Dynamic.literal(characters = characters.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandomPasswordCharactersSet]
  }
  
  @scala.inline
  implicit class RandomPasswordCharactersSetOps[Self <: RandomPasswordCharactersSet] (val x: Self) extends AnyVal {
    
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
    def setCharacters(value: String): Self = this.set("characters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactly(value: Double): Self = this.set("exactly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExactly: Self = this.set("exactly", js.undefined)
  }
}
