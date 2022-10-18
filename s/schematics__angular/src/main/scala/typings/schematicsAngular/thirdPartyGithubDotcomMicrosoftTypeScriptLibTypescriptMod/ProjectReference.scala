package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectReference extends StObject {
  
  /** True if it is intended that this reference form a circularity */
  var circular: js.UndefOr[Boolean] = js.undefined
  
  /** The path as the user originally wrote it */
  var originalPath: js.UndefOr[java.lang.String] = js.undefined
  
  /** A normalized path on disk */
  var path: java.lang.String
  
  /** True if the output of this reference should be prepended to the output of this project. Only valid for --outFile compilations */
  var prepend: js.UndefOr[Boolean] = js.undefined
}
object ProjectReference {
  
  inline def apply(path: java.lang.String): ProjectReference = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectReference]
  }
  
  extension [Self <: ProjectReference](x: Self) {
    
    inline def setCircular(value: Boolean): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
    
    inline def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
    
    inline def setOriginalPath(value: java.lang.String): Self = StObject.set(x, "originalPath", value.asInstanceOf[js.Any])
    
    inline def setOriginalPathUndefined: Self = StObject.set(x, "originalPath", js.undefined)
    
    inline def setPath(value: java.lang.String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPrepend(value: Boolean): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
    
    inline def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
  }
}
