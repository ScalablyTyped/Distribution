package typings.standardVersion.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scripts extends js.Object {
  
  /**
    * Executed after the version is bumped.
    */
  var postbump: js.UndefOr[String] = js.native
  
  /**
    * Executes after the CHANGELOG is generated.
    */
  var postchangelog: js.UndefOr[String] = js.native
  
  /**
    * Called after the commit step.
    */
  var postcommit: js.UndefOr[String] = js.native
  
  /**
    * Called after the tagging step.
    */
  var posttag: js.UndefOr[String] = js.native
  
  /**
    * Executed before the version is bumped. If the `prebump` script returns a
    * version #, it will be used rather than the version calculated by
    * `standard-version`.
    */
  var prebump: js.UndefOr[String] = js.native
  
  /**
    * Executes before the CHANGELOG is generated.
    */
  var prechangelog: js.UndefOr[String] = js.native
  
  /**
    * Called before the commit step.
    */
  var precommit: js.UndefOr[String] = js.native
  
  /**
    * Executed before anything happens. If the `prerelease` script returns a
    * non-zero exit code, versioning will be aborted, but it has no other effect on
    * the process.
    */
  var prerelease: js.UndefOr[String] = js.native
  
  /**
    * Called before the tagging step.
    */
  var pretag: js.UndefOr[String] = js.native
}
object Scripts {
  
  @scala.inline
  def apply(): Scripts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scripts]
  }
  
  @scala.inline
  implicit class ScriptsOps[Self <: Scripts] (val x: Self) extends AnyVal {
    
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
    def setPostbump(value: String): Self = this.set("postbump", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostbump: Self = this.set("postbump", js.undefined)
    
    @scala.inline
    def setPostchangelog(value: String): Self = this.set("postchangelog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostchangelog: Self = this.set("postchangelog", js.undefined)
    
    @scala.inline
    def setPostcommit(value: String): Self = this.set("postcommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostcommit: Self = this.set("postcommit", js.undefined)
    
    @scala.inline
    def setPosttag(value: String): Self = this.set("posttag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosttag: Self = this.set("posttag", js.undefined)
    
    @scala.inline
    def setPrebump(value: String): Self = this.set("prebump", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrebump: Self = this.set("prebump", js.undefined)
    
    @scala.inline
    def setPrechangelog(value: String): Self = this.set("prechangelog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrechangelog: Self = this.set("prechangelog", js.undefined)
    
    @scala.inline
    def setPrecommit(value: String): Self = this.set("precommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecommit: Self = this.set("precommit", js.undefined)
    
    @scala.inline
    def setPrerelease(value: String): Self = this.set("prerelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrerelease: Self = this.set("prerelease", js.undefined)
    
    @scala.inline
    def setPretag(value: String): Self = this.set("pretag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePretag: Self = this.set("pretag", js.undefined)
  }
}
