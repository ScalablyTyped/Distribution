package typings.reactAliceCarousel

import typings.reactAliceCarousel.typesMod.Props
import typings.reactAliceCarousel.typesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlsMod {
  
  @JSImport("react-alice-carousel/lib/utils/controls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def checkIsTheLastDotIndex(index: Double, infinite: Boolean, dotsLength: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkIsTheLastDotIndex")(index.asInstanceOf[js.Any], infinite.asInstanceOf[js.Any], dotsLength.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def getDotsNavigationLength(itemsCount: Double, itemsInSlide: Double, autoWidth: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDotsNavigationLength")(itemsCount.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any], autoWidth.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getDotsNavigationLength(itemsCount: Double, itemsInSlide: Unit, autoWidth: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDotsNavigationLength")(itemsCount.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any], autoWidth.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getDotsNavigationLength(itemsCount: Unit, itemsInSlide: Double, autoWidth: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDotsNavigationLength")(itemsCount.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any], autoWidth.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getDotsNavigationLength(itemsCount: Unit, itemsInSlide: Unit, autoWidth: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDotsNavigationLength")(itemsCount.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any], autoWidth.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getItemIndexForDotNavigation(index: Double, isTheLastIndex: Boolean, slidesLength: Double, itemsInSlide: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemIndexForDotNavigation")(index.asInstanceOf[js.Any], isTheLastIndex.asInstanceOf[js.Any], slidesLength.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def shouldCancelAutoPlayOnAction(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldCancelAutoPlayOnAction")().asInstanceOf[Boolean]
  @scala.inline
  def shouldCancelAutoPlayOnAction(strategy: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldCancelAutoPlayOnAction")(strategy.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def shouldCancelAutoPlayOnHover(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldCancelAutoPlayOnHover")().asInstanceOf[Boolean]
  @scala.inline
  def shouldCancelAutoPlayOnHover(strategy: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldCancelAutoPlayOnHover")(strategy.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def shouldDisableDots(props: Props, state: State): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldDisableDots")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
