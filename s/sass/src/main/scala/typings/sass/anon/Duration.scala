package typings.sass.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  /**
    * The number of milliseconds it took to compile the Sass file. This is
    * always equal to `start` minus `end`.
    */
  var duration: Double
  
  /**
    * The number of milliseconds between 1 January 1970 at 00:00:00 UTC and the
    * time at which Sass compilation ended.
    */
  var end: Double
  
  /**
    * The absolute path of [[LegacyFileOptions.file]] or
    * [[LegacyStringOptions.file]], or `"data"` if [[LegacyStringOptions.file]]
    * wasn't set.
    */
  var entry: String
  
  /**
    * An array of the absolute paths of all Sass files loaded during
    * compilation. If a stylesheet was loaded from a [[LegacyImporter]] that
    * returned the stylesheet’s contents, the raw string of the `@use` or
    * `@import` that loaded that stylesheet included in this array.
    */
  var includedFiles: js.Array[String]
  
  /**
    * The number of milliseconds between 1 January 1970 at 00:00:00 UTC and the
    * time at which Sass compilation began.
    */
  var start: Double
}
object Duration {
  
  inline def apply(duration: Double, end: Double, entry: String, includedFiles: js.Array[String], start: Double): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], entry = entry.asInstanceOf[js.Any], includedFiles = includedFiles.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  
  extension [Self <: Duration](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEntry(value: String): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setIncludedFiles(value: js.Array[String]): Self = StObject.set(x, "includedFiles", value.asInstanceOf[js.Any])
    
    inline def setIncludedFilesVarargs(value: String*): Self = StObject.set(x, "includedFiles", js.Array(value*))
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
