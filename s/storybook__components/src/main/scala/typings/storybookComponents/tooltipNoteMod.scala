package typings.storybookComponents

import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipNoteMod {
  
  @JSImport("@storybook/components/dist/tooltip/TooltipNote", "TooltipNote")
  @js.native
  val TooltipNote: FunctionComponent[TooltipNoteProps] = js.native
  
  trait TooltipNoteProps extends StObject {
    
    var note: String
  }
  object TooltipNoteProps {
    
    inline def apply(note: String): TooltipNoteProps = {
      val __obj = js.Dynamic.literal(note = note.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipNoteProps]
    }
    
    extension [Self <: TooltipNoteProps](x: Self) {
      
      inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    }
  }
}
