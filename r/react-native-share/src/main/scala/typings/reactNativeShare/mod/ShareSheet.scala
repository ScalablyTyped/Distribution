package typings.reactNativeShare.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-share", "ShareSheet")
@js.native
class ShareSheet protected ()
  extends Component[ShareSheetProps, js.Object, js.Any] {
  def this(props: ShareSheetProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: ShareSheetProps, context: js.Any) = this()
  
  def backButtonHandler(): Boolean = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MShareSheet(): Unit = js.native
  
  def componentWillUnMount(): Unit = js.native
}
