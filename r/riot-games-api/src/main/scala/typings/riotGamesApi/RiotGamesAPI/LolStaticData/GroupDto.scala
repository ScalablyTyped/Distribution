package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupDto extends StObject {
  
  var MaxGroupOwnable: String
  
  var key: String
}
object GroupDto {
  
  @scala.inline
  def apply(MaxGroupOwnable: String, key: String): GroupDto = {
    val __obj = js.Dynamic.literal(MaxGroupOwnable = MaxGroupOwnable.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupDto]
  }
  
  @scala.inline
  implicit class GroupDtoMutableBuilder[Self <: GroupDto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxGroupOwnable(value: String): Self = StObject.set(x, "MaxGroupOwnable", value.asInstanceOf[js.Any])
  }
}
