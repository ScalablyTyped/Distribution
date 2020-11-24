package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RealmDto extends js.Object {
  
  var cdn: String = js.native
  
  var css: String = js.native
  
  var dd: String = js.native
  
  var l: String = js.native
  
  var lg: String = js.native
  
  var n: js.Array[StringDictionary[String]] = js.native
  
  var profileiconmax: Double = js.native
  
  var storage: String = js.native
  
  var v: String = js.native
}
object RealmDto {
  
  @scala.inline
  def apply(
    cdn: String,
    css: String,
    dd: String,
    l: String,
    lg: String,
    n: js.Array[StringDictionary[String]],
    profileiconmax: Double,
    storage: String,
    v: String
  ): RealmDto = {
    val __obj = js.Dynamic.literal(cdn = cdn.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], dd = dd.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], lg = lg.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], profileiconmax = profileiconmax.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealmDto]
  }
  
  @scala.inline
  implicit class RealmDtoOps[Self <: RealmDto] (val x: Self) extends AnyVal {
    
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
    def setCdn(value: String): Self = this.set("cdn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCss(value: String): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDd(value: String): Self = this.set("dd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL(value: String): Self = this.set("l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLg(value: String): Self = this.set("lg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNVarargs(value: StringDictionary[String]*): Self = this.set("n", js.Array(value :_*))
    
    @scala.inline
    def setN(value: js.Array[StringDictionary[String]]): Self = this.set("n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileiconmax(value: Double): Self = this.set("profileiconmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorage(value: String): Self = this.set("storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV(value: String): Self = this.set("v", value.asInstanceOf[js.Any])
  }
}
