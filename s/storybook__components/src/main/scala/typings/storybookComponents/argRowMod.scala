package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.typesMod.ArgType
import typings.storybookComponents.typesMod.Args
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object argRowMod {
  
  @JSImport("@storybook/components/dist/blocks/ArgsTable/ArgRow", "ArgRow")
  @js.native
  val ArgRow: FC[ArgRowProps] = js.native
  
  trait ArgRowProps extends StObject {
    
    var arg: js.Any
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var expandable: js.UndefOr[Boolean] = js.undefined
    
    var initialExpandedArgs: js.UndefOr[Boolean] = js.undefined
    
    var row: ArgType
    
    var updateArgs: js.UndefOr[js.Function1[/* args */ Args, Unit]] = js.undefined
  }
  object ArgRowProps {
    
    inline def apply(arg: js.Any, row: ArgType): ArgRowProps = {
      val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgRowProps]
    }
    
    extension [Self <: ArgRowProps](x: Self) {
      
      inline def setArg(value: js.Any): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      inline def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
      
      inline def setInitialExpandedArgs(value: Boolean): Self = StObject.set(x, "initialExpandedArgs", value.asInstanceOf[js.Any])
      
      inline def setInitialExpandedArgsUndefined: Self = StObject.set(x, "initialExpandedArgs", js.undefined)
      
      inline def setRow(value: ArgType): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setUpdateArgs(value: /* args */ Args => Unit): Self = StObject.set(x, "updateArgs", js.Any.fromFunction1(value))
      
      inline def setUpdateArgsUndefined: Self = StObject.set(x, "updateArgs", js.undefined)
    }
  }
}
