package typings.semanticUiProgress.anon

import typings.semanticUiProgress.SemanticUI.Progress.ClassNameSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.ProgressSettings._Impl, 'className'> */
trait PickImplclassName extends StObject {
  
  var className: ClassNameSettings
}
object PickImplclassName {
  
  inline def apply(className: ClassNameSettings): PickImplclassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplclassName]
  }
  
  extension [Self <: PickImplclassName](x: Self) {
    
    inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
  }
}
