package typings.storybookPreviewWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistedArgs extends StObject {
  
  var persistedArgs: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
  ] = js.undefined
}
object PersistedArgs {
  
  inline def apply(): PersistedArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistedArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PersistedArgs] (val x: Self) extends AnyVal {
    
    inline def setPersistedArgs(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
    ): Self = StObject.set(x, "persistedArgs", value.asInstanceOf[js.Any])
    
    inline def setPersistedArgsUndefined: Self = StObject.set(x, "persistedArgs", js.undefined)
  }
}
