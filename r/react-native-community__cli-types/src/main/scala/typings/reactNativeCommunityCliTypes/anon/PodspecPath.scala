package typings.reactNativeCommunityCliTypes.anon

import typings.reactNativeCommunityCliTypes.iosMod.IOSScriptPhase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PodspecPath extends StObject {
  
  /**
    * @deprecated A podspec should always be at the root of a package and
    *             have the name of the package. This property will be
    *             removed in a future major version.
    *
    * @todo Log a warning when this is used.
    */
  var podspecPath: String = js.native
  
  var scriptPhases: js.UndefOr[js.Array[IOSScriptPhase]] = js.native
}
object PodspecPath {
  
  @scala.inline
  def apply(podspecPath: String): PodspecPath = {
    val __obj = js.Dynamic.literal(podspecPath = podspecPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodspecPath]
  }
  
  @scala.inline
  implicit class PodspecPathMutableBuilder[Self <: PodspecPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPodspecPath(value: String): Self = StObject.set(x, "podspecPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptPhases(value: js.Array[IOSScriptPhase]): Self = StObject.set(x, "scriptPhases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptPhasesUndefined: Self = StObject.set(x, "scriptPhases", js.undefined)
    
    @scala.inline
    def setScriptPhasesVarargs(value: IOSScriptPhase*): Self = StObject.set(x, "scriptPhases", js.Array(value :_*))
  }
}
