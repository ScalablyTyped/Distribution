package typings.reactBootstrap.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-bootstrap", "Carousel")
@js.native
class Carousel ()
  extends typings.reactBootstrap.libMod.Carousel
object Carousel {
  
  @JSImport("react-bootstrap", "Carousel")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap", "Carousel.Caption")
  @js.native
  class Caption ()
    extends typings.reactBootstrap.carouselCaptionMod.^
  /* static member */
  @JSImport("react-bootstrap", "Carousel.Caption")
  @js.native
  def Caption: Instantiable0[typings.reactBootstrap.carouselCaptionMod.^] = js.native
  @scala.inline
  def Caption_=(x: Instantiable0[typings.reactBootstrap.carouselCaptionMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Caption")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap", "Carousel.Item")
  @js.native
  class Item ()
    extends typings.reactBootstrap.carouselItemMod.^
  /* static member */
  @JSImport("react-bootstrap", "Carousel.Item")
  @js.native
  def Item: Instantiable0[typings.reactBootstrap.carouselItemMod.^] = js.native
  @scala.inline
  def Item_=(x: Instantiable0[typings.reactBootstrap.carouselItemMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
}
