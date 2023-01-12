package typings.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resume Point Object
  * [resume point object](https://developer.spotify.com/documentation/web-api/reference/object-model/#resume-point-object)
  */
trait ResumePointObject extends StObject {
  
  var full_played: Boolean
  
  var resume_position_ms: Double
}
object ResumePointObject {
  
  inline def apply(full_played: Boolean, resume_position_ms: Double): ResumePointObject = {
    val __obj = js.Dynamic.literal(full_played = full_played.asInstanceOf[js.Any], resume_position_ms = resume_position_ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResumePointObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResumePointObject] (val x: Self) extends AnyVal {
    
    inline def setFull_played(value: Boolean): Self = StObject.set(x, "full_played", value.asInstanceOf[js.Any])
    
    inline def setResume_position_ms(value: Double): Self = StObject.set(x, "resume_position_ms", value.asInstanceOf[js.Any])
  }
}
