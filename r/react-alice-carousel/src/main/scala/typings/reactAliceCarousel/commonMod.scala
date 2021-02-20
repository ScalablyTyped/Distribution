package typings.reactAliceCarousel

import typings.reactAliceCarousel.anon.PartialProps
import typings.reactAliceCarousel.anon.PartialState
import typings.reactAliceCarousel.typesMod.Props
import typings.reactAliceCarousel.typesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("react-alice-carousel/lib/utils/common", "calculateInitialState")
  @js.native
  def calculateInitialState(props: PartialProps, el: js.Any): State = js.native
  
  @JSImport("react-alice-carousel/lib/utils/common", "getIsStageContentPartial")
  @js.native
  def getIsStageContentPartial(): Boolean = js.native
  @JSImport("react-alice-carousel/lib/utils/common", "getIsStageContentPartial")
  @js.native
  def getIsStageContentPartial(stageWidth: js.UndefOr[scala.Nothing], contentWidth: Double): Boolean = js.native
  @JSImport("react-alice-carousel/lib/utils/common", "getIsStageContentPartial")
  @js.native
  def getIsStageContentPartial(stageWidth: Double): Boolean = js.native
  @JSImport("react-alice-carousel/lib/utils/common", "getIsStageContentPartial")
  @js.native
  def getIsStageContentPartial(stageWidth: Double, contentWidth: Double): Boolean = js.native
  
  @JSImport("react-alice-carousel/lib/utils/common", "getItemsInSlide")
  @js.native
  def getItemsInSlide(itemsCount: Double, props: Props): Double = js.native
  
  @JSImport("react-alice-carousel/lib/utils/common", "getStageContentWidth")
  @js.native
  def getStageContentWidth(state: PartialState): Double = js.native
}
