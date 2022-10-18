package typings.relayRuntime.libUtilReaderNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReaderVariableArgument
  extends StObject
     with ReaderArgument {
  
  val kind: String
  
  // 'Variable';
  val name: String
  
  val `type`: js.UndefOr[String | Null] = js.undefined
  
  val variableName: String
}
object ReaderVariableArgument {
  
  inline def apply(kind: String, name: String, variableName: String): ReaderVariableArgument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderVariableArgument]
  }
  
  extension [Self <: ReaderVariableArgument](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVariableName(value: String): Self = StObject.set(x, "variableName", value.asInstanceOf[js.Any])
  }
}
