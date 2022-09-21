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
  
  inline def checkIsTheLastDotIndex(index: Double, infinite: Boolean, dotsLength: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkIsTheLastDotIndex")(index.asInstanceOf[js.Any], infinite.asInstanceOf[js.Any], dotsLength.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getDotsNavigationLength(itemsCount: Double, itemsInSlide: Double, hasDotForEachSlide: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDotsNavigationLength")(itemsCount.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any], hasDotForEachSlide.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getDotsNavigationLength(itemsCount: Double, itemsInSlide: Unit, hasDotForEachSlide: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDotsNavigationLength")(itemsCount.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any], hasDotForEachSlide.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getDotsNavigationLength(itemsCount: Unit, itemsInSlide: Double, hasDotForEachSlide: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDotsNavigationLength")(itemsCount.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any], hasDotForEachSlide.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getDotsNavigationLength(itemsCount: Unit, itemsInSlide: Unit, hasDotForEachSlide: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDotsNavigationLength")(itemsCount.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any], hasDotForEachSlide.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getItemIndexForDotNavigation(index: Double, isTheLastIndex: Boolean, slidesLength: Double, itemsInSlide: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemIndexForDotNavigation")(index.asInstanceOf[js.Any], isTheLastIndex.asInstanceOf[js.Any], slidesLength.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def hasDotForEachSlide(autoWidth: Any, controlsStrategy: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("hasDotForEachSlide")(autoWidth.asInstanceOf[js.Any], controlsStrategy.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def isStrategy(strategy: Any, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isStrategy")(strategy.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def shouldCancelAutoPlayOnAction(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldCancelAutoPlayOnAction")().asInstanceOf[Boolean]
  inline def shouldCancelAutoPlayOnAction(strategy: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldCancelAutoPlayOnAction")(strategy.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def shouldCancelAutoPlayOnHover(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldCancelAutoPlayOnHover")().asInstanceOf[Boolean]
  inline def shouldCancelAutoPlayOnHover(strategy: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldCancelAutoPlayOnHover")(strategy.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def shouldDisableButtons(props: Props, state: State): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldDisableButtons")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def shouldDisableControls(props: Props, state: State): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldDisableControls")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def shouldDisableDots(props: Props, state: State): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldDisableDots")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
}
