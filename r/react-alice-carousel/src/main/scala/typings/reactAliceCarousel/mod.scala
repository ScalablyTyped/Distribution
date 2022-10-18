package typings.reactAliceCarousel

import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.reactAliceCarousel.anon.ActiveIndex
import typings.reactAliceCarousel.anon.ReadonlyProps
import typings.reactAliceCarousel.anon.ReadonlyState
import typings.reactAliceCarousel.libTypesMod.EventObject
import typings.reactAliceCarousel.libTypesMod.EventType
import typings.reactAliceCarousel.libTypesMod.Props
import typings.reactAliceCarousel.libTypesMod.SlideTo
import typings.reactAliceCarousel.libTypesMod.State
import typings.reactAliceCarousel.reactAliceCarouselBooleans.`false`
import typings.std.Event
import typings.vanillaSwipe.libTypesMod.EventData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-alice-carousel", JSImport.Default)
  @js.native
  open class default protected () extends AliceCarousel {
    def this(props: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-alice-carousel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-alice-carousel", "default.defaultProps")
    @js.native
    def defaultProps: ActiveIndex = js.native
    inline def defaultProps_=(x: ActiveIndex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-alice-carousel", "AnimationType")
  @js.native
  object AnimationType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactAliceCarousel.libTypesMod.AnimationType & String] = js.native
    
    /* "fadeout" */ val FADEOUT: typings.reactAliceCarousel.libTypesMod.AnimationType.FADEOUT & String = js.native
    
    /* "slide" */ val SLIDE: typings.reactAliceCarousel.libTypesMod.AnimationType.SLIDE & String = js.native
  }
  
  @JSImport("react-alice-carousel", "AutoPlayStrategy")
  @js.native
  object AutoPlayStrategy extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactAliceCarousel.libTypesMod.AutoPlayStrategy & String] = js.native
    
    /* "action" */ val ACTION: typings.reactAliceCarousel.libTypesMod.AutoPlayStrategy.ACTION & String = js.native
    
    /* "all" */ val ALL: typings.reactAliceCarousel.libTypesMod.AutoPlayStrategy.ALL & String = js.native
    
    /* "default" */ val DEFAULT: typings.reactAliceCarousel.libTypesMod.AutoPlayStrategy.DEFAULT & String = js.native
    
    /* "none" */ val NONE: typings.reactAliceCarousel.libTypesMod.AutoPlayStrategy.NONE & String = js.native
  }
  
  @JSImport("react-alice-carousel", "AutoplayDirection")
  @js.native
  object AutoplayDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactAliceCarousel.libTypesMod.AutoplayDirection & String] = js.native
    
    /* "ltr" */ val LTR: typings.reactAliceCarousel.libTypesMod.AutoplayDirection.LTR & String = js.native
    
    /* "rtl" */ val RTL: typings.reactAliceCarousel.libTypesMod.AutoplayDirection.RTL & String = js.native
  }
  
  @JSImport("react-alice-carousel", "Classnames")
  @js.native
  object Classnames extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactAliceCarousel.libTypesMod.Classnames & String] = js.native
    
    /* "animated animated-out fadeOut" */ val ANIMATED: typings.reactAliceCarousel.libTypesMod.Classnames.ANIMATED & String = js.native
    
    /* "alice-carousel__next-btn" */ val BUTTON_NEXT: typings.reactAliceCarousel.libTypesMod.Classnames.BUTTON_NEXT & String = js.native
    
    /* "alice-carousel__next-btn-item" */ val BUTTON_NEXT_ITEM: typings.reactAliceCarousel.libTypesMod.Classnames.BUTTON_NEXT_ITEM & String = js.native
    
    /* "alice-carousel__next-btn-wrapper" */ val BUTTON_NEXT_WRAPPER: typings.reactAliceCarousel.libTypesMod.Classnames.BUTTON_NEXT_WRAPPER & String = js.native
    
    /* "alice-carousel__prev-btn" */ val BUTTON_PREV: typings.reactAliceCarousel.libTypesMod.Classnames.BUTTON_PREV & String = js.native
    
    /* "alice-carousel__prev-btn-item" */ val BUTTON_PREV_ITEM: typings.reactAliceCarousel.libTypesMod.Classnames.BUTTON_PREV_ITEM & String = js.native
    
    /* "alice-carousel__prev-btn-wrapper" */ val BUTTON_PREV_WRAPPER: typings.reactAliceCarousel.libTypesMod.Classnames.BUTTON_PREV_WRAPPER & String = js.native
    
    /* "alice-carousel__dots" */ val DOTS: typings.reactAliceCarousel.libTypesMod.Classnames.DOTS & String = js.native
    
    /* "alice-carousel__dots-item" */ val DOTS_ITEM: typings.reactAliceCarousel.libTypesMod.Classnames.DOTS_ITEM & String = js.native
    
    /* "alice-carousel__play-btn" */ val PLAY_BTN: typings.reactAliceCarousel.libTypesMod.Classnames.PLAY_BTN & String = js.native
    
    /* "alice-carousel__play-btn-item" */ val PLAY_BTN_ITEM: typings.reactAliceCarousel.libTypesMod.Classnames.PLAY_BTN_ITEM & String = js.native
    
    /* "alice-carousel__play-btn-wrapper" */ val PLAY_BTN_WRAPPER: typings.reactAliceCarousel.libTypesMod.Classnames.PLAY_BTN_WRAPPER & String = js.native
    
    /* "alice-carousel" */ val ROOT: typings.reactAliceCarousel.libTypesMod.Classnames.ROOT & String = js.native
    
    /* "alice-carousel__slide-info" */ val SLIDE_INFO: typings.reactAliceCarousel.libTypesMod.Classnames.SLIDE_INFO & String = js.native
    
    /* "alice-carousel__slide-info-item" */ val SLIDE_INFO_ITEM: typings.reactAliceCarousel.libTypesMod.Classnames.SLIDE_INFO_ITEM & String = js.native
    
    /* "alice-carousel__stage" */ val STAGE: typings.reactAliceCarousel.libTypesMod.Classnames.STAGE & String = js.native
    
    /* "alice-carousel__stage-item" */ val STAGE_ITEM: typings.reactAliceCarousel.libTypesMod.Classnames.STAGE_ITEM & String = js.native
    
    /* "alice-carousel__wrapper" */ val WRAPPER: typings.reactAliceCarousel.libTypesMod.Classnames.WRAPPER & String = js.native
  }
  
  @JSImport("react-alice-carousel", "ControlsStrategy")
  @js.native
  object ControlsStrategy extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactAliceCarousel.libTypesMod.ControlsStrategy & String] = js.native
    
    /* "alternate" */ val ALTERNATE: typings.reactAliceCarousel.libTypesMod.ControlsStrategy.ALTERNATE & String = js.native
    
    /* "default" */ val DEFAULT: typings.reactAliceCarousel.libTypesMod.ControlsStrategy.DEFAULT & String = js.native
    
    /* "responsive" */ val RESPONSIVE: typings.reactAliceCarousel.libTypesMod.ControlsStrategy.RESPONSIVE & String = js.native
  }
  
  @JSImport("react-alice-carousel", "EventType")
  @js.native
  object EventType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactAliceCarousel.libTypesMod.EventType & String] = js.native
    
    /* "action" */ val ACTION: typings.reactAliceCarousel.libTypesMod.EventType.ACTION & String = js.native
    
    /* "init" */ val INIT: typings.reactAliceCarousel.libTypesMod.EventType.INIT & String = js.native
    
    /* "resize" */ val RESIZE: typings.reactAliceCarousel.libTypesMod.EventType.RESIZE & String = js.native
    
    /* "update" */ val UPDATE: typings.reactAliceCarousel.libTypesMod.EventType.UPDATE & String = js.native
  }
  
  @JSImport("react-alice-carousel", "Modifiers")
  @js.native
  object Modifiers extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactAliceCarousel.libTypesMod.Modifiers & String] = js.native
    
    /* "__active" */ val ACTIVE: typings.reactAliceCarousel.libTypesMod.Modifiers.ACTIVE & String = js.native
    
    /* "__cloned" */ val CLONED: typings.reactAliceCarousel.libTypesMod.Modifiers.CLONED & String = js.native
    
    /* "__custom" */ val CUSTOM: typings.reactAliceCarousel.libTypesMod.Modifiers.CUSTOM & String = js.native
    
    /* "__inactive" */ val INACTIVE: typings.reactAliceCarousel.libTypesMod.Modifiers.INACTIVE & String = js.native
    
    /* "__pause" */ val PAUSE: typings.reactAliceCarousel.libTypesMod.Modifiers.PAUSE & String = js.native
    
    /* "__separator" */ val SEPARATOR: typings.reactAliceCarousel.libTypesMod.Modifiers.SEPARATOR & String = js.native
    
    /* "__ssr" */ val SSR: typings.reactAliceCarousel.libTypesMod.Modifiers.SSR & String = js.native
    
    /* "__target" */ val TARGET: typings.reactAliceCarousel.libTypesMod.Modifiers.TARGET & String = js.native
  }
  
  @js.native
  trait AliceCarousel extends PureComponent[Props, State, Any] {
    
    def _addEventListeners(): Unit = js.native
    
    def _cancelTimeoutAnimations(): Unit = js.native
    
    def _clearAutoPlayTimeout(): Unit = js.native
    
    def _clearSlideEndTimeout(): Unit = js.native
    
    def _clearTouchmovePosition(): Unit = js.native
    
    def _handleBeforeSlideEnd(): js.Promise[Unit] = js.native
    def _handleBeforeSlideEnd(eventType: EventType): js.Promise[Unit] = js.native
    
    def _handleBeforeTouchEnd(position: Double): Unit = js.native
    
    def _handleDotClick(index: Any): Unit = js.native
    
    def _handleKeyboardEvents(e: Any): `false` | Unit | js.Promise[Unit] = js.native
    
    def _handleMouseEnter(): Unit = js.native
    
    def _handleMouseLeave(): Unit = js.native
    
    def _handlePause(): Unit = js.native
    
    def _handlePlay(): Unit = js.native
    
    def _handlePlayPauseToggle(): js.Promise[Unit] = js.native
    
    def _handleResize(e: Event): js.Promise[Unit] = js.native
    
    /* private */ var _handleResizeDebounced: Any = js.native
    
    def _handleResized(): Unit = js.native
    
    def _handleSlideChange(): Unit = js.native
    def _handleSlideChange(eventType: EventType): Unit = js.native
    
    def _handleSlideChanged(): js.Promise[Unit] = js.native
    def _handleSlideChanged(eventType: EventType): js.Promise[Unit] = js.native
    
    def _handleSlideTo(hasActiveIndexFadeoutAnimationIndexFadeoutAnimationPositionEventType: SlideTo): js.Promise[Unit] = js.native
    
    def _handleTouchend(e: Any, hasDeltaX: EventData): Unit = js.native
    
    def _handleTouchmove(e: Any, eventData: EventData): Unit = js.native
    
    def _handleUpdateSlidePosition(activeIndex: Any): js.Promise[Unit] = js.native
    
    def _removeEventListeners(): Unit = js.native
    
    def _renderDotsNavigation(): Element = js.native
    
    def _renderNextButton(): Element = js.native
    
    def _renderPlayPauseButton(): Element = js.native
    
    def _renderPrevButton(): Element = js.native
    
    def _renderSlideInfo(): Element = js.native
    
    def _renderStageItem(item: Any, i: Double): Element = js.native
    
    def _setAutoPlayInterval(): Unit = js.native
    
    def _setInitialState(): js.Promise[Unit] = js.native
    
    def _setRootComponentRef(node: Any): Any = js.native
    
    def _setStageComponentRef(node: Any): Any = js.native
    
    def _setTouchmovePosition(): Unit = js.native
    
    def _setupSwipeHandlers(): Unit = js.native
    
    def _updateComponent(): Unit = js.native
    def _updateComponent(props: ReadonlyProps): Unit = js.native
    
    def _updateEventListeners(): Unit = js.native
    
    def _updateSwipeProps(): Unit = js.native
    
    /* private */ var autoPlayTimeoutId: Any = js.native
    
    /* private */ var cancelTouchAnimations: Any = js.native
    
    def clearTouchendTimeout(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MAliceCarousel(): js.Promise[Unit] = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MAliceCarousel(prevProps: ReadonlyProps, state: ReadonlyState): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MAliceCarousel(): Unit = js.native
    
    def eventObject: EventObject = js.native
    
    /* private */ var hasUserAction: Any = js.native
    
    /* private */ var isAnimationDisabled: Any = js.native
    
    def isFadeoutAnimationAllowed: Boolean = js.native
    
    /* private */ var isHovered: Any = js.native
    
    /* private */ var isTouchMoveProcessStarted: Any = js.native
    
    /* private */ var rootComponentDimensions: Any = js.native
    
    /* private */ var rootElement: Any = js.native
    
    /* private */ var slideEndTimeoutId: Any = js.native
    
    def slideNext(e: Any): Unit = js.native
    
    def slidePrev(e: Any): Unit = js.native
    
    def slideTo(): Unit = js.native
    def slideTo(activeIndex: Double): Unit = js.native
    def slideTo(activeIndex: Double, eventType: EventType): Unit = js.native
    def slideTo(activeIndex: Unit, eventType: EventType): Unit = js.native
    
    /* private */ var stageComponent: Any = js.native
    
    /* private */ var startTouchmovePosition: Any = js.native
    
    /* private */ var swipeListener: Any = js.native
    
    /* private */ var touchEndTimeoutId: Any = js.native
    
    def touchmovePosition: Double = js.native
  }
}
