package typings.spotifyWebPlaybackSdk.Spotify

import typings.spotifyWebPlaybackSdk.anon.Repeatmode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaybackContextMetadata
  extends StObject
     with Entity {
  
  var current_item: PlaybackContextTrack
  
  var next_items: js.Array[PlaybackContextTrack]
  
  var options: Repeatmode
  
  var previous_items: js.Array[PlaybackContextTrack]
  
  var restrictions: PlaybackContextRestrictions
}
object PlaybackContextMetadata {
  
  inline def apply(
    current_item: PlaybackContextTrack,
    name: String,
    next_items: js.Array[PlaybackContextTrack],
    options: Repeatmode,
    previous_items: js.Array[PlaybackContextTrack],
    restrictions: PlaybackContextRestrictions,
    uri: String,
    url: String
  ): PlaybackContextMetadata = {
    val __obj = js.Dynamic.literal(current_item = current_item.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next_items = next_items.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], previous_items = previous_items.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackContextMetadata]
  }
  
  extension [Self <: PlaybackContextMetadata](x: Self) {
    
    inline def setCurrent_item(value: PlaybackContextTrack): Self = StObject.set(x, "current_item", value.asInstanceOf[js.Any])
    
    inline def setNext_items(value: js.Array[PlaybackContextTrack]): Self = StObject.set(x, "next_items", value.asInstanceOf[js.Any])
    
    inline def setNext_itemsVarargs(value: PlaybackContextTrack*): Self = StObject.set(x, "next_items", js.Array(value*))
    
    inline def setOptions(value: Repeatmode): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPrevious_items(value: js.Array[PlaybackContextTrack]): Self = StObject.set(x, "previous_items", value.asInstanceOf[js.Any])
    
    inline def setPrevious_itemsVarargs(value: PlaybackContextTrack*): Self = StObject.set(x, "previous_items", js.Array(value*))
    
    inline def setRestrictions(value: PlaybackContextRestrictions): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
  }
}
