package typings.reactVirtualized

import typings.reactVirtualized.anon.IsRowLoaded
import typings.reactVirtualized.anon.MinimumBatchSize
import typings.reactVirtualized.esInfiniteLoaderMod.InfiniteLoaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infiniteLoaderMod {
  
  @JSImport("react-virtualized/dist/commonjs/InfiniteLoader", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.reactVirtualized.esInfiniteLoaderMod.InfiniteLoader {
    def this(props: InfiniteLoaderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: InfiniteLoaderProps, context: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-virtualized/dist/commonjs/InfiniteLoader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/commonjs/InfiniteLoader", "default.defaultProps")
    @js.native
    def defaultProps: MinimumBatchSize = js.native
    inline def defaultProps_=(x: MinimumBatchSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-virtualized/dist/commonjs/InfiniteLoader", "default.propTypes")
    @js.native
    def propTypes: IsRowLoaded = js.native
    inline def propTypes_=(x: IsRowLoaded): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-virtualized/dist/commonjs/InfiniteLoader", "InfiniteLoader")
  @js.native
  open class InfiniteLoader protected ()
    extends typings.reactVirtualized.esInfiniteLoaderMod.InfiniteLoader {
    def this(props: InfiniteLoaderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: InfiniteLoaderProps, context: Any) = this()
  }
  /* static members */
  object InfiniteLoader {
    
    @JSImport("react-virtualized/dist/commonjs/InfiniteLoader", "InfiniteLoader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/commonjs/InfiniteLoader", "InfiniteLoader.defaultProps")
    @js.native
    def defaultProps: MinimumBatchSize = js.native
    inline def defaultProps_=(x: MinimumBatchSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-virtualized/dist/commonjs/InfiniteLoader", "InfiniteLoader.propTypes")
    @js.native
    def propTypes: IsRowLoaded = js.native
    inline def propTypes_=(x: IsRowLoaded): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
