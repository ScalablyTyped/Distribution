package typings.steamUser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayingApp extends StObject {
  
  var playingApp: String
}
object PlayingApp {
  
  inline def apply(playingApp: String): PlayingApp = {
    val __obj = js.Dynamic.literal(playingApp = playingApp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayingApp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlayingApp] (val x: Self) extends AnyVal {
    
    inline def setPlayingApp(value: String): Self = StObject.set(x, "playingApp", value.asInstanceOf[js.Any])
  }
}
