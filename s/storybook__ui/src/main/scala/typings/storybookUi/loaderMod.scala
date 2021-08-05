package typings.storybookUi

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.storybookTheming.typesMod.Theme
import typings.storybookUi.anon.PickDetailedHTMLPropsHTML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loaderMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/Loader", "Contained")
  @js.native
  val Contained: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    PickDetailedHTMLPropsHTML, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Loader", "Loader")
  @js.native
  val Loader: FunctionComponent[LoaderProps] = js.native
  
  trait LoaderProps extends StObject {
    
    /**
      * The number of lines to display in the loader.
      * These are indented according to a pre-defined sequence of depths.
      */
    var size: Double
  }
  object LoaderProps {
    
    inline def apply(size: Double): LoaderProps = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoaderProps]
    }
    
    extension [Self <: LoaderProps](x: Self) {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
