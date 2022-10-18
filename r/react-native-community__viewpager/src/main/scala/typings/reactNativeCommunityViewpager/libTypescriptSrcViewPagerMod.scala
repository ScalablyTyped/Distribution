package typings.reactNativeCommunityViewpager

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.reactNativeCommunityViewpager.libTypescriptSrcTypesMod.ViewPagerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcViewPagerMod {
  
  @JSImport("@react-native-community/viewpager/lib/typescript/src/ViewPager", "ViewPager")
  @js.native
  open class ViewPager protected ()
    extends Component[ViewPagerProps, js.Object, Any] {
    def this(props: ViewPagerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ViewPagerProps, context: Any) = this()
    
    /* private */ var _onMoveShouldSetResponderCapture: Any = js.native
    
    /* private */ var _onPageScroll: Any = js.native
    
    /* private */ var _onPageScrollStateChanged: Any = js.native
    
    /* private */ var _onPageSelected: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MViewPager(): Unit = js.native
    
    def getInnerViewNode(): ReactElement = js.native
    
    /* private */ var isScrolling: Any = js.native
    
    /**
      * A helper function to scroll to a specific page in the ViewPager.
      * The transition between pages will be animated.
      */
    def setPage(selectedPage: Double): Unit = js.native
    
    /**
      * A helper function to scroll to a specific page in the ViewPager.
      * The transition between pages will *not* be animated.
      */
    def setPageWithoutAnimation(selectedPage: Double): Unit = js.native
    
    /**
      * A helper function to enable/disable scroll imperatively
      * The recommended way is using the scrollEnabled prop, however, there might be a case where a
      * imperative solution is more useful (e.g. for not blocking an animation)
      */
    def setScrollEnabled(scrollEnabled: Boolean): Unit = js.native
    
    /* private */ var viewPager: Any = js.native
  }
}
