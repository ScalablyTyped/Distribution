package typings.reactLazylog

import typings.reactLazylog.anon.PartialLazyLogProps
import typings.reactLazylog.buildLazyLogMod.LazyLogProps
import typings.reactLazylog.buildScrollFollowMod.ScrollFollowProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-lazylog", "LazyLog")
  @js.native
  open class LazyLog protected ()
    extends typings.reactLazylog.buildLazyLogMod.LazyLog {
    def this(props: LazyLogProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: LazyLogProps, context: Any) = this()
  }
  /* static members */
  object LazyLog {
    
    @JSImport("react-lazylog", "LazyLog")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-lazylog", "LazyLog.defaultProps")
    @js.native
    def defaultProps: PartialLazyLogProps = js.native
    inline def defaultProps_=(x: PartialLazyLogProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-lazylog", "ScrollFollow")
  @js.native
  open class ScrollFollow protected ()
    extends typings.reactLazylog.buildScrollFollowMod.ScrollFollow {
    def this(props: ScrollFollowProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollFollowProps, context: Any) = this()
  }
}
