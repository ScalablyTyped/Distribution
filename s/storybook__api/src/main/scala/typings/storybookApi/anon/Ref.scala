package typings.storybookApi.anon

import typings.storybookApi.distTs3Dot9ModulesRefsMod.ComposedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ref extends StObject {
  
  var ref: ComposedRef
  
  var refId: String
  
  var source: String
  
  var sourceLocation: String
  
  var sourceType: String
  
  var `type`: String
}
object Ref {
  
  inline def apply(
    ref: ComposedRef,
    refId: String,
    source: String,
    sourceLocation: String,
    sourceType: String,
    `type`: String
  ): Ref = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], refId = refId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceLocation = sourceLocation.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ref]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ref] (val x: Self) extends AnyVal {
    
    inline def setRef(value: ComposedRef): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceLocation(value: String): Self = StObject.set(x, "sourceLocation", value.asInstanceOf[js.Any])
    
    inline def setSourceType(value: String): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
