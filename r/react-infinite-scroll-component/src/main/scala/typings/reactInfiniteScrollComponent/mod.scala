package typings.reactInfiniteScrollComponent

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactInfiniteScrollComponent.anon.PrevDataLength
import typings.std.EventListener
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-infinite-scroll-component", JSImport.Default)
  @js.native
  open class default protected () extends InfiniteScroll {
    def this(props: Props) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-infinite-scroll-component", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDerivedStateFromProps(nextProps: Props, prevState: State): PrevDataLength | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[PrevDataLength | Null]
  }
  
  type Fn = js.Function0[Any]
  
  @js.native
  trait InfiniteScroll extends Component[Props, State, Any] {
    
    /* private */ var _infScroll: Any = js.native
    
    /* private */ var _pullDown: Any = js.native
    
    /* private */ var _scrollableNode: Any = js.native
    
    /* private */ var actionTriggered: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MInfiniteScroll(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MInfiniteScroll(prevProps: Props): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MInfiniteScroll(): Unit = js.native
    
    /* private */ var currentY: Any = js.native
    
    /* private */ var dragging: Any = js.native
    
    /* private */ var el: Any = js.native
    
    def getScrollableTarget(): HTMLElement | Null = js.native
    
    def isElementAtBottom(target: HTMLElement): Boolean = js.native
    def isElementAtBottom(target: HTMLElement, scrollThreshold: String): Boolean = js.native
    def isElementAtBottom(target: HTMLElement, scrollThreshold: Double): Boolean = js.native
    
    def isElementAtTop(target: HTMLElement): Boolean = js.native
    def isElementAtTop(target: HTMLElement, scrollThreshold: String): Boolean = js.native
    def isElementAtTop(target: HTMLElement, scrollThreshold: Double): Boolean = js.native
    
    /* private */ var lastScrollTop: Any = js.native
    
    /* private */ var maxPullDownDistance: Any = js.native
    
    var onEnd: EventListener = js.native
    
    var onMove: EventListener = js.native
    
    def onScrollListener(event: MouseEvent): Unit = js.native
    
    var onStart: EventListener = js.native
    
    /* private */ var startY: Any = js.native
    
    /* private */ var throttledOnScrollListener: Any = js.native
  }
  
  trait Props extends StObject {
    
    var children: ReactNode
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataLength: Double
    
    var endMessage: js.UndefOr[ReactNode] = js.undefined
    
    var hasChildren: js.UndefOr[Boolean] = js.undefined
    
    var hasMore: Boolean
    
    var height: js.UndefOr[Double | String] = js.undefined
    
    var initialScrollY: js.UndefOr[Double] = js.undefined
    
    var inverse: js.UndefOr[Boolean] = js.undefined
    
    var loader: ReactNode
    
    var next: Fn
    
    var onScroll: js.UndefOr[js.Function1[/* e */ MouseEvent, Any]] = js.undefined
    
    var pullDownToRefresh: js.UndefOr[Boolean] = js.undefined
    
    var pullDownToRefreshContent: js.UndefOr[ReactNode] = js.undefined
    
    var pullDownToRefreshThreshold: js.UndefOr[Double] = js.undefined
    
    var refreshFunction: js.UndefOr[Fn] = js.undefined
    
    var releaseToRefreshContent: js.UndefOr[ReactNode] = js.undefined
    
    var scrollThreshold: js.UndefOr[Double | String] = js.undefined
    
    var scrollableTarget: js.UndefOr[ReactNode] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object Props {
    
    inline def apply(dataLength: Double, hasMore: Boolean, next: () => Any): Props = {
      val __obj = js.Dynamic.literal(dataLength = dataLength.asInstanceOf[js.Any], hasMore = hasMore.asInstanceOf[js.Any], next = js.Any.fromFunction0(next))
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataLength(value: Double): Self = StObject.set(x, "dataLength", value.asInstanceOf[js.Any])
      
      inline def setEndMessage(value: ReactNode): Self = StObject.set(x, "endMessage", value.asInstanceOf[js.Any])
      
      inline def setEndMessageUndefined: Self = StObject.set(x, "endMessage", js.undefined)
      
      inline def setHasChildren(value: Boolean): Self = StObject.set(x, "hasChildren", value.asInstanceOf[js.Any])
      
      inline def setHasChildrenUndefined: Self = StObject.set(x, "hasChildren", js.undefined)
      
      inline def setHasMore(value: Boolean): Self = StObject.set(x, "hasMore", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInitialScrollY(value: Double): Self = StObject.set(x, "initialScrollY", value.asInstanceOf[js.Any])
      
      inline def setInitialScrollYUndefined: Self = StObject.set(x, "initialScrollY", js.undefined)
      
      inline def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      inline def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      inline def setLoader(value: ReactNode): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      inline def setNext(value: () => Any): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      inline def setOnScroll(value: /* e */ MouseEvent => Any): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setPullDownToRefresh(value: Boolean): Self = StObject.set(x, "pullDownToRefresh", value.asInstanceOf[js.Any])
      
      inline def setPullDownToRefreshContent(value: ReactNode): Self = StObject.set(x, "pullDownToRefreshContent", value.asInstanceOf[js.Any])
      
      inline def setPullDownToRefreshContentUndefined: Self = StObject.set(x, "pullDownToRefreshContent", js.undefined)
      
      inline def setPullDownToRefreshThreshold(value: Double): Self = StObject.set(x, "pullDownToRefreshThreshold", value.asInstanceOf[js.Any])
      
      inline def setPullDownToRefreshThresholdUndefined: Self = StObject.set(x, "pullDownToRefreshThreshold", js.undefined)
      
      inline def setPullDownToRefreshUndefined: Self = StObject.set(x, "pullDownToRefresh", js.undefined)
      
      inline def setRefreshFunction(value: () => Any): Self = StObject.set(x, "refreshFunction", js.Any.fromFunction0(value))
      
      inline def setRefreshFunctionUndefined: Self = StObject.set(x, "refreshFunction", js.undefined)
      
      inline def setReleaseToRefreshContent(value: ReactNode): Self = StObject.set(x, "releaseToRefreshContent", value.asInstanceOf[js.Any])
      
      inline def setReleaseToRefreshContentUndefined: Self = StObject.set(x, "releaseToRefreshContent", js.undefined)
      
      inline def setScrollThreshold(value: Double | String): Self = StObject.set(x, "scrollThreshold", value.asInstanceOf[js.Any])
      
      inline def setScrollThresholdUndefined: Self = StObject.set(x, "scrollThreshold", js.undefined)
      
      inline def setScrollableTarget(value: ReactNode): Self = StObject.set(x, "scrollableTarget", value.asInstanceOf[js.Any])
      
      inline def setScrollableTargetUndefined: Self = StObject.set(x, "scrollableTarget", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait State extends StObject {
    
    var prevDataLength: js.UndefOr[Double] = js.undefined
    
    var pullToRefreshThresholdBreached: Boolean
    
    var showLoader: Boolean
  }
  object State {
    
    inline def apply(pullToRefreshThresholdBreached: Boolean, showLoader: Boolean): State = {
      val __obj = js.Dynamic.literal(pullToRefreshThresholdBreached = pullToRefreshThresholdBreached.asInstanceOf[js.Any], showLoader = showLoader.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setPrevDataLength(value: Double): Self = StObject.set(x, "prevDataLength", value.asInstanceOf[js.Any])
      
      inline def setPrevDataLengthUndefined: Self = StObject.set(x, "prevDataLength", js.undefined)
      
      inline def setPullToRefreshThresholdBreached(value: Boolean): Self = StObject.set(x, "pullToRefreshThresholdBreached", value.asInstanceOf[js.Any])
      
      inline def setShowLoader(value: Boolean): Self = StObject.set(x, "showLoader", value.asInstanceOf[js.Any])
    }
  }
}
