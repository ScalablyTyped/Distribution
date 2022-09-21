package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentTestingConstructor
  extends StObject
     with ComponentConstructor {
  
  var COMPILER_META: ComponentCompilerMeta
}
object ComponentTestingConstructor {
  
  inline def apply(COMPILER_META: ComponentCompilerMeta): ComponentTestingConstructor = {
    val __obj = js.Dynamic.literal(COMPILER_META = COMPILER_META.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentTestingConstructor]
  }
  
  extension [Self <: ComponentTestingConstructor](x: Self) {
    
    inline def setCOMPILER_META(value: ComponentCompilerMeta): Self = StObject.set(x, "COMPILER_META", value.asInstanceOf[js.Any])
  }
}
