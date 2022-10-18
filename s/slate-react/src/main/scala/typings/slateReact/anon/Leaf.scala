package typings.slateReact.anon

import typings.slate.distInterfacesElementMod.Element
import typings.slate.distInterfacesTextMod.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Leaf extends StObject {
  
  var isLast: Boolean
  
  var leaf: Text
  
  var parent: Element
  
  var text: Text
}
object Leaf {
  
  inline def apply(isLast: Boolean, leaf: Text, parent: Element, text: Text): Leaf = {
    val __obj = js.Dynamic.literal(isLast = isLast.asInstanceOf[js.Any], leaf = leaf.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Leaf]
  }
  
  extension [Self <: Leaf](x: Self) {
    
    inline def setIsLast(value: Boolean): Self = StObject.set(x, "isLast", value.asInstanceOf[js.Any])
    
    inline def setLeaf(value: Text): Self = StObject.set(x, "leaf", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Element): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setText(value: Text): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
