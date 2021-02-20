package typings.storybookAddonLinks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previewMod {
  
  @JSImport("@storybook/addon-links/dist/preview", "hrefTo")
  @js.native
  def hrefTo(kind: String, name: String): js.Promise[String] = js.native
  
  @JSImport("@storybook/addon-links/dist/preview", "linkTo")
  @js.native
  def linkTo(idOrKindInput: String): js.Function1[/* repeated */ js.Any, Unit] = js.native
  @JSImport("@storybook/addon-links/dist/preview", "linkTo")
  @js.native
  def linkTo(idOrKindInput: String, storyInput: String): js.Function1[/* repeated */ js.Any, Unit] = js.native
  @JSImport("@storybook/addon-links/dist/preview", "linkTo")
  @js.native
  def linkTo(idOrKindInput: String, storyInput: js.Function1[/* repeated */ js.Any, String]): js.Function1[/* repeated */ js.Any, Unit] = js.native
  
  @JSImport("@storybook/addon-links/dist/preview", "navigate")
  @js.native
  def navigate(params: ParamsCombo): Unit = js.native
  @JSImport("@storybook/addon-links/dist/preview", "navigate")
  @js.native
  def navigate(params: ParamsId): Unit = js.native
  
  @JSImport("@storybook/addon-links/dist/preview", "withLinks")
  @js.native
  def withLinks(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): js.Any = js.native
  
  @js.native
  trait ParamsCombo extends StObject {
    
    var kind: String = js.native
    
    var story: String = js.native
  }
  object ParamsCombo {
    
    @scala.inline
    def apply(kind: String, story: String): ParamsCombo = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParamsCombo]
    }
    
    @scala.inline
    implicit class ParamsComboMutableBuilder[Self <: ParamsCombo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStory(value: String): Self = StObject.set(x, "story", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParamsId extends StObject {
    
    var storyId: String = js.native
  }
  object ParamsId {
    
    @scala.inline
    def apply(storyId: String): ParamsId = {
      val __obj = js.Dynamic.literal(storyId = storyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParamsId]
    }
    
    @scala.inline
    implicit class ParamsIdMutableBuilder[Self <: ParamsId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStoryId(value: String): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
    }
  }
}
