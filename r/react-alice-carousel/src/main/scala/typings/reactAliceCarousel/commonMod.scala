package typings.reactAliceCarousel

import typings.reactAliceCarousel.anon.PartialProps
import typings.reactAliceCarousel.typesMod.Props
import typings.reactAliceCarousel.typesMod.State
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("react-alice-carousel/lib/utils/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateInitialState(props: PartialProps): State = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateInitialState")(props.asInstanceOf[js.Any]).asInstanceOf[State]
  inline def calculateInitialState(props: PartialProps, el: Null, canUseDom: Boolean): State = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateInitialState")(props.asInstanceOf[js.Any], el.asInstanceOf[js.Any], canUseDom.asInstanceOf[js.Any])).asInstanceOf[State]
  inline def calculateInitialState(props: PartialProps, el: HTMLElement): State = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateInitialState")(props.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[State]
  inline def calculateInitialState(props: PartialProps, el: HTMLElement, canUseDom: Boolean): State = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateInitialState")(props.asInstanceOf[js.Any], el.asInstanceOf[js.Any], canUseDom.asInstanceOf[js.Any])).asInstanceOf[State]
  
  inline def canUseDOM(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canUseDOM")().asInstanceOf[Boolean]
  
  inline def concatClassnames(classes: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("concatClassnames")(classes.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def getIsStageContentPartial(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getIsStageContentPartial")().asInstanceOf[Boolean]
  inline def getIsStageContentPartial(infinite: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getIsStageContentPartial")(infinite.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def getIsStageContentPartial(infinite: Boolean, stageWidth: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getIsStageContentPartial")(infinite.asInstanceOf[js.Any], stageWidth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def getIsStageContentPartial(infinite: Boolean, stageWidth: Double, contentWidth: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getIsStageContentPartial")(infinite.asInstanceOf[js.Any], stageWidth.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def getIsStageContentPartial(infinite: Boolean, stageWidth: Unit, contentWidth: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getIsStageContentPartial")(infinite.asInstanceOf[js.Any], stageWidth.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def getIsStageContentPartial(infinite: Unit, stageWidth: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getIsStageContentPartial")(infinite.asInstanceOf[js.Any], stageWidth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def getIsStageContentPartial(infinite: Unit, stageWidth: Double, contentWidth: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getIsStageContentPartial")(infinite.asInstanceOf[js.Any], stageWidth.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def getIsStageContentPartial(infinite: Unit, stageWidth: Unit, contentWidth: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getIsStageContentPartial")(infinite.asInstanceOf[js.Any], stageWidth.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getItemsInSlide(itemsCount: Double, props: Props): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemsInSlide")(itemsCount.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Double]
}
