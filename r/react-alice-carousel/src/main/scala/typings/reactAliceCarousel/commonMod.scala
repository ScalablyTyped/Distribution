package typings.reactAliceCarousel

import typings.reactAliceCarousel.anon.PartialProps
import typings.reactAliceCarousel.anon.PartialState
import typings.reactAliceCarousel.typesMod.Props
import typings.reactAliceCarousel.typesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("react-alice-carousel/lib/utils/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateInitialState(props: PartialProps, el: js.Any): State = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateInitialState")(props.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[State]
  
  inline def getIsStageContentPartial(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getIsStageContentPartial")().asInstanceOf[Boolean]
  inline def getIsStageContentPartial(stageWidth: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getIsStageContentPartial")(stageWidth.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def getIsStageContentPartial(stageWidth: Double, contentWidth: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getIsStageContentPartial")(stageWidth.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def getIsStageContentPartial(stageWidth: Unit, contentWidth: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getIsStageContentPartial")(stageWidth.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getItemsInSlide(itemsCount: Double, props: Props): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemsInSlide")(itemsCount.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getStageContentWidth(state: PartialState): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStageContentWidth")(state.asInstanceOf[js.Any]).asInstanceOf[Double]
}
