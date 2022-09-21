package typings.semanticUiReact.mod

import typings.fluentuiReactComponentRef.refMod.RefProps
import typings.fluentuiReactComponentRef.refMod.RefState
import typings.semanticUiReact.anon.ReadonlyRefProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semantic-ui-react", "Ref")
@js.native
open class Ref protected ()
  extends typings.fluentuiReactComponentRef.mod.Ref {
  def this(props: RefProps) = this()
  def this(props: ReadonlyRefProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: RefProps, context: Any) = this()
}
/* static members */
object Ref {
  
  @JSImport("semantic-ui-react", "Ref")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDerivedStateFromProps(props: RefProps): RefState = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any]).asInstanceOf[RefState]
}
