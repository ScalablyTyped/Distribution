package typings.spotifyWebPlaybackSdk

import org.scalablytyped.runtime.Instantiable1
import typings.spotifyWebPlaybackSdk.Spotify.Player
import typings.spotifyWebPlaybackSdk.Spotify.PlayerInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Hifistatus extends StObject {
    
    var hifi_status: String
  }
  object Hifistatus {
    
    inline def apply(hifi_status: String): Hifistatus = {
      val __obj = js.Dynamic.literal(hifi_status = hifi_status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hifistatus]
    }
    
    extension [Self <: Hifistatus](x: Self) {
      
      inline def setHifi_status(value: String): Self = StObject.set(x, "hifi_status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: String | Null
    
    var uri: String | Null
  }
  object Id {
    
    inline def apply(): Id = {
      val __obj = js.Dynamic.literal(id = null, uri = null)
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdNull: Self = StObject.set(x, "id", null)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriNull: Self = StObject.set(x, "uri", null)
    }
  }
  
  /* Inlined spotify-web-playback-sdk.Spotify.PlayerInit & {  id :string} */
  trait PlayerInitidstring extends StObject {
    
    def getOAuthToken(cb: js.Function1[/* token */ String, Unit]): Unit
    
    var id: String
    
    var name: String
    
    var volume: js.UndefOr[Double] = js.undefined
  }
  object PlayerInitidstring {
    
    inline def apply(getOAuthToken: js.Function1[/* token */ String, Unit] => Unit, id: String, name: String): PlayerInitidstring = {
      val __obj = js.Dynamic.literal(getOAuthToken = js.Any.fromFunction1(getOAuthToken), id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayerInitidstring]
    }
    
    extension [Self <: PlayerInitidstring](x: Self) {
      
      inline def setGetOAuthToken(value: js.Function1[/* token */ String, Unit] => Unit): Self = StObject.set(x, "getOAuthToken", js.Any.fromFunction1(value))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    }
  }
  
  trait Repeatmode extends StObject {
    
    var repeat_mode: String
    
    var shuffled: Boolean
  }
  object Repeatmode {
    
    inline def apply(repeat_mode: String, shuffled: Boolean): Repeatmode = {
      val __obj = js.Dynamic.literal(repeat_mode = repeat_mode.asInstanceOf[js.Any], shuffled = shuffled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Repeatmode]
    }
    
    extension [Self <: Repeatmode](x: Self) {
      
      inline def setRepeat_mode(value: String): Self = StObject.set(x, "repeat_mode", value.asInstanceOf[js.Any])
      
      inline def setShuffled(value: Boolean): Self = StObject.set(x, "shuffled", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofSpotify extends StObject {
    
    var Player: Instantiable1[/* options */ PlayerInit, typings.spotifyWebPlaybackSdk.Spotify.Player]
  }
  object TypeofSpotify {
    
    inline def apply(Player: Instantiable1[/* options */ PlayerInit, Player]): TypeofSpotify = {
      val __obj = js.Dynamic.literal(Player = Player.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofSpotify]
    }
    
    extension [Self <: TypeofSpotify](x: Self) {
      
      inline def setPlayer(value: Instantiable1[/* options */ PlayerInit, Player]): Self = StObject.set(x, "Player", value.asInstanceOf[js.Any])
    }
  }
}
