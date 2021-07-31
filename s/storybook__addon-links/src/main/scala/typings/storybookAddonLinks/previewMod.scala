package typings.storybookAddonLinks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previewMod {
  
  @JSImport("@storybook/addon-links/dist/preview", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def hrefTo(kind: String, name: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("hrefTo")(kind.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def linkTo(idOrKindInput: String): js.Function1[/* repeated */ js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("linkTo")(idOrKindInput.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, Unit]]
  @scala.inline
  def linkTo(idOrKindInput: String, storyInput: String): js.Function1[/* repeated */ js.Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkTo")(idOrKindInput.asInstanceOf[js.Any], storyInput.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Unit]]
  @scala.inline
  def linkTo(idOrKindInput: String, storyInput: js.Function1[/* repeated */ js.Any, String]): js.Function1[/* repeated */ js.Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkTo")(idOrKindInput.asInstanceOf[js.Any], storyInput.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Unit]]
  
  @scala.inline
  def navigate(params: ParamsCombo): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def navigate(params: ParamsId): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def withLinks(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withLinks")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  trait ParamsCombo extends StObject {
    
    var kind: String
    
    var story: String
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
  
  trait ParamsId extends StObject {
    
    var storyId: String
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
