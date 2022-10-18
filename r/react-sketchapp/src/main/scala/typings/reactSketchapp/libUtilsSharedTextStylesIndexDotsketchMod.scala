package typings.reactSketchapp

import typings.reactSketchapp.libTypesMod.SketchDocument
import typings.reactSketchapp.libTypesMod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsSharedTextStylesIndexDotsketchMod {
  
  @JSImport("react-sketchapp/lib/utils/sharedTextStyles/index.sketch", "sharedTextStyles")
  @js.native
  val sharedTextStyles: TextStyles = js.native
  
  @js.native
  trait TextStyles extends StObject {
    
    var _document: SketchDocument | Null = js.native
    
    def addStyle(
      name: String,
      style: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Style */ Any
    ): String = js.native
    
    def getStyle(name: String): js.UndefOr[TextStyle] = js.native
    def getStyle(name: String, document: SketchDocument): js.UndefOr[TextStyle] = js.native
    
    def setDocument(): this.type = js.native
    def setDocument(doc: SketchDocument): this.type = js.native
    
    def setStyles(styles: js.Array[Any]): this.type = js.native
  }
}
