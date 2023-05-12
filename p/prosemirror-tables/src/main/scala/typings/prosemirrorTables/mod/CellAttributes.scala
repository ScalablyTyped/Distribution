package typings.prosemirrorTables.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
trait CellAttributes extends StObject {
  
  /**
    * The attribute's default value.
    */
  var default: Any
  
  /**
    * A function to read the attribute's value from a DOM node.
    */
  var getFromDOM: js.UndefOr[typings.prosemirrorTables.mod.getFromDOM] = js.undefined
  
  /**
    * A function to add the attribute's value to an attribute
    * object that's used to render the cell's DOM.
    */
  var setDOMAttr: js.UndefOr[typings.prosemirrorTables.mod.setDOMAttr] = js.undefined
}
object CellAttributes {
  
  inline def apply(default: Any): CellAttributes = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellAttributes] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setGetFromDOM(value: /* dom */ HTMLElement => Any): Self = StObject.set(x, "getFromDOM", js.Any.fromFunction1(value))
    
    inline def setGetFromDOMUndefined: Self = StObject.set(x, "getFromDOM", js.undefined)
    
    inline def setSetDOMAttr(value: (/* value */ Any, /* attrs */ MutableAttrs) => Unit): Self = StObject.set(x, "setDOMAttr", js.Any.fromFunction2(value))
    
    inline def setSetDOMAttrUndefined: Self = StObject.set(x, "setDOMAttr", js.undefined)
  }
}
