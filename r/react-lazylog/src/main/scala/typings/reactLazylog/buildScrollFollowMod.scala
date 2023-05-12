package typings.reactLazylog

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactLazylog.anon.ClientHeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildScrollFollowMod {
  
  @JSImport("react-lazylog/build/ScrollFollow", JSImport.Default)
  @js.native
  open class default protected () extends ScrollFollow {
    def this(props: ScrollFollowProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollFollowProps, context: Any) = this()
  }
  
  @JSImport("react-lazylog/build/ScrollFollow", "ScrollFollow")
  @js.native
  open class ScrollFollow protected ()
    extends Component[ScrollFollowProps, js.Object, Any] {
    def this(props: ScrollFollowProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollFollowProps, context: Any) = this()
  }
  
  trait ScrollFollowProps extends StObject {
    
    def render(props: ScrollFollowRenderProps): ReactNode
    
    var startFollowing: js.UndefOr[Boolean] = js.undefined
  }
  object ScrollFollowProps {
    
    inline def apply(render: ScrollFollowRenderProps => ReactNode): ScrollFollowProps = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
      __obj.asInstanceOf[ScrollFollowProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollFollowProps] (val x: Self) extends AnyVal {
      
      inline def setRender(value: ScrollFollowRenderProps => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setStartFollowing(value: Boolean): Self = StObject.set(x, "startFollowing", value.asInstanceOf[js.Any])
      
      inline def setStartFollowingUndefined: Self = StObject.set(x, "startFollowing", js.undefined)
    }
  }
  
  trait ScrollFollowRenderProps extends StObject {
    
    var follow: Boolean
    
    def onScroll(args: ClientHeight): Unit
    
    def startFollowing(): Unit
    
    def stopFollowing(): Unit
  }
  object ScrollFollowRenderProps {
    
    inline def apply(
      follow: Boolean,
      onScroll: ClientHeight => Unit,
      startFollowing: () => Unit,
      stopFollowing: () => Unit
    ): ScrollFollowRenderProps = {
      val __obj = js.Dynamic.literal(follow = follow.asInstanceOf[js.Any], onScroll = js.Any.fromFunction1(onScroll), startFollowing = js.Any.fromFunction0(startFollowing), stopFollowing = js.Any.fromFunction0(stopFollowing))
      __obj.asInstanceOf[ScrollFollowRenderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollFollowRenderProps] (val x: Self) extends AnyVal {
      
      inline def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      inline def setOnScroll(value: ClientHeight => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setStartFollowing(value: () => Unit): Self = StObject.set(x, "startFollowing", js.Any.fromFunction0(value))
      
      inline def setStopFollowing(value: () => Unit): Self = StObject.set(x, "stopFollowing", js.Any.fromFunction0(value))
    }
  }
}
