package typings.reactOverlays.esmModalMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.reactOverlays.anon.HandleContainerOverflow
import typings.reactOverlays.anon.PartialModalPropsRefAttriAutoFocus
import typings.reactOverlays.anon.WeakValidationMapModalProAutoFocus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-overlays/esm/Modal", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * **NOTE**: Exotic components are not callable.
    */
  def apply(props: ModalProps with RefAttributes[ModalHandle]): ReactElement | Null = js.native
  
  @JSName("$$typeof")
  val DollarDollartypeof: js.Symbol = js.native
  
  var defaultProps: js.UndefOr[PartialModalPropsRefAttriAutoFocus] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapModalProAutoFocus] = js.native
  
  @js.native
  class Manager ()
    extends typings.reactOverlays.esmModalManagerMod.default {
    def this(hasHideSiblingNodesHandleContainerOverflow: HandleContainerOverflow) = this()
  }
  @js.native
  object Manager
    extends TopLevel[
          Instantiable1[
            /* hasHideSiblingNodesHandleContainerOverflow */ js.UndefOr[HandleContainerOverflow], 
            typings.reactOverlays.esmModalManagerMod.default
          ]
        ]
}
