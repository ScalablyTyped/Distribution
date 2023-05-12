package typings.storybookReactDomShim.distPresetMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for TypeScript usage within Storybook.
  */
trait TypescriptOptions extends StObject {
  
  /**
    * Enables type checking within Storybook.
    *
    * @default `false`
    */
  var check: Boolean
  
  /**
    * Disable parsing typescript files through babel.
    *
    * @default `false`
    */
  var skipBabel: Boolean
}
object TypescriptOptions {
  
  inline def apply(check: Boolean, skipBabel: Boolean): TypescriptOptions = {
    val __obj = js.Dynamic.literal(check = check.asInstanceOf[js.Any], skipBabel = skipBabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypescriptOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypescriptOptions] (val x: Self) extends AnyVal {
    
    inline def setCheck(value: Boolean): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
    
    inline def setSkipBabel(value: Boolean): Self = StObject.set(x, "skipBabel", value.asInstanceOf[js.Any])
  }
}
