package typings.reactNativeCommunityCliTypes.anon

import typings.reactNativeCommunityCliTypes.iosMod.IOSScriptPhase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PodspecPath extends StObject {
  
  /**
    * @deprecated A podspec should always be at the root of a package and
    *             have the name of the package. This property will be
    *             removed in a future major version.
    *
    * @todo Log a warning when this is used.
    */
  var podspecPath: String
  
  var scriptPhases: js.UndefOr[js.Array[IOSScriptPhase]] = js.undefined
}
object PodspecPath {
  
  inline def apply(podspecPath: String): PodspecPath = {
    val __obj = js.Dynamic.literal(podspecPath = podspecPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodspecPath]
  }
  
  extension [Self <: PodspecPath](x: Self) {
    
    inline def setPodspecPath(value: String): Self = StObject.set(x, "podspecPath", value.asInstanceOf[js.Any])
    
    inline def setScriptPhases(value: js.Array[IOSScriptPhase]): Self = StObject.set(x, "scriptPhases", value.asInstanceOf[js.Any])
    
    inline def setScriptPhasesUndefined: Self = StObject.set(x, "scriptPhases", js.undefined)
    
    inline def setScriptPhasesVarargs(value: IOSScriptPhase*): Self = StObject.set(x, "scriptPhases", js.Array(value :_*))
  }
}
