package typings.remarkAbbr

import org.scalablytyped.runtime.Shortcut
import typings.unified.mod.Plugin
import typings.unist.mod.Data
import typings.unist.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("remark-abbr", JSImport.Namespace)
  @js.native
  val ^ : Abbr = js.native
  
  type Abbr = Plugin[js.Array[js.UndefOr[Options]], Node[Data], Node[Data]]
  
  trait Options extends StObject {
    
    var expandFirst: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setExpandFirst(value: Boolean): Self = StObject.set(x, "expandFirst", value.asInstanceOf[js.Any])
      
      inline def setExpandFirstUndefined: Self = StObject.set(x, "expandFirst", js.undefined)
    }
  }
  
  type _To = Abbr
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Abbr = ^
}
