package typings.storybookComponents

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.TableHTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLTableElement
import typings.storybookComponents.anon.Compact
import typings.storybookComponents.argsTableArgsTableMod.ArgsTableProps
import typings.storybookComponents.tabbedArgsTableMod.TabbedArgsTableProps
import typings.storybookTheming.typesMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/components/dist/blocks/ArgsTable", JSImport.Namespace)
@js.native
object argsTableMod extends js.Object {
  
  val ArgsTable: FC[ArgsTableProps] = js.native
  
  def NoControlsWarning(): Element = js.native
  
  val TabbedArgsTable: FC[TabbedArgsTableProps] = js.native
  
  val TableWrapper: StyledComponent[
    DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement], 
    Compact, 
    Theme
  ] = js.native
  
  @js.native
  object ArgsTableError extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.storybookComponents.argsTableArgsTableMod.ArgsTableError with String] = js.native
    
    /* "Args unsupported. See Args documentation for your framework." */ val ARGS_UNSUPPORTED: typings.storybookComponents.argsTableArgsTableMod.ArgsTableError.ARGS_UNSUPPORTED with String = js.native
    
    /* "No component found." */ val NO_COMPONENT: typings.storybookComponents.argsTableArgsTableMod.ArgsTableError.NO_COMPONENT with String = js.native
  }
}
