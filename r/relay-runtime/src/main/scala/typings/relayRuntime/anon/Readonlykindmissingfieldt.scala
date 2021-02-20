package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.missing_fieldDotthrow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  kind :'missing_field.throw',   owner :string,   fieldPath :string}> */
@js.native
trait Readonlykindmissingfieldt extends StObject {
  
  val fieldPath: String = js.native
  
  val kind: missing_fieldDotthrow = js.native
  
  val owner: String = js.native
}
object Readonlykindmissingfieldt {
  
  @scala.inline
  def apply(fieldPath: String, kind: missing_fieldDotthrow, owner: String): Readonlykindmissingfieldt = {
    val __obj = js.Dynamic.literal(fieldPath = fieldPath.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlykindmissingfieldt]
  }
  
  @scala.inline
  implicit class ReadonlykindmissingfieldtMutableBuilder[Self <: Readonlykindmissingfieldt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldPath(value: String): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: missing_fieldDotthrow): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
  }
}
