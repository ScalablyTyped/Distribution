package typings.qbittorrentApiV2.mod

import typings.qbittorrentApiV2.qbittorrentApiV2Ints.`0`
import typings.qbittorrentApiV2.qbittorrentApiV2Ints.`1`
import typings.qbittorrentApiV2.qbittorrentApiV2Ints.`6`
import typings.qbittorrentApiV2.qbittorrentApiV2Ints.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  var availability: Double
  
  var is_seed: Boolean
  
  var name: String
  
  var piece_range: Double
  
  var priority: `0` | `1` | `6` | `7`
  
  var progress: Double
  
  var size: Double
}
object Content {
  
  inline def apply(
    availability: Double,
    is_seed: Boolean,
    name: String,
    piece_range: Double,
    priority: `0` | `1` | `6` | `7`,
    progress: Double,
    size: Double
  ): Content = {
    val __obj = js.Dynamic.literal(availability = availability.asInstanceOf[js.Any], is_seed = is_seed.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], piece_range = piece_range.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
    
    inline def setAvailability(value: Double): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    inline def setIs_seed(value: Boolean): Self = StObject.set(x, "is_seed", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPiece_range(value: Double): Self = StObject.set(x, "piece_range", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: `0` | `1` | `6` | `7`): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
