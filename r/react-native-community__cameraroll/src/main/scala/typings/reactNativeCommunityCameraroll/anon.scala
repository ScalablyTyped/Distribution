package typings.reactNativeCommunityCameraroll

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Altitude extends StObject {
    
    var altitude: js.UndefOr[Double] = js.native
    
    var heading: js.UndefOr[Double] = js.native
    
    var latitude: js.UndefOr[Double] = js.native
    
    var longitude: js.UndefOr[Double] = js.native
    
    var speed: js.UndefOr[Double] = js.native
  }
  object Altitude {
    
    @scala.inline
    def apply(): Altitude = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Altitude]
    }
    
    @scala.inline
    implicit class AltitudeMutableBuilder[Self <: Altitude] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
      
      @scala.inline
      def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
      
      @scala.inline
      def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
      
      @scala.inline
      def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    }
  }
  
  @js.native
  trait Endcursor extends StObject {
    
    var end_cursor: js.UndefOr[String] = js.native
    
    var has_next_page: Boolean = js.native
    
    var start_cursor: js.UndefOr[String] = js.native
  }
  object Endcursor {
    
    @scala.inline
    def apply(has_next_page: Boolean): Endcursor = {
      val __obj = js.Dynamic.literal(has_next_page = has_next_page.asInstanceOf[js.Any])
      __obj.asInstanceOf[Endcursor]
    }
    
    @scala.inline
    implicit class EndcursorMutableBuilder[Self <: Endcursor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd_cursor(value: String): Self = StObject.set(x, "end_cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnd_cursorUndefined: Self = StObject.set(x, "end_cursor", js.undefined)
      
      @scala.inline
      def setHas_next_page(value: Boolean): Self = StObject.set(x, "has_next_page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart_cursor(value: String): Self = StObject.set(x, "start_cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart_cursorUndefined: Self = StObject.set(x, "start_cursor", js.undefined)
    }
  }
  
  @js.native
  trait FileSize extends StObject {
    
    /** Only set if the `include` parameter contains `fileSize`. */
    var fileSize: Double | Null = js.native
    
    /** Only set if the `include` parameter contains `filename`. */
    var filename: String | Null = js.native
    
    /** Only set if the `include` parameter contains `imageSize`. */
    var height: Double = js.native
    
    /**
      * Only set if the `include` parameter contains `playableDuration`.
      * Will be null for images.
      */
    var playableDuration: Double | Null = js.native
    
    var uri: String = js.native
    
    /** Only set if the `include` parameter contains `imageSize`. */
    var width: Double = js.native
  }
  object FileSize {
    
    @scala.inline
    def apply(height: Double, uri: String, width: Double): FileSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileSize]
    }
    
    @scala.inline
    implicit class FileSizeMutableBuilder[Self <: FileSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSizeNull: Self = StObject.set(x, "fileSize", null)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameNull: Self = StObject.set(x, "filename", null)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayableDuration(value: Double): Self = StObject.set(x, "playableDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayableDurationNull: Self = StObject.set(x, "playableDuration", null)
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Groupname extends StObject {
    
    var group_name: String = js.native
    
    var image: FileSize = js.native
    
    /** Only set if the `include` parameter contains `location`. */
    var location: Altitude | Null = js.native
    
    /** Timestamp in seconds. */
    var timestamp: Double = js.native
    
    var `type`: String = js.native
  }
  object Groupname {
    
    @scala.inline
    def apply(group_name: String, image: FileSize, timestamp: Double, `type`: String): Groupname = {
      val __obj = js.Dynamic.literal(group_name = group_name.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Groupname]
    }
    
    @scala.inline
    implicit class GroupnameMutableBuilder[Self <: Groupname] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroup_name(value: String): Self = StObject.set(x, "group_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: FileSize): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: Altitude): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationNull: Self = StObject.set(x, "location", null)
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
