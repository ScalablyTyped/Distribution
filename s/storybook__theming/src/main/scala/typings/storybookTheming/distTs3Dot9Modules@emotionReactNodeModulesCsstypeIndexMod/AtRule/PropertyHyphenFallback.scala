package typings.storybookTheming.`distTs3Dot9Modules@emotionReactNodeModulesCsstypeIndexMod`.AtRule

import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/theming.@storybook/theming/dist/ts3.9/_modules/@emotion-react-node_modules-csstype-index.Fallback<@storybook/theming.@storybook/theming/dist/ts3.9/_modules/@emotion-react-node_modules-csstype-index.AtRule.PropertyHyphen<TLength, TTime>> */
trait PropertyHyphenFallback[TLength, TTime] extends StObject {
  
  var inherits: js.UndefOr[Inherits | js.Array[NonNullable[js.UndefOr[Inherits]]]] = js.undefined
  
  var `initial-value`: js.UndefOr[String | js.Array[NonNullable[js.UndefOr[String]]]] = js.undefined
  
  var syntax: js.UndefOr[String | js.Array[NonNullable[js.UndefOr[String]]]] = js.undefined
}
object PropertyHyphenFallback {
  
  inline def apply[TLength, TTime](): PropertyHyphenFallback[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyHyphenFallback[TLength, TTime]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertyHyphenFallback[?, ?], TLength, TTime] (val x: Self & (PropertyHyphenFallback[TLength, TTime])) extends AnyVal {
    
    inline def setInherits(value: Inherits | js.Array[NonNullable[js.UndefOr[Inherits]]]): Self = StObject.set(x, "inherits", value.asInstanceOf[js.Any])
    
    inline def setInheritsUndefined: Self = StObject.set(x, "inherits", js.undefined)
    
    inline def setInheritsVarargs(value: NonNullable[js.UndefOr[Inherits]]*): Self = StObject.set(x, "inherits", js.Array(value*))
    
    inline def `setInitial-value`(value: String | js.Array[NonNullable[js.UndefOr[String]]]): Self = StObject.set(x, "initial-value", value.asInstanceOf[js.Any])
    
    inline def `setInitial-valueUndefined`: Self = StObject.set(x, "initial-value", js.undefined)
    
    inline def `setInitial-valueVarargs`(value: NonNullable[js.UndefOr[String]]*): Self = StObject.set(x, "initial-value", js.Array(value*))
    
    inline def setSyntax(value: String | js.Array[NonNullable[js.UndefOr[String]]]): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    
    inline def setSyntaxVarargs(value: NonNullable[js.UndefOr[String]]*): Self = StObject.set(x, "syntax", js.Array(value*))
  }
}
