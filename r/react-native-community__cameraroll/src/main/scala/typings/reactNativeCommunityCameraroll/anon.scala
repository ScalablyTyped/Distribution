package typings.reactNativeCommunityCameraroll

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Altitude extends StObject {
    
    var altitude: js.UndefOr[Double] = js.undefined
    
    var heading: js.UndefOr[Double] = js.undefined
    
    var latitude: js.UndefOr[Double] = js.undefined
    
    var longitude: js.UndefOr[Double] = js.undefined
    
    var speed: js.UndefOr[Double] = js.undefined
  }
  object Altitude {
    
    inline def apply(): Altitude = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Altitude]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Altitude] (val x: Self) extends AnyVal {
      
      inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
      
      inline def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
      
      inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
      
      inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    }
  }
  
  trait Endcursor extends StObject {
    
    var end_cursor: js.UndefOr[String] = js.undefined
    
    var has_next_page: Boolean
    
    var start_cursor: js.UndefOr[String] = js.undefined
  }
  object Endcursor {
    
    inline def apply(has_next_page: Boolean): Endcursor = {
      val __obj = js.Dynamic.literal(has_next_page = has_next_page.asInstanceOf[js.Any])
      __obj.asInstanceOf[Endcursor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Endcursor] (val x: Self) extends AnyVal {
      
      inline def setEnd_cursor(value: String): Self = StObject.set(x, "end_cursor", value.asInstanceOf[js.Any])
      
      inline def setEnd_cursorUndefined: Self = StObject.set(x, "end_cursor", js.undefined)
      
      inline def setHas_next_page(value: Boolean): Self = StObject.set(x, "has_next_page", value.asInstanceOf[js.Any])
      
      inline def setStart_cursor(value: String): Self = StObject.set(x, "start_cursor", value.asInstanceOf[js.Any])
      
      inline def setStart_cursorUndefined: Self = StObject.set(x, "start_cursor", js.undefined)
    }
  }
  
  trait FileSize extends StObject {
    
    /** Only set if the `include` parameter contains `fileSize`. */
    var fileSize: Double | Null
    
    /** Only set if the `include` parameter contains `filename`. */
    var filename: String | Null
    
    /** Only set if the `include` parameter contains `imageSize`. */
    var height: Double
    
    /**
      * Only set if the `include` parameter contains `playableDuration`.
      * Will be null for images.
      */
    var playableDuration: Double | Null
    
    var uri: String
    
    /** Only set if the `include` parameter contains `imageSize`. */
    var width: Double
  }
  object FileSize {
    
    inline def apply(height: Double, uri: String, width: Double): FileSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], fileSize = null, filename = null, playableDuration = null)
      __obj.asInstanceOf[FileSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileSize] (val x: Self) extends AnyVal {
      
      inline def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      inline def setFileSizeNull: Self = StObject.set(x, "fileSize", null)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameNull: Self = StObject.set(x, "filename", null)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setPlayableDuration(value: Double): Self = StObject.set(x, "playableDuration", value.asInstanceOf[js.Any])
      
      inline def setPlayableDurationNull: Self = StObject.set(x, "playableDuration", null)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Groupname extends StObject {
    
    var group_name: String
    
    var image: FileSize
    
    /** Only set if the `include` parameter contains `location`. */
    var location: Altitude | Null
    
    /** Timestamp in seconds. */
    var timestamp: Double
    
    var `type`: String
  }
  object Groupname {
    
    inline def apply(group_name: String, image: FileSize, timestamp: Double, `type`: String): Groupname = {
      val __obj = js.Dynamic.literal(group_name = group_name.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], location = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Groupname]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Groupname] (val x: Self) extends AnyVal {
      
      inline def setGroup_name(value: String): Self = StObject.set(x, "group_name", value.asInstanceOf[js.Any])
      
      inline def setImage(value: FileSize): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Altitude): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationNull: Self = StObject.set(x, "location", null)
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
