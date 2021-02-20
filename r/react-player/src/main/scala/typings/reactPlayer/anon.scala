package typings.reactPlayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Loaded extends StObject {
    
    var loaded: Double = js.native
    
    var loadedSeconds: Double = js.native
    
    var played: Double = js.native
    
    var playedSeconds: Double = js.native
  }
  object Loaded {
    
    @scala.inline
    def apply(loaded: Double, loadedSeconds: Double, played: Double, playedSeconds: Double): Loaded = {
      val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], loadedSeconds = loadedSeconds.asInstanceOf[js.Any], played = played.asInstanceOf[js.Any], playedSeconds = playedSeconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[Loaded]
    }
    
    @scala.inline
    implicit class LoadedMutableBuilder[Self <: Loaded] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedSeconds(value: Double): Self = StObject.set(x, "loadedSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayed(value: Double): Self = StObject.set(x, "played", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayedSeconds(value: Double): Self = StObject.set(x, "playedSeconds", value.asInstanceOf[js.Any])
    }
  }
}
