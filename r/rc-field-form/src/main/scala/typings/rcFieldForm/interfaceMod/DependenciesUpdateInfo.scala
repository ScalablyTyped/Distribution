package typings.rcFieldForm.interfaceMod

import typings.rcFieldForm.rcFieldFormStrings.dependenciesUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DependenciesUpdateInfo extends NotifyInfo {
  
  /**
    * Contains all the related `InternalNamePath[]`.
    * a <- b <- c : change `a`
    * relatedFields=[a, b, c]
    */
  var relatedFields: js.Array[InternalNamePath] = js.native
  
  var `type`: dependenciesUpdate = js.native
}
object DependenciesUpdateInfo {
  
  @scala.inline
  def apply(relatedFields: js.Array[InternalNamePath], `type`: dependenciesUpdate): DependenciesUpdateInfo = {
    val __obj = js.Dynamic.literal(relatedFields = relatedFields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependenciesUpdateInfo]
  }
  
  @scala.inline
  implicit class DependenciesUpdateInfoOps[Self <: DependenciesUpdateInfo] (val x: Self) extends AnyVal {
    
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
    def setRelatedFieldsVarargs(value: InternalNamePath*): Self = this.set("relatedFields", js.Array(value :_*))
    
    @scala.inline
    def setRelatedFields(value: js.Array[InternalNamePath]): Self = this.set("relatedFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: dependenciesUpdate): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
