package typings.reactAliceCarousel

import typings.reactAliceCarousel.typesMod.Props
import typings.reactAliceCarousel.typesMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-alice-carousel/lib/utils/controls", JSImport.Namespace)
@js.native
object controlsMod extends js.Object {
  
  def checkIsTheLastDotIndex(index: Double, infinite: Boolean, dotsLength: Double): Boolean = js.native
  
  def getDotsNavigationLength(itemsCount: js.UndefOr[scala.Nothing], itemsInSlide: js.UndefOr[scala.Nothing], autoWidth: js.Any): Double = js.native
  def getDotsNavigationLength(itemsCount: js.UndefOr[scala.Nothing], itemsInSlide: Double, autoWidth: js.Any): Double = js.native
  def getDotsNavigationLength(itemsCount: Double, itemsInSlide: js.UndefOr[scala.Nothing], autoWidth: js.Any): Double = js.native
  def getDotsNavigationLength(itemsCount: Double, itemsInSlide: Double, autoWidth: js.Any): Double = js.native
  
  def getItemIndexForDotNavigation(index: Double, isTheLastIndex: Boolean, slidesLength: Double, itemsInSlide: Double): Double = js.native
  
  def shouldCancelAutoPlayOnAction(): Boolean = js.native
  def shouldCancelAutoPlayOnAction(strategy: String): Boolean = js.native
  
  def shouldCancelAutoPlayOnHover(): Boolean = js.native
  def shouldCancelAutoPlayOnHover(strategy: String): Boolean = js.native
  
  def shouldDisableDots(props: Props, state: State): Boolean = js.native
}
