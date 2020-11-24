package typings.pulumiPulumi.providerProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiffResult extends js.Object {
  
  /**
    * If true, this diff detected changes and suggests an update.
    */
  val changes: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, and a replacement occurs, the resource will first be deleted before being recreated.  This is to
    * avoid potential side-by-side issues with the default create before delete behavior.
    */
  val deleteBeforeReplace: js.UndefOr[Boolean] = js.native
  
  /**
    * If this update requires a replacement, the set of properties triggering it.
    */
  val replaces: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An optional list of properties that will not ever change.
    */
  val stables: js.UndefOr[js.Array[String]] = js.native
}
object DiffResult {
  
  @scala.inline
  def apply(): DiffResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiffResult]
  }
  
  @scala.inline
  implicit class DiffResultOps[Self <: DiffResult] (val x: Self) extends AnyVal {
    
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
    def setChanges(value: Boolean): Self = this.set("changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChanges: Self = this.set("changes", js.undefined)
    
    @scala.inline
    def setDeleteBeforeReplace(value: Boolean): Self = this.set("deleteBeforeReplace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteBeforeReplace: Self = this.set("deleteBeforeReplace", js.undefined)
    
    @scala.inline
    def setReplacesVarargs(value: String*): Self = this.set("replaces", js.Array(value :_*))
    
    @scala.inline
    def setReplaces(value: js.Array[String]): Self = this.set("replaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaces: Self = this.set("replaces", js.undefined)
    
    @scala.inline
    def setStablesVarargs(value: String*): Self = this.set("stables", js.Array(value :_*))
    
    @scala.inline
    def setStables(value: js.Array[String]): Self = this.set("stables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStables: Self = this.set("stables", js.undefined)
  }
}
