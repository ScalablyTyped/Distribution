package typings.reactNativeCommunityCliTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceDir extends StObject {
  
  var sourceDir: String
}
object SourceDir {
  
  inline def apply(sourceDir: String): SourceDir = {
    val __obj = js.Dynamic.literal(sourceDir = sourceDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceDir]
  }
  
  extension [Self <: SourceDir](x: Self) {
    
    inline def setSourceDir(value: String): Self = StObject.set(x, "sourceDir", value.asInstanceOf[js.Any])
  }
}
