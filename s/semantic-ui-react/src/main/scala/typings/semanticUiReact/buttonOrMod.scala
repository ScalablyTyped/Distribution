package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.StatelessComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonOrMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Button/ButtonOr", JSImport.Default)
  @js.native
  val default: StatelessComponent[ButtonOrProps] = js.native
  
  trait ButtonOrProps
    extends StObject
       with StrictButtonOrProps
       with /* key */ StringDictionary[js.Any]
  object ButtonOrProps {
    
    @scala.inline
    def apply(): ButtonOrProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonOrProps]
    }
  }
  
  trait StrictButtonOrProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Or buttons can have their text localized, or adjusted by using the text prop. */
    var text: js.UndefOr[Double | String] = js.undefined
  }
  object StrictButtonOrProps {
    
    @scala.inline
    def apply(): StrictButtonOrProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictButtonOrProps]
    }
    
    @scala.inline
    implicit class StrictButtonOrPropsMutableBuilder[Self <: StrictButtonOrProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setText(value: Double | String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type _To = StatelessComponent[ButtonOrProps]
  
  /* This means you don't have to write `default`, but can instead just say `buttonOrMod.foo` */
  override def _to: StatelessComponent[ButtonOrProps] = default
}
