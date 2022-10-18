package typings.relayRuntime.libUtilReaderNodeMod

import typings.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReaderClientEdge
  extends StObject
     with ReaderSelection {
  
  val backingField: ReaderRelayResolver | ReaderClientExtension
  
  val kind: String
  
  // 'ClientEdge';
  val linkedField: ReaderLinkedField
  
  val operation: ConcreteRequest
}
object ReaderClientEdge {
  
  inline def apply(
    backingField: ReaderRelayResolver | ReaderClientExtension,
    kind: String,
    linkedField: ReaderLinkedField,
    operation: ConcreteRequest
  ): ReaderClientEdge = {
    val __obj = js.Dynamic.literal(backingField = backingField.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], linkedField = linkedField.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderClientEdge]
  }
  
  extension [Self <: ReaderClientEdge](x: Self) {
    
    inline def setBackingField(value: ReaderRelayResolver | ReaderClientExtension): Self = StObject.set(x, "backingField", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLinkedField(value: ReaderLinkedField): Self = StObject.set(x, "linkedField", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: ConcreteRequest): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}
