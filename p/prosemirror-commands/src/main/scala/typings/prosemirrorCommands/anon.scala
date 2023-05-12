package typings.prosemirrorCommands

import typings.prosemirrorModel.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attrs extends StObject {
    
    var attrs: js.UndefOr[typings.prosemirrorModel.mod.Attrs] = js.undefined
    
    var `type`: NodeType
  }
  object Attrs {
    
    inline def apply(`type`: NodeType): Attrs = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attrs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Attrs] (val x: Self) extends AnyVal {
      
      inline def setAttrs(value: typings.prosemirrorModel.mod.Attrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setType(value: NodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
