package typings.steamUser.anon

import typings.steamUser.componentsChatroomMod.GroupInviteLinks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Invitelinks extends StObject {
  
  var invite_links: js.Array[GroupInviteLinks]
}
object Invitelinks {
  
  inline def apply(invite_links: js.Array[GroupInviteLinks]): Invitelinks = {
    val __obj = js.Dynamic.literal(invite_links = invite_links.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invitelinks]
  }
  
  extension [Self <: Invitelinks](x: Self) {
    
    inline def setInvite_links(value: js.Array[GroupInviteLinks]): Self = StObject.set(x, "invite_links", value.asInstanceOf[js.Any])
    
    inline def setInvite_linksVarargs(value: GroupInviteLinks*): Self = StObject.set(x, "invite_links", js.Array(value*))
  }
}
