package typings.prosemirrorView.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Offset extends StObject {
  
  var node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Node */ Any
  
  var offset: Double
}
object Offset {
  
  inline def apply(
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Node */ Any,
    offset: Double
  ): Offset = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Offset] (val x: Self) extends AnyVal {
    
    inline def setNode(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Node */ Any
    ): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
