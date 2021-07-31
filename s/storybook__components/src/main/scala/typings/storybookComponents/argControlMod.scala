package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.typesMod.ArgType
import typings.storybookComponents.typesMod.Args
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object argControlMod {
  
  @JSImport("@storybook/components/dist/blocks/ArgsTable/ArgControl", "ArgControl")
  @js.native
  val ArgControl: FC[ArgControlProps] = js.native
  
  trait ArgControlProps extends StObject {
    
    var arg: js.Any
    
    var row: ArgType
    
    def updateArgs(args: Args): Unit
  }
  object ArgControlProps {
    
    @scala.inline
    def apply(arg: js.Any, row: ArgType, updateArgs: Args => Unit): ArgControlProps = {
      val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], updateArgs = js.Any.fromFunction1(updateArgs))
      __obj.asInstanceOf[ArgControlProps]
    }
    
    @scala.inline
    implicit class ArgControlPropsMutableBuilder[Self <: ArgControlProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArg(value: js.Any): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRow(value: ArgType): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateArgs(value: Args => Unit): Self = StObject.set(x, "updateArgs", js.Any.fromFunction1(value))
    }
  }
}
