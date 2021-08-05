package typings.storybookComponents

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.TableHTMLAttributes
import typings.std.HTMLTableElement
import typings.storybookComponents.anon.Compact
import typings.storybookComponents.typesMod.ArgTypes
import typings.storybookComponents.typesMod.Args
import typings.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object argsTableArgsTableMod {
  
  @JSImport("@storybook/components/dist/blocks/ArgsTable/ArgsTable", "ArgsTable")
  @js.native
  val ArgsTable: FC[ArgsTableProps] = js.native
  
  @js.native
  sealed trait ArgsTableError extends StObject
  @JSImport("@storybook/components/dist/blocks/ArgsTable/ArgsTable", "ArgsTableError")
  @js.native
  object ArgsTableError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ArgsTableError & String] = js.native
    
    @js.native
    sealed trait ARGS_UNSUPPORTED
      extends StObject
         with ArgsTableError
    /* "Args unsupported. See Args documentation for your framework." */ val ARGS_UNSUPPORTED: typings.storybookComponents.argsTableArgsTableMod.ArgsTableError.ARGS_UNSUPPORTED & String = js.native
    
    @js.native
    sealed trait NO_COMPONENT
      extends StObject
         with ArgsTableError
    /* "No component found." */ val NO_COMPONENT: typings.storybookComponents.argsTableArgsTableMod.ArgsTableError.NO_COMPONENT & String = js.native
  }
  
  @JSImport("@storybook/components/dist/blocks/ArgsTable/ArgsTable", "TableWrapper")
  @js.native
  val TableWrapper: StyledComponent[
    DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement], 
    Compact, 
    Theme
  ] = js.native
  
  trait ArgsTableErrorProps
    extends StObject
       with ArgsTableProps {
    
    var error: ArgsTableError
  }
  object ArgsTableErrorProps {
    
    inline def apply(error: ArgsTableError): ArgsTableErrorProps = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgsTableErrorProps]
    }
    
    extension [Self <: ArgsTableErrorProps](x: Self) {
      
      inline def setError(value: ArgsTableError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookComponents.argsTableArgsTableMod.ArgsTableRowProps
    - typings.storybookComponents.argsTableArgsTableMod.ArgsTableErrorProps
  */
  trait ArgsTableProps extends StObject
  object ArgsTableProps {
    
    inline def ArgsTableErrorProps(error: ArgsTableError): typings.storybookComponents.argsTableArgsTableMod.ArgsTableErrorProps = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.storybookComponents.argsTableArgsTableMod.ArgsTableErrorProps]
    }
    
    inline def ArgsTableRowProps(rows: ArgTypes): typings.storybookComponents.argsTableArgsTableMod.ArgsTableRowProps = {
      val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.storybookComponents.argsTableArgsTableMod.ArgsTableRowProps]
    }
  }
  
  trait ArgsTableRowProps
    extends StObject
       with ArgsTableProps {
    
    var args: js.UndefOr[Args] = js.undefined
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var inAddonPanel: js.UndefOr[Boolean] = js.undefined
    
    var initialExpandedArgs: js.UndefOr[Boolean] = js.undefined
    
    var resetArgs: js.UndefOr[js.Function1[/* argNames */ js.UndefOr[js.Array[String]], Unit]] = js.undefined
    
    var rows: ArgTypes
    
    var updateArgs: js.UndefOr[js.Function1[/* args */ Args, Unit]] = js.undefined
  }
  object ArgsTableRowProps {
    
    inline def apply(rows: ArgTypes): ArgsTableRowProps = {
      val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgsTableRowProps]
    }
    
    extension [Self <: ArgsTableRowProps](x: Self) {
      
      inline def setArgs(value: Args): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setInAddonPanel(value: Boolean): Self = StObject.set(x, "inAddonPanel", value.asInstanceOf[js.Any])
      
      inline def setInAddonPanelUndefined: Self = StObject.set(x, "inAddonPanel", js.undefined)
      
      inline def setInitialExpandedArgs(value: Boolean): Self = StObject.set(x, "initialExpandedArgs", value.asInstanceOf[js.Any])
      
      inline def setInitialExpandedArgsUndefined: Self = StObject.set(x, "initialExpandedArgs", js.undefined)
      
      inline def setResetArgs(value: /* argNames */ js.UndefOr[js.Array[String]] => Unit): Self = StObject.set(x, "resetArgs", js.Any.fromFunction1(value))
      
      inline def setResetArgsUndefined: Self = StObject.set(x, "resetArgs", js.undefined)
      
      inline def setRows(value: ArgTypes): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setUpdateArgs(value: /* args */ Args => Unit): Self = StObject.set(x, "updateArgs", js.Any.fromFunction1(value))
      
      inline def setUpdateArgsUndefined: Self = StObject.set(x, "updateArgs", js.undefined)
    }
  }
}
