package typings.redisSearch.commandsMod

import typings.redisSearch.aggregateMod.AggregateReply
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
  
  extension [Self <: ProfileReply](x: Self) {
    
    inline def setProfile(value: ProfileData): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setResults(value: SearchReply | AggregateReply): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
  }
}
