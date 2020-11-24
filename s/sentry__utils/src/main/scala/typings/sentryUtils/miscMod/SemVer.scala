package typings.sentryUtils.miscMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents Semantic Versioning object
  */
@js.native
trait SemVer extends js.Object {
  
  var buildmetadata: js.UndefOr[String] = js.native
  
  var major: js.UndefOr[Double] = js.native
  
  var minor: js.UndefOr[Double] = js.native
  
  var patch: js.UndefOr[Double] = js.native
  
  var prerelease: js.UndefOr[String] = js.native
}
object SemVer {
  
  @scala.inline
  def apply(): SemVer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemVer]
  }
  
  @scala.inline
  implicit class SemVerOps[Self <: SemVer] (val x: Self) extends AnyVal {
    
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
    def setBuildmetadata(value: String): Self = this.set("buildmetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildmetadata: Self = this.set("buildmetadata", js.undefined)
    
    @scala.inline
    def setMajor(value: Double): Self = this.set("major", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajor: Self = this.set("major", js.undefined)
    
    @scala.inline
    def setMinor(value: Double): Self = this.set("minor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinor: Self = this.set("minor", js.undefined)
    
    @scala.inline
    def setPatch(value: Double): Self = this.set("patch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatch: Self = this.set("patch", js.undefined)
    
    @scala.inline
    def setPrerelease(value: String): Self = this.set("prerelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrerelease: Self = this.set("prerelease", js.undefined)
  }
}
