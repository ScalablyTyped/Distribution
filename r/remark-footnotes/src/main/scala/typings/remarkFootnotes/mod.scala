package typings.remarkFootnotes

import org.scalablytyped.runtime.Shortcut
import typings.unified.mod.Plugin
import typings.unist.mod.Data
import typings.unist.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("remark-footnotes", JSImport.Namespace)
  @js.native
  val ^ : Footnotes = js.native
  
  type Footnotes = Plugin[js.Array[js.UndefOr[RemarkFootnotesOptions]], Node[Data], Node[Data]]
  
  trait RemarkFootnotesOptions extends StObject {
    
    /**
      * Whether to support `^[inline notes]`
      *
      * @defaultValue false
      */
    var inlineNotes: js.UndefOr[Boolean] = js.undefined
  }
  object RemarkFootnotesOptions {
    
    inline def apply(): RemarkFootnotesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemarkFootnotesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RemarkFootnotesOptions] (val x: Self) extends AnyVal {
      
      inline def setInlineNotes(value: Boolean): Self = StObject.set(x, "inlineNotes", value.asInstanceOf[js.Any])
      
      inline def setInlineNotesUndefined: Self = StObject.set(x, "inlineNotes", js.undefined)
    }
  }
  
  type _To = Footnotes
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Footnotes = ^
}
