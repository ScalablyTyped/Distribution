package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.missing_fieldDotlog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  kind :'missing_field.log',   owner :string,   fieldPath :string}> */
@js.native
trait Readonlykindmissingfieldl extends StObject {
  
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
  implicit class ReadonlykindmissingfieldlMutableBuilder[Self <: Readonlykindmissingfieldl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldPath(value: String): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: missing_fieldDotlog): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
  }
}
