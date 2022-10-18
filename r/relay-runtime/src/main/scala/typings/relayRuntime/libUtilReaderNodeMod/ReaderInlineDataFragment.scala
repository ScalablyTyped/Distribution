package typings.relayRuntime.libUtilReaderNodeMod

import typings.relayRuntime.libUtilRelayConcreteNodeMod.GeneratedNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReaderInlineDataFragment
  extends StObject
     with GeneratedNode {
  
  val kind: String
  
  // 'InlineDataFragment';
  val name: String
}
object ReaderInlineDataFragment {
  
  inline def apply(kind: String, name: String): ReaderInlineDataFragment = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderInlineDataFragment]
  }
  
  extension [Self <: ReaderInlineDataFragment](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
