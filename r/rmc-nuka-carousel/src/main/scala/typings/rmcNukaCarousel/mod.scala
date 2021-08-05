package typings.rmcNukaCarousel

import typings.rmcNukaCarousel.carouselMod.ICarouselProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rmc-nuka-carousel", JSImport.Default)
  @js.native
  class default protected ()
    extends typings.rmcNukaCarousel.carouselMod.default {
    def this(props: js.Any) = this()
  }
  object default {
    
    @JSImport("rmc-nuka-carousel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("rmc-nuka-carousel", "default.defaultProps")
    @js.native
    def defaultProps: ICarouselProps = js.native
    inline def defaultProps_=(x: ICarouselProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
