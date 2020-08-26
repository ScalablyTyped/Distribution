package typings.reactNativeCommunityCli.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DependencyConfigAndroid extends js.Object {
  var folder: String = js.native
  var packageImportPath: String = js.native
  var packageInstance: String = js.native
  var sourceDir: String = js.native
}

object DependencyConfigAndroid {
  @scala.inline
  def apply(folder: String, packageImportPath: String, packageInstance: String, sourceDir: String): DependencyConfigAndroid = {
    val __obj = js.Dynamic.literal(folder = folder.asInstanceOf[js.Any], packageImportPath = packageImportPath.asInstanceOf[js.Any], packageInstance = packageInstance.asInstanceOf[js.Any], sourceDir = sourceDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyConfigAndroid]
  }
  @scala.inline
  implicit class DependencyConfigAndroidOps[Self <: DependencyConfigAndroid] (val x: Self) extends AnyVal {
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
    def setPackageImportPath(value: String): Self = this.set("packageImportPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setPackageInstance(value: String): Self = this.set("packageInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceDir(value: String): Self = this.set("sourceDir", value.asInstanceOf[js.Any])
  }
  
}

