package typings.reactInlinesvg

import typings.react.mod.PureComponent
import typings.reactInlinesvg.anon.CacheRequests
import typings.reactInlinesvg.typesMod.Props
import typings.reactInlinesvg.typesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-inlinesvg", JSImport.Default)
  @js.native
  open class default protected () extends InlineSVG {
    def this(props: Props) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-inlinesvg", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-inlinesvg", "default.defaultProps")
    @js.native
    def defaultProps: CacheRequests = js.native
    inline def defaultProps_=(x: CacheRequests): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait InlineSVG extends PureComponent[Props, State, Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MInlineSVG(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MInlineSVG(previousProps: Props, previousState: State): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MInlineSVG(): Unit = js.native
    
    /* private */ var getElement: Any = js.native
    
    /* private */ var getNode: Any = js.native
    
    /* private */ var handleError: Any = js.native
    
    /* private */ var handleLoad: Any = js.native
    
    /* private */ val hash: Any = js.native
    
    /* private */ var isActive: Any = js.native
    
    /* private */ var isInitialized: Any = js.native
    
    /* private */ var load: Any = js.native
    
    /* private */ var processSVG: Any = js.native
    
    /* private */ var request: Any = js.native
    
    /* private */ var updateSVGAttributes: Any = js.native
  }
}
