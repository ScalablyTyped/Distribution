package typings.prettyFormat

import org.scalablytyped.runtime.Shortcut
import typings.prettyFormat.typesMod.Config
import typings.prettyFormat.typesMod.NewPlugin
import typings.prettyFormat.typesMod.Printer
import typings.prettyFormat.typesMod.Refs
import typings.prettyFormat.typesMod.Test
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactTestComponentMod extends Shortcut {
  
  @JSImport("pretty-format/build/plugins/ReactTestComponent", JSImport.Default)
  @js.native
  val default: NewPlugin = js.native
  
  @JSImport("pretty-format/build/plugins/ReactTestComponent", "serialize")
  @js.native
  val serialize: js.Function6[
    /* val */ js.Any, 
    /* config */ Config, 
    /* indentation */ String, 
    /* depth */ Double, 
    /* refs */ Refs, 
    /* printer */ Printer, 
    String
  ] = js.native
  
  @JSImport("pretty-format/build/plugins/ReactTestComponent", "test")
  @js.native
  val test: Test = js.native
  
  type ReactTestChild = ReactTestObject | String | Double
  
  trait ReactTestObject extends StObject {
    
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol
    
    var children: js.UndefOr[Null | js.Array[ReactTestChild]] = js.undefined
    
    var props: js.UndefOr[Record[String, js.Any]] = js.undefined
    
    var `type`: String
  }
  object ReactTestObject {
    
    inline def apply(DollarDollartypeof: js.Symbol, `type`: String): ReactTestObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactTestObject]
    }
    
    extension [Self <: ReactTestObject](x: Self) {
      
      inline def setChildren(value: js.Array[ReactTestChild]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactTestChild*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setDollarDollartypeof(value: js.Symbol): Self = StObject.set(x, "$$typeof", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Record[String, js.Any]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = NewPlugin
  
  /* This means you don't have to write `default`, but can instead just say `reactTestComponentMod.foo` */
  override def _to: NewPlugin = default
}
