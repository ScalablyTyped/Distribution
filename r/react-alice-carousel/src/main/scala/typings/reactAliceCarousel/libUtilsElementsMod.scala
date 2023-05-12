package typings.reactAliceCarousel

import typings.reactAliceCarousel.anon.AnimationDuration
import typings.reactAliceCarousel.anon.Content
import typings.reactAliceCarousel.anon.Height
import typings.reactAliceCarousel.anon.PaddingLeft
import typings.reactAliceCarousel.anon.PartialState
import typings.reactAliceCarousel.anon.Transform
import typings.reactAliceCarousel.libTypesMod.Options
import typings.reactAliceCarousel.libTypesMod.Props
import typings.reactAliceCarousel.libTypesMod.RootElement
import typings.reactAliceCarousel.libTypesMod.State
import typings.reactAliceCarousel.libTypesMod.Style
import typings.reactAliceCarousel.libTypesMod.Transformations
import typings.reactAliceCarousel.libTypesMod.Transition
import typings.reactAliceCarousel.reactAliceCarouselInts.`0`
import typings.reactAliceCarousel.reactAliceCarouselInts.`1`
import typings.std.ChildNode
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsElementsMod {
  
  @JSImport("react-alice-carousel/lib/utils/elements", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def animate(element: Null, options: Options): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  inline def animate(element: HTMLElement, options: Options): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  
  inline def canUseDOM(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canUseDOM")().asInstanceOf[Boolean]
  
  inline def createAutowidthTransformationSet(): Content = ^.asInstanceOf[js.Dynamic].applyDynamic("createAutowidthTransformationSet")().asInstanceOf[Content]
  inline def createAutowidthTransformationSet(el: Null, stageWidth: Double): Content = (^.asInstanceOf[js.Dynamic].applyDynamic("createAutowidthTransformationSet")(el.asInstanceOf[js.Any], stageWidth.asInstanceOf[js.Any])).asInstanceOf[Content]
  inline def createAutowidthTransformationSet(el: Null, stageWidth: Double, infinite: Boolean): Content = (^.asInstanceOf[js.Dynamic].applyDynamic("createAutowidthTransformationSet")(el.asInstanceOf[js.Any], stageWidth.asInstanceOf[js.Any], infinite.asInstanceOf[js.Any])).asInstanceOf[Content]
  inline def createAutowidthTransformationSet(el: Null, stageWidth: Unit, infinite: Boolean): Content = (^.asInstanceOf[js.Dynamic].applyDynamic("createAutowidthTransformationSet")(el.asInstanceOf[js.Any], stageWidth.asInstanceOf[js.Any], infinite.asInstanceOf[js.Any])).asInstanceOf[Content]
  inline def createAutowidthTransformationSet(el: HTMLElement): Content = ^.asInstanceOf[js.Dynamic].applyDynamic("createAutowidthTransformationSet")(el.asInstanceOf[js.Any]).asInstanceOf[Content]
  inline def createAutowidthTransformationSet(el: HTMLElement, stageWidth: Double): Content = (^.asInstanceOf[js.Dynamic].applyDynamic("createAutowidthTransformationSet")(el.asInstanceOf[js.Any], stageWidth.asInstanceOf[js.Any])).asInstanceOf[Content]
  inline def createAutowidthTransformationSet(el: HTMLElement, stageWidth: Double, infinite: Boolean): Content = (^.asInstanceOf[js.Dynamic].applyDynamic("createAutowidthTransformationSet")(el.asInstanceOf[js.Any], stageWidth.asInstanceOf[js.Any], infinite.asInstanceOf[js.Any])).asInstanceOf[Content]
  inline def createAutowidthTransformationSet(el: HTMLElement, stageWidth: Unit, infinite: Boolean): Content = (^.asInstanceOf[js.Dynamic].applyDynamic("createAutowidthTransformationSet")(el.asInstanceOf[js.Any], stageWidth.asInstanceOf[js.Any], infinite.asInstanceOf[js.Any])).asInstanceOf[Content]
  
  inline def createClones(props: Props): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createClones")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def createDefaultTransformationSet(children: js.Array[Any], stageWidth: Double, itemsInSlide: Double): Transformations = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultTransformationSet")(children.asInstanceOf[js.Any], stageWidth.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any])).asInstanceOf[Transformations]
  inline def createDefaultTransformationSet(children: js.Array[Any], stageWidth: Double, itemsInSlide: Double, infinite: Boolean): Transformations = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultTransformationSet")(children.asInstanceOf[js.Any], stageWidth.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any], infinite.asInstanceOf[js.Any])).asInstanceOf[Transformations]
  
  inline def getAutoheightProperty(stageComponent: Null, props: Props, state: State): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutoheightProperty")(stageComponent.asInstanceOf[js.Any], props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  inline def getAutoheightProperty(stageComponent: HTMLElement, props: Props, state: State): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutoheightProperty")(stageComponent.asInstanceOf[js.Any], props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def getElementCursor(props: Props, state: State): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementCursor")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getElementDimensions(): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementDimensions")().asInstanceOf[Height]
  inline def getElementDimensions(element: HTMLElement): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementDimensions")(element.asInstanceOf[js.Any]).asInstanceOf[Height]
  
  inline def getElementFirstChild(stageComponent: Null, cursor: Double): ChildNode | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementFirstChild")(stageComponent.asInstanceOf[js.Any], cursor.asInstanceOf[js.Any])).asInstanceOf[ChildNode | Null]
  inline def getElementFirstChild(stageComponent: HTMLElement, cursor: Double): ChildNode | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementFirstChild")(stageComponent.asInstanceOf[js.Any], cursor.asInstanceOf[js.Any])).asInstanceOf[ChildNode | Null]
  
  inline def getItemWidth(galleryWidth: Double, itemsInSlide: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemWidth")(galleryWidth.asInstanceOf[js.Any], itemsInSlide.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getItemsCount(props: Props): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getItemsCount")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getItemsInSlide(itemsCount: Double, props: Props): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemsInSlide")(itemsCount.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getItemsOffset(props: Props): `0` | `1` = ^.asInstanceOf[js.Dynamic].applyDynamic("getItemsOffset")(props.asInstanceOf[js.Any]).asInstanceOf[`0` | `1`]
  
  inline def getRenderStageItemStyles(i: Double, state: State): AnimationDuration | Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("getRenderStageItemStyles")(i.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[AnimationDuration | Transform]
  
  inline def getRenderStageStyles(nextStyles: Options, currentStyles: Style): Style = (^.asInstanceOf[js.Dynamic].applyDynamic("getRenderStageStyles")(nextStyles.asInstanceOf[js.Any], currentStyles.asInstanceOf[js.Any])).asInstanceOf[Style]
  
  inline def getRenderWrapperStyles(props: Props, state: State): PaddingLeft = (^.asInstanceOf[js.Dynamic].applyDynamic("getRenderWrapperStyles")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[PaddingLeft]
  inline def getRenderWrapperStyles(props: Props, state: State, element: HTMLElement): PaddingLeft = (^.asInstanceOf[js.Dynamic].applyDynamic("getRenderWrapperStyles")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[PaddingLeft]
  
  inline def getSlides(props: Props): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSlides")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getTouchmoveTranslatePosition(deltaX: Double, translate3d: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTouchmoveTranslatePosition")(deltaX.asInstanceOf[js.Any], translate3d.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getTransformMatrix(): RegExpMatchArray = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransformMatrix")().asInstanceOf[RegExpMatchArray]
  inline def getTransformMatrix(element: Element): RegExpMatchArray = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransformMatrix")(element.asInstanceOf[js.Any]).asInstanceOf[RegExpMatchArray]
  
  inline def getTransitionProperty(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionProperty")().asInstanceOf[String]
  inline def getTransitionProperty(options: Transition): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionProperty")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getTranslate3dProperty(nextIndex: Double, state: PartialState): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTranslate3dProperty")(nextIndex.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getTranslateXProperty(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTranslateXProperty")().asInstanceOf[Double]
  inline def getTranslateXProperty(element: Element): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTranslateXProperty")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isElement(element: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def shouldHandleResizeEvent(e: Event): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldHandleResizeEvent")(e.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def shouldHandleResizeEvent(e: Event, prevDimensions: Unit, nextRootComponentDimensions: RootElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldHandleResizeEvent")(e.asInstanceOf[js.Any], prevDimensions.asInstanceOf[js.Any], nextRootComponentDimensions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shouldHandleResizeEvent(e: Event, prevDimensions: RootElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldHandleResizeEvent")(e.asInstanceOf[js.Any], prevDimensions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shouldHandleResizeEvent(e: Event, prevDimensions: RootElement, nextRootComponentDimensions: RootElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldHandleResizeEvent")(e.asInstanceOf[js.Any], prevDimensions.asInstanceOf[js.Any], nextRootComponentDimensions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
