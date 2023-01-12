package typings.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inspect extends StObject {
  
  def inspect(root: Any, targetFile: Any, options: Any): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pluginApi.SinglePackageResult */ Any
  ]
}
object Inspect {
  
  inline def apply(
    inspect: (Any, Any, Any) => js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pluginApi.SinglePackageResult */ Any
    ]
  ): Inspect = {
    val __obj = js.Dynamic.literal(inspect = js.Any.fromFunction3(inspect))
    __obj.asInstanceOf[Inspect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Inspect] (val x: Self) extends AnyVal {
    
    inline def setInspect(
      value: (Any, Any, Any) => js.Promise[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pluginApi.SinglePackageResult */ Any
        ]
    ): Self = StObject.set(x, "inspect", js.Any.fromFunction3(value))
  }
}
