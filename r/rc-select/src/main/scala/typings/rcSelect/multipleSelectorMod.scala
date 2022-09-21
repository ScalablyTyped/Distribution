package typings.rcSelect

import org.scalablytyped.runtime.Shortcut
import typings.rcSelect.baseSelectMod.CustomTagProps
import typings.rcSelect.baseSelectMod.DisplayValueType
import typings.rcSelect.baseSelectMod.RenderNode
import typings.rcSelect.rcSelectStrings.responsive
import typings.rcSelect.selectorMod.InnerSelectorProps
import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multipleSelectorMod extends Shortcut {
  
  @JSImport("rc-select/lib/Selector/MultipleSelector", JSImport.Default)
  @js.native
  val default: FC[SelectorProps] = js.native
  
  @js.native
  trait SelectorProps
    extends StObject
       with InnerSelectorProps {
    
    var choiceTransitionName: js.UndefOr[String] = js.native
    
    var maxTagCount: js.UndefOr[Double | responsive] = js.native
    
    var maxTagPlaceholder: js.UndefOr[
        ReactNode | (js.Function1[/* omittedValues */ js.Array[DisplayValueType], ReactNode])
      ] = js.native
    
    var maxTagTextLength: js.UndefOr[Double] = js.native
    
    def onRemove(value: DisplayValueType): Unit = js.native
    
    def onToggleOpen(): Unit = js.native
    def onToggleOpen(open: Boolean): Unit = js.native
    
    var removeIcon: js.UndefOr[RenderNode] = js.native
    
    var tagRender: js.UndefOr[js.Function1[/* props */ CustomTagProps, ReactElement]] = js.native
    
    var tokenSeparators: js.UndefOr[js.Array[String]] = js.native
  }
  
  type _To = FC[SelectorProps]
  
  /* This means you don't have to write `default`, but can instead just say `multipleSelectorMod.foo` */
  override def _to: FC[SelectorProps] = default
}
