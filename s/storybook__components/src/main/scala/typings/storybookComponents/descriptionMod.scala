package typings.storybookComponents

import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object descriptionMod {
  
  @JSImport("@storybook/components/dist/blocks/Description", "Description")
  @js.native
  val Description: FunctionComponent[DescriptionProps] = js.native
  
  trait DescriptionProps extends StObject {
    
    var markdown: String
  }
  object DescriptionProps {
    
    @scala.inline
    def apply(markdown: String): DescriptionProps = {
      val __obj = js.Dynamic.literal(markdown = markdown.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescriptionProps]
    }
    
    @scala.inline
    implicit class DescriptionPropsMutableBuilder[Self <: DescriptionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMarkdown(value: String): Self = StObject.set(x, "markdown", value.asInstanceOf[js.Any])
    }
  }
}
