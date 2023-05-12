package typings.reactAliceCarousel

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactAliceCarousel.libTypesMod.SlideInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libViewsSlideInfoMod {
  
  @JSImport("react-alice-carousel/lib/views/SlideInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def SlideInfo(param0: SlideProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SlideInfo")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait SlideProps extends StObject {
    
    var activeIndex: Double
    
    var itemsCount: Double
    
    var renderSlideInfo: js.UndefOr[js.Function1[/* e */ SlideInfo, ReactNode]] = js.undefined
  }
  object SlideProps {
    
    inline def apply(activeIndex: Double, itemsCount: Double): SlideProps = {
      val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], itemsCount = itemsCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[SlideProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SlideProps] (val x: Self) extends AnyVal {
      
      inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setItemsCount(value: Double): Self = StObject.set(x, "itemsCount", value.asInstanceOf[js.Any])
      
      inline def setRenderSlideInfo(value: /* e */ SlideInfo => ReactNode): Self = StObject.set(x, "renderSlideInfo", js.Any.fromFunction1(value))
      
      inline def setRenderSlideInfoUndefined: Self = StObject.set(x, "renderSlideInfo", js.undefined)
    }
  }
}
