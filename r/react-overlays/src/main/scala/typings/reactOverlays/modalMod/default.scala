package typings.reactOverlays.modalMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.reactOverlays.anon.HandleContainerOverflow
import typings.reactOverlays.anon.PartialModalPropsRefAttri
import typings.reactOverlays.anon.WeakValidationMapModalPro
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-overlays/cjs/Modal", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * **NOTE**: Exotic components are not callable.
    */
  def apply(props: ModalProps with RefAttributes[ModalHandle]): ReactElement | Null = js.native
  
  @JSName("$$typeof")
  val DollarDollartypeof: js.Symbol = js.native
  
  var defaultProps: js.UndefOr[PartialModalPropsRefAttri] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapModalPro] = js.native
  
  @js.native
  class Manager ()
    extends typings.reactOverlays.modalManagerMod.default {
    def this(hasHideSiblingNodesHandleContainerOverflow: HandleContainerOverflow) = this()
  }
  @js.native
  object Manager
    extends TopLevel[
          Instantiable1[
            /* hasHideSiblingNodesHandleContainerOverflow */ js.UndefOr[HandleContainerOverflow], 
            typings.reactOverlays.modalManagerMod.default
          ]
        ]
}
