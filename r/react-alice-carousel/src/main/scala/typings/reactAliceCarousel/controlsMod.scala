package typings.reactAliceCarousel

import typings.reactAliceCarousel.typesMod.Props
import typings.reactAliceCarousel.typesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlsMod {
  
  @JSImport("react-alice-carousel/lib/utils/controls", "checkIsTheLastDotIndex")
  @js.native
  def checkIsTheLastDotIndex(index: Double, infinite: Boolean, dotsLength: Double): Boolean = js.native
  
  @JSImport("react-alice-carousel/lib/utils/controls", "getDotsNavigationLength")
  @js.native
  def getDotsNavigationLength(itemsCount: js.UndefOr[scala.Nothing], itemsInSlide: js.UndefOr[scala.Nothing], autoWidth: js.Any): Double = js.native
  @JSImport("react-alice-carousel/lib/utils/controls", "getDotsNavigationLength")
  @js.native
  def getDotsNavigationLength(itemsCount: js.UndefOr[scala.Nothing], itemsInSlide: Double, autoWidth: js.Any): Double = js.native
  @JSImport("react-alice-carousel/lib/utils/controls", "getDotsNavigationLength")
  @js.native
  def getDotsNavigationLength(itemsCount: Double, itemsInSlide: js.UndefOr[scala.Nothing], autoWidth: js.Any): Double = js.native
  @JSImport("react-alice-carousel/lib/utils/controls", "getDotsNavigationLength")
  @js.native
  def getDotsNavigationLength(itemsCount: Double, itemsInSlide: Double, autoWidth: js.Any): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils/controls", "getItemIndexForDotNavigation")
  @js.native
  def getItemIndexForDotNavigation(index: Double, isTheLastIndex: Boolean, slidesLength: Double, itemsInSlide: Double): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils/controls", "shouldCancelAutoPlayOnAction")
  @js.native
  def shouldCancelAutoPlayOnAction(): Boolean = js.native
  @JSImport("react-alice-carousel/lib/utils/controls", "shouldCancelAutoPlayOnAction")
  @js.native
  def shouldCancelAutoPlayOnAction(strategy: String): Boolean = js.native
  
  @JSImport("react-alice-carousel/lib/utils/controls", "shouldCancelAutoPlayOnHover")
  @js.native
  def shouldCancelAutoPlayOnHover(): Boolean = js.native
  @JSImport("react-alice-carousel/lib/utils/controls", "shouldCancelAutoPlayOnHover")
  @js.native
  def shouldCancelAutoPlayOnHover(strategy: String): Boolean = js.native
  
  @JSImport("react-alice-carousel/lib/utils/controls", "shouldDisableDots")
  @js.native
  def shouldDisableDots(props: Props, state: State): Boolean = js.native
}
