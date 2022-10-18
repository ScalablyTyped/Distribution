package typings.reactToolbox

import typings.reactToolbox.componentsButtonBrowseButtonMod.BrowseButtonProps
import typings.reactToolbox.componentsButtonButtonMod.ButtonProps
import typings.reactToolbox.componentsButtonIconButtonMod.IconButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsButtonMod {
  
  @JSImport("react-toolbox/components/button", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.reactToolbox.componentsButtonButtonMod.Button {
    def this(props: ButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ButtonProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/button", "BrowseButton")
  @js.native
  open class BrowseButton protected ()
    extends typings.reactToolbox.componentsButtonBrowseButtonMod.BrowseButton {
    def this(props: BrowseButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BrowseButtonProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/button", "Button")
  @js.native
  open class Button protected ()
    extends typings.reactToolbox.componentsButtonButtonMod.Button {
    def this(props: ButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ButtonProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/button", "IconButton")
  @js.native
  open class IconButton protected ()
    extends typings.reactToolbox.componentsButtonIconButtonMod.IconButton {
    def this(props: IconButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IconButtonProps, context: Any) = this()
  }
}
