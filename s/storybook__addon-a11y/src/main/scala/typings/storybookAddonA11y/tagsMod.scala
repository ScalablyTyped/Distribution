package typings.storybookAddonA11y

import typings.axeCore.mod.TagValue
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagsMod {
  
  @JSImport("@storybook/addon-a11y/dist/components/Report/Tags", "Tags")
  @js.native
  val Tags: FunctionComponent[TagsProps] = js.native
  
  trait TagsProps extends StObject {
    
    var tags: js.Array[TagValue]
  }
  object TagsProps {
    
    @scala.inline
    def apply(tags: js.Array[TagValue]): TagsProps = {
      val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagsProps]
    }
    
    @scala.inline
    implicit class TagsPropsMutableBuilder[Self <: TagsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTags(value: js.Array[TagValue]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsVarargs(value: TagValue*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
}
