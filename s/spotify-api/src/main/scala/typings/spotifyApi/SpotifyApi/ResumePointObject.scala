package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resume Point Object
  * [resume point object](https://developer.spotify.com/documentation/web-api/reference/object-model/#resume-point-object)
  */
trait ResumePointObject extends StObject {
  
  /**
    * Whether or not the episode has been fully played by the user.
    */
  var fully_played: Boolean
  
  /**
    * The user’s most recent position in the episode in milliseconds.
    */
  var resume_position_ms: Double
}
object ResumePointObject {
  
  inline def apply(fully_played: Boolean, resume_position_ms: Double): ResumePointObject = {
    val __obj = js.Dynamic.literal(fully_played = fully_played.asInstanceOf[js.Any], resume_position_ms = resume_position_ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResumePointObject]
  }
  
  extension [Self <: ResumePointObject](x: Self) {
    
    inline def setFully_played(value: Boolean): Self = StObject.set(x, "fully_played", value.asInstanceOf[js.Any])
    
    inline def setResume_position_ms(value: Double): Self = StObject.set(x, "resume_position_ms", value.asInstanceOf[js.Any])
  }
}
