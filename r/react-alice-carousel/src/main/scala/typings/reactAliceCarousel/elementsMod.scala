package typings.reactAliceCarousel

import typings.reactAliceCarousel.anon.AnimationDuration
import typings.reactAliceCarousel.anon.Height
import typings.reactAliceCarousel.anon.PaddingLeft
import typings.reactAliceCarousel.anon.PartialState
import typings.reactAliceCarousel.anon.Transform
import typings.reactAliceCarousel.reactAliceCarouselNumbers.`0`
import typings.reactAliceCarousel.reactAliceCarouselNumbers.`1`
import typings.reactAliceCarousel.typesMod.Props
import typings.reactAliceCarousel.typesMod.RootElement
import typings.reactAliceCarousel.typesMod.State
import typings.reactAliceCarousel.typesMod.Style
import typings.reactAliceCarousel.typesMod.TransformationSetItem
import typings.reactAliceCarousel.typesMod.Transition
import typings.std.Element
import typings.std.Event
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementsMod {
  
  @JSImport("react-alice-carousel/lib/utils/elements", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def animate(element: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def createAutowidthTransformationSet(el: js.Any): js.Array[TransformationSetItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAutowidthTransformationSet")(el.asInstanceOf[js.Any]).asInstanceOf[js.Array[TransformationSetItem]]
  
  inline def createClones(props: Props): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createClones")(props.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def createDefaultTransformationSet(children: js.Array[js.Any], galleryWidth: Double, itemsInSlide: Double): js.Array[TransformationSetItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultTransformationSet")(children.asInstanceOf[js.Any], galleryWidth.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any])).asInstanceOf[js.Array[TransformationSetItem]]
  
  inline def getAutoheightProperty(stageComponent: Element, props: Props, state: State): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutoheightProperty")(stageComponent.asInstanceOf[js.Any], props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def getElementCursor(props: Props, state: State): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementCursor")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getElementDimensions(element: js.Any): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementDimensions")(element.asInstanceOf[js.Any]).asInstanceOf[Height]
  
  inline def getElementFirstChild(stageComponent: js.Any, cursor: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementFirstChild")(stageComponent.asInstanceOf[js.Any], cursor.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def getItemWidth(galleryWidth: Double, itemsInSlide: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemWidth")(galleryWidth.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getItemsCount(props: Props): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getItemsCount")(props.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def getItemsOffset(props: Props): `0` | `1` = ^.asInstanceOf[js.Dynamic].applyDynamic("getItemsOffset")(props.asInstanceOf[js.Any]).asInstanceOf[`0` | `1`]
  
  inline def getRenderStageItemStyles(i: Double, state: State): AnimationDuration | Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("getRenderStageItemStyles")(i.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[AnimationDuration | Transform]
  
  inline def getRenderStageStyles(nextStyles: js.Any, currentStyles: Style): Style = (^.asInstanceOf[js.Dynamic].applyDynamic("getRenderStageStyles")(nextStyles.asInstanceOf[js.Any], currentStyles.asInstanceOf[js.Any])).asInstanceOf[Style]
  
  inline def getRenderWrapperStyles(props: Props, state: State, element: js.Any): PaddingLeft = (^.asInstanceOf[js.Dynamic].applyDynamic("getRenderWrapperStyles")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[PaddingLeft]
  
  inline def getSlides(props: Props): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSlides")(props.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def getTouchmoveTranslatePosition(deltaX: Double, translate3d: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTouchmoveTranslatePosition")(deltaX.asInstanceOf[js.Any], translate3d.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getTransformMatrix(element: js.Any): RegExpMatchArray = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransformMatrix")(element.asInstanceOf[js.Any]).asInstanceOf[RegExpMatchArray]
  
  inline def getTransitionProperty(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionProperty")().asInstanceOf[String]
  inline def getTransitionProperty(options: Transition): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionProperty")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getTranslate3dProperty(nextIndex: js.Any, state: PartialState): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTranslate3dProperty")(nextIndex.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getTranslateXProperty(element: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTranslateXProperty")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isElement(element: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def shouldHandleResizeEvent(e: Event): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldHandleResizeEvent")(e.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def shouldHandleResizeEvent(e: Event, prevDimensions: Unit, nextRootComponentDimensions: RootElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldHandleResizeEvent")(e.asInstanceOf[js.Any], prevDimensions.asInstanceOf[js.Any], nextRootComponentDimensions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shouldHandleResizeEvent(e: Event, prevDimensions: RootElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldHandleResizeEvent")(e.asInstanceOf[js.Any], prevDimensions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shouldHandleResizeEvent(e: Event, prevDimensions: RootElement, nextRootComponentDimensions: RootElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldHandleResizeEvent")(e.asInstanceOf[js.Any], prevDimensions.asInstanceOf[js.Any], nextRootComponentDimensions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
