package typings.secureRandomPassword.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RandomPasswordOptions extends js.Object {
  
  var avoidAmbiguous: js.UndefOr[Boolean] = js.native
  
  var characters: js.UndefOr[
    String | RandomPasswordCharactersSet | (js.Array[RandomPasswordCharactersSet | String])
  ] = js.native
  
  var length: js.UndefOr[Double] = js.native
  
  var predicate: js.UndefOr[js.Function1[/* result */ String, Boolean]] = js.native
}
object RandomPasswordOptions {
  
  @scala.inline
  def apply(): RandomPasswordOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RandomPasswordOptions]
  }
  
  @scala.inline
  implicit class RandomPasswordOptionsOps[Self <: RandomPasswordOptions] (val x: Self) extends AnyVal {
    
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
    def setAvoidAmbiguous(value: Boolean): Self = this.set("avoidAmbiguous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvoidAmbiguous: Self = this.set("avoidAmbiguous", js.undefined)
    
    @scala.inline
    def setCharactersVarargs(value: (RandomPasswordCharactersSet | String)*): Self = this.set("characters", js.Array(value :_*))
    
    @scala.inline
    def setCharacters(value: String | RandomPasswordCharactersSet | (js.Array[RandomPasswordCharactersSet | String])): Self = this.set("characters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharacters: Self = this.set("characters", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setPredicate(value: /* result */ String => Boolean): Self = this.set("predicate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePredicate: Self = this.set("predicate", js.undefined)
  }
}
