package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.distCommonjsModulesRatingRatingIconMod.RatingIconProps
import typings.semanticUiReact.distCommonjsModulesRatingRatingMod.RatingComponent
import typings.semanticUiReact.distCommonjsModulesRatingRatingMod.RatingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesRatingMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Rating", JSImport.Default)
  @js.native
  open class default protected () extends Component[RatingProps, ComponentState, Any] {
    def this(props: RatingProps) = this()
    def this(props: RatingProps, context: Any) = this()
  }
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/modules/Rating", JSImport.Default)
    @js.native
    val ^ : RatingComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Rating", "default.Icon")
    @js.native
    open class Icon protected () extends Component[RatingIconProps, ComponentState, Any] {
      def this(props: RatingIconProps) = this()
      def this(props: RatingIconProps, context: Any) = this()
    }
    
    type _To = RatingComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: RatingComponent = ^
  }
}
