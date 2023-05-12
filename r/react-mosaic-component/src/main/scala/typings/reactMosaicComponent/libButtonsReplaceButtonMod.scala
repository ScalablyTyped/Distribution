package typings.reactMosaicComponent

import typings.react.mod.Context
import typings.react.mod.PureComponent
import typings.reactMosaicComponent.libButtonsMosaicButtonMod.MosaicButtonProps
import typings.reactMosaicComponent.libContextTypesMod.MosaicWindowContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libButtonsReplaceButtonMod {
  
  @JSImport("react-mosaic-component/lib/buttons/ReplaceButton", "ReplaceButton")
  @js.native
  open class ReplaceButton protected ()
    extends PureComponent[MosaicButtonProps, js.Object, Any] {
    def this(props: MosaicButtonProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: MosaicButtonProps, context: Any) = this()
    
    @JSName("context")
    var context_ReplaceButton: MosaicWindowContext = js.native
    
    /* private */ var replace: Any = js.native
  }
  /* static members */
  object ReplaceButton {
    
    @JSImport("react-mosaic-component/lib/buttons/ReplaceButton", "ReplaceButton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-mosaic-component/lib/buttons/ReplaceButton", "ReplaceButton.contextType")
    @js.native
    def contextType: Context[MosaicWindowContext] = js.native
    inline def contextType_=(x: Context[MosaicWindowContext]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  }
}
