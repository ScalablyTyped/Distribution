package typings.storybookComponents

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.TableHTMLAttributes
import typings.std.HTMLTableElement
import typings.storybookComponents.anon.PickDetailedHTMLPropsTabl
import typings.storybookComponents.typesMod.JsDocTags
import typings.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object argJsDocMod {
  
  @JSImport("@storybook/components/dist/blocks/ArgsTable/ArgJsDoc", "ArgJsDoc")
  @js.native
  val ArgJsDoc: FC[ArgJsDocArgs] = js.native
  
  @JSImport("@storybook/components/dist/blocks/ArgsTable/ArgJsDoc", "Table")
  @js.native
  val Table: StyledComponent[
    DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement], 
    PickDetailedHTMLPropsTabl, 
    Theme
  ] = js.native
  
  trait ArgJsDocArgs extends StObject {
    
    var tags: JsDocTags
  }
  object ArgJsDocArgs {
    
    inline def apply(tags: JsDocTags): ArgJsDocArgs = {
      val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgJsDocArgs]
    }
    
    extension [Self <: ArgJsDocArgs](x: Self) {
      
      inline def setTags(value: JsDocTags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
