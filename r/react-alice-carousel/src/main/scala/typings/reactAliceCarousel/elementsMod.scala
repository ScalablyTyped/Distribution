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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-alice-carousel/lib/utils/elements", JSImport.Namespace)
@js.native
object elementsMod extends js.Object {
  
  def animate(element: js.Any, options: js.Any): js.Any = js.native
  
  def createAutowidthTransformationSet(el: js.Any): js.Array[TransformationSetItem] = js.native
  
  def createClones(props: Props): js.Any = js.native
  
  def createDefaultTransformationSet(children: js.Array[_], galleryWidth: Double, itemsInSlide: Double): js.Array[TransformationSetItem] = js.native
  
  def getAutoheightProperty(stageComponent: Element, props: Props, state: State): js.UndefOr[Double] = js.native
  
  def getElementCursor(props: Props, state: State): Double = js.native
  
  def getElementDimensions(element: js.Any): Height = js.native
  
  def getElementFirstChild(stageComponent: js.Any, cursor: js.Any): js.Any = js.native
  
  def getItemWidth(galleryWidth: Double, itemsInSlide: Double): Double = js.native
  
  def getItemsCount(props: Props): js.Any = js.native
  
  def getItemsOffset(props: Props): `0` | `1` = js.native
  
  def getRenderStageItemStyles(i: Double, state: State): AnimationDuration | Transform = js.native
  
  def getRenderStageStyles(nextStyles: js.Any, currentStyles: Style): Style = js.native
  
  def getRenderWrapperStyles(props: Props, state: State, element: js.Any): PaddingLeft = js.native
  
  def getSlides(props: Props): js.Any = js.native
  
  def getTouchmoveTranslatePosition(deltaX: Double, translate3d: Double): Double = js.native
  
  def getTransformMatrix(element: js.Any): RegExpMatchArray = js.native
  
  def getTransitionProperty(): String = js.native
  def getTransitionProperty(options: Transition): String = js.native
  
  def getTranslate3dProperty(nextIndex: js.Any, state: PartialState): Double = js.native
  
  def getTranslateXProperty(element: js.Any): Double = js.native
  
  def isElement(element: js.Any): Boolean = js.native
  
  def shouldHandleResizeEvent(e: Event): Boolean = js.native
  def shouldHandleResizeEvent(e: Event, prevDimensions: js.UndefOr[scala.Nothing], nextRootComponentDimensions: RootElement): Boolean = js.native
  def shouldHandleResizeEvent(e: Event, prevDimensions: RootElement): Boolean = js.native
  def shouldHandleResizeEvent(e: Event, prevDimensions: RootElement, nextRootComponentDimensions: RootElement): Boolean = js.native
}
