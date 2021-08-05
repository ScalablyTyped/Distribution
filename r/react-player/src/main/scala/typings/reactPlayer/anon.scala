package typings.reactPlayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Loaded extends StObject {
    
    var loaded: Double
    
    var loadedSeconds: Double
    
    var played: Double
    
    var playedSeconds: Double
  }
  object Loaded {
    
    inline def apply(loaded: Double, loadedSeconds: Double, played: Double, playedSeconds: Double): Loaded = {
      val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], loadedSeconds = loadedSeconds.asInstanceOf[js.Any], played = played.asInstanceOf[js.Any], playedSeconds = playedSeconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[Loaded]
    }
    
    extension [Self <: Loaded](x: Self) {
      
      inline def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setLoadedSeconds(value: Double): Self = StObject.set(x, "loadedSeconds", value.asInstanceOf[js.Any])
      
      inline def setPlayed(value: Double): Self = StObject.set(x, "played", value.asInstanceOf[js.Any])
      
      inline def setPlayedSeconds(value: Double): Self = StObject.set(x, "playedSeconds", value.asInstanceOf[js.Any])
    }
  }
}
