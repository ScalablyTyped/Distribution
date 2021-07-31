package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RealmDto extends StObject {
  
  var cdn: String
  
  var css: String
  
  var dd: String
  
  var l: String
  
  var lg: String
  
  var n: js.Array[StringDictionary[String]]
  
  var profileiconmax: Double
  
  var storage: String
  
  var v: String
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
  implicit class RealmDtoMutableBuilder[Self <: RealmDto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCdn(value: String): Self = StObject.set(x, "cdn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDd(value: String): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL(value: String): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLg(value: String): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: js.Array[StringDictionary[String]]): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNVarargs(value: StringDictionary[String]*): Self = StObject.set(x, "n", js.Array(value :_*))
    
    @scala.inline
    def setProfileiconmax(value: Double): Self = StObject.set(x, "profileiconmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorage(value: String): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
