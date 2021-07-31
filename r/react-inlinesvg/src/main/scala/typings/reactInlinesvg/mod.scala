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
    @scala.inline
    def defaultProps_=(x: CacheRequests): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
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
    
    var getElement: js.Any = js.native
    
    var getNode: js.Any = js.native
    
    var handleCacheQueue: js.Any = js.native
    
    var handleError: js.Any = js.native
    
    var handleLoad: js.Any = js.native
    
    val hash: js.Any = js.native
    
    var isActive: js.Any = js.native
    
    var load: js.Any = js.native
    
    var processSVG: js.Any = js.native
    
    var request: js.Any = js.native
    
    var updateSVGAttributes: js.Any = js.native
  }
}
