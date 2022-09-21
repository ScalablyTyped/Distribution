package typings.storybookComponents.anon

import typings.storybookComponents.popperjsCoreLibModifiersOffsetMod.Offset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@storybook/components.@storybook/components/dist/ts3.9/_modules/@popperjs-core-lib-modifiers-offset.Options> */
trait PartialOptionsOffset extends StObject {
  
  var offset: js.UndefOr[Offset] = js.undefined
}
object PartialOptionsOffset {
  
  inline def apply(): PartialOptionsOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsOffset]
  }
  
  extension [Self <: PartialOptionsOffset](x: Self) {
    
    inline def setOffset(value: Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetFunction1(value: /* arg0 */ Placement => js.Tuple2[js.UndefOr[Double | Null], js.UndefOr[Double | Null]]): Self = StObject.set(x, "offset", js.Any.fromFunction1(value))
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
