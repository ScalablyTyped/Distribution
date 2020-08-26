package typings.reactNativeCommunityCli.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DependencyParamsAndroid extends js.Object {
  var manifestPath: js.UndefOr[String] = js.native
  var packageImportPath: js.UndefOr[String] = js.native
  var packageInstance: js.UndefOr[String] = js.native
  var sourceDir: js.UndefOr[String] = js.native
}

object DependencyParamsAndroid {
  @scala.inline
  def apply(): DependencyParamsAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DependencyParamsAndroid]
  }
  @scala.inline
  implicit class DependencyParamsAndroidOps[Self <: DependencyParamsAndroid] (val x: Self) extends AnyVal {
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
    def setManifestPath(value: String): Self = this.set("manifestPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManifestPath: Self = this.set("manifestPath", js.undefined)
    @scala.inline
    def setPackageImportPath(value: String): Self = this.set("packageImportPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageImportPath: Self = this.set("packageImportPath", js.undefined)
    @scala.inline
    def setPackageInstance(value: String): Self = this.set("packageInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageInstance: Self = this.set("packageInstance", js.undefined)
    @scala.inline
    def setSourceDir(value: String): Self = this.set("sourceDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceDir: Self = this.set("sourceDir", js.undefined)
  }
  
}

