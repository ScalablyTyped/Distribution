package typings.reactSketchapp

import typings.reactSketchapp.libTypesMod.SketchDocument
import typings.reactSketchapp.libTypesMod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsSharedTextStylesMod {
  
  @JSImport("react-sketchapp/lib/utils/sharedTextStyles", "sharedTextStyles")
  @js.native
  val sharedTextStyles: TextStyles = js.native
  
  @js.native
  trait TextStyles extends StObject {
    
    def addStyle(
      name: String,
      _style: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Style */ Any
    ): String = js.native
    
    def getStyle(_name: String): js.UndefOr[TextStyle] = js.native
    def getStyle(_name: String, _document: SketchDocument): js.UndefOr[TextStyle] = js.native
    
    def setDocument(): this.type = js.native
    def setDocument(_doc: SketchDocument): this.type = js.native
    
    def setStyles(_styles: js.Array[Any]): this.type = js.native
  }
}
