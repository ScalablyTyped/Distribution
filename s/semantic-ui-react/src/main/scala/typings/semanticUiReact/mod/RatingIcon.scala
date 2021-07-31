package typings.semanticUiReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.semanticUiReact.mod.^
import typings.semanticUiReact.ratingIconMod.RatingIconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "RatingIcon")
@js.native
class RatingIcon protected ()
  extends Component[RatingIconProps, ComponentState, js.Any] {
  def this(props: RatingIconProps) = this()
  def this(props: RatingIconProps, context: js.Any) = this()
}
object RatingIcon {
  
  @scala.inline
  def apply: ComponentClass[RatingIconProps, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("RatingIcon").asInstanceOf[ComponentClass[RatingIconProps, ComponentState]]
}
