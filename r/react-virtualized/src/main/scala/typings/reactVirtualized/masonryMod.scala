package typings.reactVirtualized

import typings.reactVirtualized.anon.KeyMapper
import typings.reactVirtualized.esMasonryMod.MasonryProps
import typings.reactVirtualized.esMasonryMod.MasonryState
import typings.reactVirtualized.esMasonryMod.Positioner
import typings.reactVirtualized.esMasonryMod.createCellPositionerParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object masonryMod {
  
  @JSImport("react-virtualized/dist/commonjs/Masonry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-virtualized/dist/commonjs/Masonry", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.reactVirtualized.esMasonryMod.Masonry {
    def this(props: MasonryProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MasonryProps, context: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-virtualized/dist/commonjs/Masonry", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/commonjs/Masonry", "default.defaultProps")
    @js.native
    def defaultProps: KeyMapper = js.native
    inline def defaultProps_=(x: KeyMapper): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(nextProps: MasonryProps, prevState: MasonryState): MasonryState | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[MasonryState | Null]
  }
  
  @JSImport("react-virtualized/dist/commonjs/Masonry", "DEFAULT_SCROLLING_RESET_TIME_INTERVAL")
  @js.native
  val DEFAULT_SCROLLING_RESET_TIME_INTERVAL: /* 150 */ Double = js.native
  
  @JSImport("react-virtualized/dist/commonjs/Masonry", "Masonry")
  @js.native
  open class Masonry protected ()
    extends typings.reactVirtualized.esMasonryMod.Masonry {
    def this(props: MasonryProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MasonryProps, context: Any) = this()
  }
  /* static members */
  object Masonry {
    
    @JSImport("react-virtualized/dist/commonjs/Masonry", "Masonry")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/commonjs/Masonry", "Masonry.defaultProps")
    @js.native
    def defaultProps: KeyMapper = js.native
    inline def defaultProps_=(x: KeyMapper): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(nextProps: MasonryProps, prevState: MasonryState): MasonryState | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[MasonryState | Null]
  }
  
  inline def createCellPositioner(params: createCellPositionerParams): Positioner = ^.asInstanceOf[js.Dynamic].applyDynamic("createCellPositioner")(params.asInstanceOf[js.Any]).asInstanceOf[Positioner]
}
