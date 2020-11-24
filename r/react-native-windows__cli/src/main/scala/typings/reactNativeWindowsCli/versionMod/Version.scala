package typings.reactNativeWindowsCli.versionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Version extends js.Object {
  
  var build: js.Any = js.native
  
  def eq(other: Version): Boolean = js.native
  
  def gt(other: Version): Boolean = js.native
  
  def gte(other: Version): Boolean = js.native
  
  var major: js.Any = js.native
  
  var minor: js.Any = js.native
  
  var qfe: js.Any = js.native
}
object Version {
  
  @scala.inline
  def apply(
    build: js.Any,
    eq: Version => Boolean,
    gt: Version => Boolean,
    gte: Version => Boolean,
    major: js.Any,
    minor: js.Any,
    qfe: js.Any
  ): Version = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], eq = js.Any.fromFunction1(eq), gt = js.Any.fromFunction1(gt), gte = js.Any.fromFunction1(gte), major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], qfe = qfe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Version]
  }
  
  @scala.inline
  implicit class VersionOps[Self <: Version] (val x: Self) extends AnyVal {
    
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
    def setBuild(value: js.Any): Self = this.set("build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEq(value: Version => Boolean): Self = this.set("eq", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGt(value: Version => Boolean): Self = this.set("gt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGte(value: Version => Boolean): Self = this.set("gte", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMajor(value: js.Any): Self = this.set("major", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinor(value: js.Any): Self = this.set("minor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQfe(value: js.Any): Self = this.set("qfe", value.asInstanceOf[js.Any])
  }
}
