package typings.remarkAbbr

import org.scalablytyped.runtime.Shortcut
import typings.unified.mod.Plugin
import typings.unified.mod.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("remark-abbr", JSImport.Namespace)
  @js.native
  val ^ : Abbr = js.native
  
  type Abbr = Plugin[js.Array[js.UndefOr[Options]], Settings]
  
  trait Options extends StObject {
    
    var expandFirst: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpandFirst(value: Boolean): Self = StObject.set(x, "expandFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandFirstUndefined: Self = StObject.set(x, "expandFirst", js.undefined)
    }
  }
  
  type _To = Abbr
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Abbr = ^
}
