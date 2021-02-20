package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.typesMod.ArgType
import typings.storybookComponents.typesMod.Args
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object argRowMod {
  
  @JSImport("@storybook/components/dist/blocks/ArgsTable/ArgRow", "ArgRow")
  @js.native
  val ArgRow: FC[ArgRowProps] = js.native
  
  @js.native
  trait ArgRowProps extends StObject {
    
    var arg: js.Any = js.native
    
    var compact: js.UndefOr[Boolean] = js.native
    
    var expandable: js.UndefOr[Boolean] = js.native
    
    var initialExpandedArgs: js.UndefOr[Boolean] = js.native
    
    var row: ArgType = js.native
    
    var updateArgs: js.UndefOr[js.Function1[/* args */ Args, Unit]] = js.native
  }
  object ArgRowProps {
    
    @scala.inline
    def apply(arg: js.Any, row: ArgType): ArgRowProps = {
      val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgRowProps]
    }
    
    @scala.inline
    implicit class ArgRowPropsMutableBuilder[Self <: ArgRowProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArg(value: js.Any): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
      
      @scala.inline
      def setInitialExpandedArgs(value: Boolean): Self = StObject.set(x, "initialExpandedArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialExpandedArgsUndefined: Self = StObject.set(x, "initialExpandedArgs", js.undefined)
      
      @scala.inline
      def setRow(value: ArgType): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateArgs(value: /* args */ Args => Unit): Self = StObject.set(x, "updateArgs", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdateArgsUndefined: Self = StObject.set(x, "updateArgs", js.undefined)
    }
  }
}
