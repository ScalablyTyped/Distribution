package typings.storybookReactDomShim.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@storybook/react-dom-shim.@storybook/react-dom-shim/dist/preset.TypescriptOptions> */
trait PartialTypescriptOptions extends StObject {
  
  var check: js.UndefOr[Boolean] = js.undefined
  
  var skipBabel: js.UndefOr[Boolean] = js.undefined
}
object PartialTypescriptOptions {
  
  inline def apply(): PartialTypescriptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTypescriptOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialTypescriptOptions] (val x: Self) extends AnyVal {
    
    inline def setCheck(value: Boolean): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
    
    inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
    
    inline def setSkipBabel(value: Boolean): Self = StObject.set(x, "skipBabel", value.asInstanceOf[js.Any])
    
    inline def setSkipBabelUndefined: Self = StObject.set(x, "skipBabel", js.undefined)
  }
}
