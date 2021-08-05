package typings.relayRuntime.readerNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.readerNodeMod.ReaderLiteral
  - typings.relayRuntime.readerNodeMod.ReaderVariable
  - typings.relayRuntime.readerNodeMod.ReaderObjectValue
  - typings.relayRuntime.readerNodeMod.ReaderListValue
*/
trait ReaderArgument extends StObject
object ReaderArgument {
  
  inline def ReaderListValue(items: js.Array[ReaderArgument | Null], kind: String, name: String): typings.relayRuntime.readerNodeMod.ReaderListValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderListValue]
  }
  
  inline def ReaderLiteral(kind: String, name: String, value: js.Any): typings.relayRuntime.readerNodeMod.ReaderLiteral = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderLiteral]
  }
  
  inline def ReaderObjectValue(fields: js.Array[ReaderArgument], kind: String, name: String): typings.relayRuntime.readerNodeMod.ReaderObjectValue = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderObjectValue]
  }
  
  inline def ReaderVariable(kind: String, name: String, variableName: String): typings.relayRuntime.readerNodeMod.ReaderVariable = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderVariable]
  }
}
