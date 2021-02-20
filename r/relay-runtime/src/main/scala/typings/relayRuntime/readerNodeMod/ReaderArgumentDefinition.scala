package typings.relayRuntime.readerNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.readerNodeMod.ReaderLocalArgument
  - typings.relayRuntime.readerNodeMod.ReaderRootArgument
*/
trait ReaderArgumentDefinition extends StObject
object ReaderArgumentDefinition {
  
  @scala.inline
  def ReaderLocalArgument(defaultValue: js.Any, kind: String, name: String): typings.relayRuntime.readerNodeMod.ReaderLocalArgument = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderLocalArgument]
  }
  
  @scala.inline
  def ReaderRootArgument(kind: String, name: String): typings.relayRuntime.readerNodeMod.ReaderRootArgument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderRootArgument]
  }
}
