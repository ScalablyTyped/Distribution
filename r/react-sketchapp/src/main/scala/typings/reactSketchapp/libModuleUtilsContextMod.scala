package typings.reactSketchapp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleUtilsContextMod {
  
  @JSImport("react-sketchapp/lib/module/utils/Context", "Context")
  @js.native
  open class Context () extends StObject {
    def this(styles: Styles) = this()
    
    def addInheritableStyles(styles: Styles): Unit = js.native
    
    def forChildren(): Context = js.native
    
    def getInheritedStyles(): js.Object = js.native
    
    var staged: js.Array[Styles] = js.native
    
    var styles: Styles = js.native
  }
  
  type Styles = js.Object
}
