package typings.storybookComponents

import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibEnumsMod`.Placement
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibTypesMod`.Modifier
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibTypesMod`.Offsets
import typings.storybookComponents.anon.Reference
import typings.storybookComponents.storybookComponentsStrings.offset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `distTs3Dot9Modules@popperjsCoreLibModifiersOffsetMod` {
  
  @JSImport("@storybook/components/dist/ts3.9/_modules/@popperjs-core-lib-modifiers-offset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/components/dist/ts3.9/_modules/@popperjs-core-lib-modifiers-offset", JSImport.Default)
  @js.native
  val default: OffsetModifier = js.native
  
  inline def distanceAndSkiddingToXY(placement: Placement, rects: Reference, offset: Offset): Offsets = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceAndSkiddingToXY")(placement.asInstanceOf[js.Any], rects.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Offsets]
  
  type Offset = OffsetsFunction | (js.Tuple2[js.UndefOr[Double | Null], js.UndefOr[Double | Null]])
  
  type OffsetModifier = Modifier[offset, Options]
  
  type OffsetsFunction = js.Function1[
    /* arg0 */ typings.storybookComponents.anon.Placement, 
    js.Tuple2[js.UndefOr[Double | Null], js.UndefOr[Double | Null]]
  ]
  
  trait Options extends StObject {
    
    var offset: Offset
  }
  object Options {
    
    inline def apply(offset: Offset): Options = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setOffset(value: Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetFunction1(
        value: /* arg0 */ typings.storybookComponents.anon.Placement => js.Tuple2[js.UndefOr[Double | Null], js.UndefOr[Double | Null]]
      ): Self = StObject.set(x, "offset", js.Any.fromFunction1(value))
    }
  }
}
