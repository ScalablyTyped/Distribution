package typings.reactNativeCommunityCliTypes.iosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOSProjectConfig extends js.Object {
  
  var folder: String = js.native
  
  var libraryFolder: String = js.native
  
  var pbxprojPath: String = js.native
  
  var plist: js.Array[_] = js.native
  
  var podfile: String = js.native
  
  var podspecPath: String = js.native
  
  var projectName: String = js.native
  
  var projectPath: String = js.native
  
  var sharedLibraries: js.Array[_] = js.native
  
  var sourceDir: String = js.native
}
object IOSProjectConfig {
  
  @scala.inline
  def apply(
    folder: String,
    libraryFolder: String,
    pbxprojPath: String,
    plist: js.Array[_],
    podfile: String,
    podspecPath: String,
    projectName: String,
    projectPath: String,
    sharedLibraries: js.Array[_],
    sourceDir: String
  ): IOSProjectConfig = {
    val __obj = js.Dynamic.literal(folder = folder.asInstanceOf[js.Any], libraryFolder = libraryFolder.asInstanceOf[js.Any], pbxprojPath = pbxprojPath.asInstanceOf[js.Any], plist = plist.asInstanceOf[js.Any], podfile = podfile.asInstanceOf[js.Any], podspecPath = podspecPath.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], projectPath = projectPath.asInstanceOf[js.Any], sharedLibraries = sharedLibraries.asInstanceOf[js.Any], sourceDir = sourceDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOSProjectConfig]
  }
  
  @scala.inline
  implicit class IOSProjectConfigOps[Self <: IOSProjectConfig] (val x: Self) extends AnyVal {
    
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
    def setFolder(value: String): Self = this.set("folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLibraryFolder(value: String): Self = this.set("libraryFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPbxprojPath(value: String): Self = this.set("pbxprojPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlistVarargs(value: js.Any*): Self = this.set("plist", js.Array(value :_*))
    
    @scala.inline
    def setPlist(value: js.Array[_]): Self = this.set("plist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPodfile(value: String): Self = this.set("podfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPodspecPath(value: String): Self = this.set("podspecPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectName(value: String): Self = this.set("projectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectPath(value: String): Self = this.set("projectPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedLibrariesVarargs(value: js.Any*): Self = this.set("sharedLibraries", js.Array(value :_*))
    
    @scala.inline
    def setSharedLibraries(value: js.Array[_]): Self = this.set("sharedLibraries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDir(value: String): Self = this.set("sourceDir", value.asInstanceOf[js.Any])
  }
}
