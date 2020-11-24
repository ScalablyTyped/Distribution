package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.missing_fieldDotlog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  kind :'missing_field.log',   owner :string,   fieldPath :string}> */
@js.native
trait Readonlykindmissingfieldl extends js.Object {
  
  val fieldPath: String = js.native
  
  val kind: missing_fieldDotlog = js.native
  
  val owner: String = js.native
}
object Readonlykindmissingfieldl {
  
  @scala.inline
  def apply(fieldPath: String, kind: missing_fieldDotlog, owner: String): Readonlykindmissingfieldl = {
    val __obj = js.Dynamic.literal(fieldPath = fieldPath.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlykindmissingfieldl]
  }
  
  @scala.inline
  implicit class ReadonlykindmissingfieldlOps[Self <: Readonlykindmissingfieldl] (val x: Self) extends AnyVal {
    
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
    def setFieldPath(value: String): Self = this.set("fieldPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: missing_fieldDotlog): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
  }
}
