package typings.snyk.distLibSnykTestLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchRemediation extends StObject {
  
  var paths: js.Array[PatchObject]
}
object PatchRemediation {
  
  inline def apply(paths: js.Array[PatchObject]): PatchRemediation = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchRemediation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PatchRemediation] (val x: Self) extends AnyVal {
    
    inline def setPaths(value: js.Array[PatchObject]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsVarargs(value: PatchObject*): Self = StObject.set(x, "paths", js.Array(value*))
  }
}
