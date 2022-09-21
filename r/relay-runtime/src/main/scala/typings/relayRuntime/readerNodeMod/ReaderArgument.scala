package typings.relayRuntime.readerNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.readerNodeMod.ReaderListValueArgument
  - typings.relayRuntime.readerNodeMod.ReaderLiteralArgument
  - typings.relayRuntime.readerNodeMod.ReaderObjectValueArgument
  - typings.relayRuntime.readerNodeMod.ReaderVariableArgument
*/
trait ReaderArgument extends StObject
object ReaderArgument {
  
  inline def ReaderListValueArgument(items: js.Array[ReaderArgument | Null], kind: String, name: String): typings.relayRuntime.readerNodeMod.ReaderListValueArgument = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderListValueArgument]
  }
  
  inline def ReaderLiteralArgument(kind: String, name: String, value: Any): typings.relayRuntime.readerNodeMod.ReaderLiteralArgument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderLiteralArgument]
  }
  
  inline def ReaderObjectValueArgument(fields: js.Array[ReaderArgument], kind: String, name: String): typings.relayRuntime.readerNodeMod.ReaderObjectValueArgument = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderObjectValueArgument]
  }
  
  inline def ReaderVariableArgument(kind: String, name: String, variableName: String): typings.relayRuntime.readerNodeMod.ReaderVariableArgument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderVariableArgument]
  }
}
