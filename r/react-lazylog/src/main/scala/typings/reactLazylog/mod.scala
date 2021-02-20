package typings.reactLazylog

import typings.reactLazylog.anon.PartialLazyLogProps
import typings.reactLazylog.lazyLogMod.LazyLogProps
import typings.reactLazylog.scrollFollowMod.ScrollFollowProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-lazylog", "LazyLog")
  @js.native
  class LazyLog protected ()
    extends typings.reactLazylog.lazyLogMod.LazyLog {
    def this(props: LazyLogProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LazyLogProps, context: js.Any) = this()
  }
  /* static members */
  object LazyLog {
    
    @JSImport("react-lazylog", "LazyLog")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-lazylog", "LazyLog.defaultProps")
    @js.native
    def defaultProps: PartialLazyLogProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialLazyLogProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-lazylog", "ScrollFollow")
  @js.native
  class ScrollFollow protected ()
    extends typings.reactLazylog.scrollFollowMod.ScrollFollow {
    def this(props: ScrollFollowProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollFollowProps, context: js.Any) = this()
  }
}
