package typings.relayRuntime.readerNodeMod

import typings.relayRuntime.relayConcreteNodeMod.GeneratedNode
import typings.relayRuntime.relayRuntimeStrings.InlineDataFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReaderInlineDataFragment
  extends StObject
     with GeneratedNode {
  
  val kind: InlineDataFragment
  
  val name: String
}
object ReaderInlineDataFragment {
  
  @scala.inline
  def apply(name: String): ReaderInlineDataFragment = {
    val __obj = js.Dynamic.literal(kind = "InlineDataFragment", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderInlineDataFragment]
  }
  
  @scala.inline
  implicit class ReaderInlineDataFragmentMutableBuilder[Self <: ReaderInlineDataFragment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: InlineDataFragment): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
