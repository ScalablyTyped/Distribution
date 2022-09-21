package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfileItems extends StObject {
  
  var animated_avatars: js.Array[ProfileItem]
  
  var avatar_frames: js.Array[ProfileItem]
  
  var mini_profile_backgrounds: js.Array[ProfileItem]
  
  var profile_backgrounds: js.Array[ProfileItem]
  
  var profile_modifiers: js.Array[ProfileItem]
}
object ProfileItems {
  
  inline def apply(
    animated_avatars: js.Array[ProfileItem],
    avatar_frames: js.Array[ProfileItem],
    mini_profile_backgrounds: js.Array[ProfileItem],
    profile_backgrounds: js.Array[ProfileItem],
    profile_modifiers: js.Array[ProfileItem]
  ): ProfileItems = {
    val __obj = js.Dynamic.literal(animated_avatars = animated_avatars.asInstanceOf[js.Any], avatar_frames = avatar_frames.asInstanceOf[js.Any], mini_profile_backgrounds = mini_profile_backgrounds.asInstanceOf[js.Any], profile_backgrounds = profile_backgrounds.asInstanceOf[js.Any], profile_modifiers = profile_modifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileItems]
  }
  
  extension [Self <: ProfileItems](x: Self) {
    
    inline def setAnimated_avatars(value: js.Array[ProfileItem]): Self = StObject.set(x, "animated_avatars", value.asInstanceOf[js.Any])
    
    inline def setAnimated_avatarsVarargs(value: ProfileItem*): Self = StObject.set(x, "animated_avatars", js.Array(value*))
    
    inline def setAvatar_frames(value: js.Array[ProfileItem]): Self = StObject.set(x, "avatar_frames", value.asInstanceOf[js.Any])
    
    inline def setAvatar_framesVarargs(value: ProfileItem*): Self = StObject.set(x, "avatar_frames", js.Array(value*))
    
    inline def setMini_profile_backgrounds(value: js.Array[ProfileItem]): Self = StObject.set(x, "mini_profile_backgrounds", value.asInstanceOf[js.Any])
    
    inline def setMini_profile_backgroundsVarargs(value: ProfileItem*): Self = StObject.set(x, "mini_profile_backgrounds", js.Array(value*))
    
    inline def setProfile_backgrounds(value: js.Array[ProfileItem]): Self = StObject.set(x, "profile_backgrounds", value.asInstanceOf[js.Any])
    
    inline def setProfile_backgroundsVarargs(value: ProfileItem*): Self = StObject.set(x, "profile_backgrounds", js.Array(value*))
    
    inline def setProfile_modifiers(value: js.Array[ProfileItem]): Self = StObject.set(x, "profile_modifiers", value.asInstanceOf[js.Any])
    
    inline def setProfile_modifiersVarargs(value: ProfileItem*): Self = StObject.set(x, "profile_modifiers", js.Array(value*))
  }
}
