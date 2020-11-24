package typings.reactNativeCommunityCliTypes.iosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOSProjectParams extends js.Object {
  
  var libraryFolder: js.UndefOr[String] = js.native
  
  var plist: js.Array[_] = js.native
  
  /**
    * @deprecated A podspec should always be at the root of a package and
    *             have the name of the package. This property will be
    *             removed in a future major version.
    *
    * @todo Log a warning when this is used.
    */
  var podspecPath: js.UndefOr[String] = js.native
  
  var project: js.UndefOr[String] = js.native
  
  var scriptPhases: js.UndefOr[js.Array[_]] = js.native
  
  var sharedLibraries: js.UndefOr[js.Array[String]] = js.native
}
object IOSProjectParams {
  
  @scala.inline
  def apply(plist: js.Array[_]): IOSProjectParams = {
    val __obj = js.Dynamic.literal(plist = plist.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOSProjectParams]
  }
  
  @scala.inline
  implicit class IOSProjectParamsOps[Self <: IOSProjectParams] (val x: Self) extends AnyVal {
    
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
    def setPlistVarargs(value: js.Any*): Self = this.set("plist", js.Array(value :_*))
    
    @scala.inline
    def setPlist(value: js.Array[_]): Self = this.set("plist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLibraryFolder(value: String): Self = this.set("libraryFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLibraryFolder: Self = this.set("libraryFolder", js.undefined)
    
    @scala.inline
    def setPodspecPath(value: String): Self = this.set("podspecPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePodspecPath: Self = this.set("podspecPath", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
    
    @scala.inline
    def setScriptPhasesVarargs(value: js.Any*): Self = this.set("scriptPhases", js.Array(value :_*))
    
    @scala.inline
    def setScriptPhases(value: js.Array[_]): Self = this.set("scriptPhases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScriptPhases: Self = this.set("scriptPhases", js.undefined)
    
    @scala.inline
    def setSharedLibrariesVarargs(value: String*): Self = this.set("sharedLibraries", js.Array(value :_*))
    
    @scala.inline
    def setSharedLibraries(value: js.Array[String]): Self = this.set("sharedLibraries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedLibraries: Self = this.set("sharedLibraries", js.undefined)
  }
}
