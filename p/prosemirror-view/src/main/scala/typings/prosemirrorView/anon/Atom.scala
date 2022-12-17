package typings.prosemirrorView.anon

import typings.prosemirrorView.mod.DOMNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Atom extends StObject {
  
  var atom: js.UndefOr[Double] = js.undefined
  
  var node: DOMNode
  
  var offset: Double
}
object Atom {
  
  inline def apply(node: DOMNode, offset: Double): Atom = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Atom]
  }
  
  extension [Self <: Atom](x: Self) {
    
    inline def setAtom(value: Double): Self = StObject.set(x, "atom", value.asInstanceOf[js.Any])
    
    inline def setAtomUndefined: Self = StObject.set(x, "atom", js.undefined)
    
    inline def setNode(value: DOMNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
