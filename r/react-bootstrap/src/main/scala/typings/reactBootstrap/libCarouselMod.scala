package typings.reactBootstrap

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.reactBootstrap.anon.ActiveIndex
import typings.reactBootstrap.mod.Omit
import typings.reactBootstrap.reactBootstrapStrings.wrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCarouselMod {
  
  @JSImport("react-bootstrap/lib/Carousel", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[CarouselProps, js.Object, Any]
  @JSImport("react-bootstrap/lib/Carousel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Carousel", "Caption")
  @js.native
  open class Caption ()
    extends typings.reactBootstrap.libCarouselCaptionMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Carousel", "Caption")
  @js.native
  def Caption: Instantiable0[typings.reactBootstrap.libCarouselCaptionMod.^] = js.native
  inline def Caption_=(x: Instantiable0[typings.reactBootstrap.libCarouselCaptionMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Caption")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Carousel", "Item")
  @js.native
  open class Item ()
    extends typings.reactBootstrap.libCarouselItemMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Carousel", "Item")
  @js.native
  def Item: Instantiable0[typings.reactBootstrap.libCarouselItemMod.^] = js.native
  inline def Item_=(x: Instantiable0[typings.reactBootstrap.libCarouselItemMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  type Carousel = Component[CarouselProps, js.Object, Any]
  
  type CarouselProps = (Omit[HTMLProps[Any], wrap]) & ActiveIndex
}
