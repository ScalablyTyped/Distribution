package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageStringsDto extends StObject {
  
  var data: js.Array[StringDictionary[String]] = js.native
  
  var `type`: String = js.native
  
  var version: String = js.native
}
object LanguageStringsDto {
  
  @scala.inline
  def apply(data: js.Array[StringDictionary[String]], `type`: String, version: String): LanguageStringsDto = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageStringsDto]
  }
  
  @scala.inline
  implicit class LanguageStringsDtoMutableBuilder[Self <: LanguageStringsDto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[StringDictionary[String]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: StringDictionary[String]*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
