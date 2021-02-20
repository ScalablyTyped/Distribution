package typings.reactNativeCommunityCliTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceDir extends StObject {
  
  var sourceDir: String = js.native
}
object SourceDir {
  
  @scala.inline
  def apply(sourceDir: String): SourceDir = {
    val __obj = js.Dynamic.literal(sourceDir = sourceDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceDir]
  }
  
  @scala.inline
  implicit class SourceDirMutableBuilder[Self <: SourceDir] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceDir(value: String): Self = StObject.set(x, "sourceDir", value.asInstanceOf[js.Any])
  }
}
