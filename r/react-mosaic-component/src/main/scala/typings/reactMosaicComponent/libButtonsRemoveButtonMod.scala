package typings.reactMosaicComponent

import typings.react.mod.Context
import typings.react.mod.PureComponent
import typings.reactMosaicComponent.libButtonsMosaicButtonMod.MosaicButtonProps
import typings.reactMosaicComponent.libContextTypesMod.MosaicWindowContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libButtonsRemoveButtonMod {
  
  @JSImport("react-mosaic-component/lib/buttons/RemoveButton", "RemoveButton")
  @js.native
  open class RemoveButton protected ()
    extends PureComponent[MosaicButtonProps, js.Object, Any] {
    def this(props: MosaicButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MosaicButtonProps, context: Any) = this()
    
    @JSName("context")
    var context_RemoveButton: MosaicWindowContext = js.native
    
    /* private */ var createRemove: Any = js.native
  }
  /* static members */
  object RemoveButton {
    
    @JSImport("react-mosaic-component/lib/buttons/RemoveButton", "RemoveButton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-mosaic-component/lib/buttons/RemoveButton", "RemoveButton.contextType")
    @js.native
    def contextType: Context[MosaicWindowContext] = js.native
    inline def contextType_=(x: Context[MosaicWindowContext]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  }
}
