package typings.rcTrigger

import org.scalablytyped.runtime.Shortcut
import typings.rcTrigger.mod.TriggerProps
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rc-trigger/es/mock", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[TriggerProps, js.Any, js.Any] {
    def this(props: TriggerProps) = this()
    def this(props: TriggerProps, context: js.Any) = this()
  }
  @JSImport("rc-trigger/es/mock", JSImport.Default)
  @js.native
  val default: ComponentClass[TriggerProps, js.Any] = js.native
  
  type _To = ComponentClass[TriggerProps, js.Any]
  
  /* This means you don't have to write `default`, but can instead just say `mockMod.foo` */
  override def _to: ComponentClass[TriggerProps, js.Any] = default
}
