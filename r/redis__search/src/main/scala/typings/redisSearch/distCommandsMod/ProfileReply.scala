package typings.redisSearch.distCommandsMod

import typings.redisSearch.distCommandsAggregateMod.AggregateReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfileReply extends StObject {
  
  var profile: ProfileData
  
  var results: SearchReply | AggregateReply
}
object ProfileReply {
  
  inline def apply(profile: ProfileData, results: SearchReply | AggregateReply): ProfileReply = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileReply]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProfileReply] (val x: Self) extends AnyVal {
    
    inline def setProfile(value: ProfileData): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setResults(value: SearchReply | AggregateReply): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
  }
}
