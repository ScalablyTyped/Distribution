package typings.relayRuntime.libUtilReaderNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.libUtilReaderNodeMod.ReaderListValueArgument
  - typings.relayRuntime.libUtilReaderNodeMod.ReaderLiteralArgument
  - typings.relayRuntime.libUtilReaderNodeMod.ReaderObjectValueArgument
  - typings.relayRuntime.libUtilReaderNodeMod.ReaderVariableArgument
*/
trait ReaderArgument extends StObject
object ReaderArgument {
  
  inline def ReaderListValueArgument(items: js.Array[ReaderArgument | Null], kind: String, name: String): typings.relayRuntime.libUtilReaderNodeMod.ReaderListValueArgument = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilReaderNodeMod.ReaderListValueArgument]
  }
  
  inline def ReaderLiteralArgument(kind: String, name: String, value: Any): typings.relayRuntime.libUtilReaderNodeMod.ReaderLiteralArgument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilReaderNodeMod.ReaderLiteralArgument]
  }
  
  inline def ReaderObjectValueArgument(fields: js.Array[ReaderArgument], kind: String, name: String): typings.relayRuntime.libUtilReaderNodeMod.ReaderObjectValueArgument = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilReaderNodeMod.ReaderObjectValueArgument]
  }
  
  inline def ReaderVariableArgument(kind: String, name: String, variableName: String): typings.relayRuntime.libUtilReaderNodeMod.ReaderVariableArgument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libUtilReaderNodeMod.ReaderVariableArgument]
  }
}
