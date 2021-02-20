package typings.reactBootstrap

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.reactBootstrap.anon.ActiveIndex
import typings.reactBootstrap.mod.Omit
import typings.reactBootstrap.reactBootstrapStrings.wrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carouselMod {
  
  @JSImport("react-bootstrap/lib/Carousel", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[CarouselProps, js.Object, js.Any]
  @JSImport("react-bootstrap/lib/Carousel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Carousel", "Caption")
  @js.native
  class Caption ()
    extends typings.reactBootstrap.carouselCaptionMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Carousel", "Caption")
  @js.native
  def Caption: Instantiable0[typings.reactBootstrap.carouselCaptionMod.^] = js.native
  @scala.inline
  def Caption_=(x: Instantiable0[typings.reactBootstrap.carouselCaptionMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Caption")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Carousel", "Item")
  @js.native
  class Item ()
    extends typings.reactBootstrap.carouselItemMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Carousel", "Item")
  @js.native
  def Item: Instantiable0[typings.reactBootstrap.carouselItemMod.^] = js.native
  @scala.inline
  def Item_=(x: Instantiable0[typings.reactBootstrap.carouselItemMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Carousel
    extends Component[CarouselProps, js.Object, js.Any]
  
  type CarouselProps = (Omit[HTMLProps[Carousel], wrap]) with ActiveIndex
}
