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
  class default protected () extends InlineSVG {
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
  trait InlineSVG
    extends PureComponent[Props, State, js.Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MInlineSVG(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MInlineSVG(prevProps: Props, prevState: State): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MInlineSVG(): Unit = js.native
    
    /* private */ var getElement: js.Any = js.native
    
    /* private */ var getNode: js.Any = js.native
    
    /* private */ var handleCacheQueue: js.Any = js.native
    
    /* private */ var handleError: js.Any = js.native
    
    /* private */ var handleLoad: js.Any = js.native
    
    /* private */ val hash: js.Any = js.native
    
    /* private */ var isActive: js.Any = js.native
    
    /* private */ var load: js.Any = js.native
    
    /* private */ var processSVG: js.Any = js.native
    
    /* private */ var request: js.Any = js.native
    
    /* private */ var updateSVGAttributes: js.Any = js.native
  }
}
