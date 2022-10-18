package typings.steamUser.componentsChatroomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatMentions extends StObject {
  
  var mention_all: Boolean
  
  var mention_here: Boolean
  
  var mention_steamids: js.Array[SteamID]
}
object ChatMentions {
  
  inline def apply(mention_all: Boolean, mention_here: Boolean, mention_steamids: js.Array[SteamID]): ChatMentions = {
    val __obj = js.Dynamic.literal(mention_all = mention_all.asInstanceOf[js.Any], mention_here = mention_here.asInstanceOf[js.Any], mention_steamids = mention_steamids.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMentions]
  }
  
  extension [Self <: ChatMentions](x: Self) {
    
    inline def setMention_all(value: Boolean): Self = StObject.set(x, "mention_all", value.asInstanceOf[js.Any])
    
    inline def setMention_here(value: Boolean): Self = StObject.set(x, "mention_here", value.asInstanceOf[js.Any])
    
    inline def setMention_steamids(value: js.Array[SteamID]): Self = StObject.set(x, "mention_steamids", value.asInstanceOf[js.Any])
    
    inline def setMention_steamidsVarargs(value: SteamID*): Self = StObject.set(x, "mention_steamids", js.Array(value*))
  }
}
