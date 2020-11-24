package typings.reactNativeCommunityCliTypes.anon

import typings.reactNativeCommunityCliTypes.iosMod.IOSScriptPhase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PodspecPath extends js.Object {
  
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
  implicit class PodspecPathOps[Self <: PodspecPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPodspecPath(value: String): Self = this.set("podspecPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptPhasesVarargs(value: IOSScriptPhase*): Self = this.set("scriptPhases", js.Array(value :_*))
    
    @scala.inline
    def setScriptPhases(value: js.Array[IOSScriptPhase]): Self = this.set("scriptPhases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScriptPhases: Self = this.set("scriptPhases", js.undefined)
  }
}
