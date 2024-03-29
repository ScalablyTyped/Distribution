package typings.storybookComponents.`distTs3Dot9Modules@typesPrettierIndexMod`

import typings.storybookComponents.anon.ExcludeFiles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config
  extends StObject
     with Options {
  
  var overrides: js.UndefOr[js.Array[ExcludeFiles]] = js.undefined
}
object Config {
  
  inline def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
    
    inline def setOverrides(value: js.Array[ExcludeFiles]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setOverridesVarargs(value: ExcludeFiles*): Self = StObject.set(x, "overrides", js.Array(value*))
  }
}
