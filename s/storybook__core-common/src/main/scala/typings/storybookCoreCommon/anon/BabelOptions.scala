package typings.storybookCoreCommon.anon

import typings.babelCore.mod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BabelOptions extends StObject {
  
  var babelOptions: js.UndefOr[TransformOptions] = js.undefined
}
object BabelOptions {
  
  inline def apply(): BabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BabelOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BabelOptions] (val x: Self) extends AnyVal {
    
    inline def setBabelOptions(value: TransformOptions): Self = StObject.set(x, "babelOptions", value.asInstanceOf[js.Any])
    
    inline def setBabelOptionsUndefined: Self = StObject.set(x, "babelOptions", js.undefined)
  }
}
