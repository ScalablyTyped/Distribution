package typings.storybookAddonLinks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@storybook/addon-links/dist/ts3.9/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hrefTo(
    title: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentTitle */ Any,
    name: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryName */ Any
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("hrefTo")(title.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def linkTo(idOrTitle: String): js.Function1[/* repeated */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("linkTo")(idOrTitle.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
  inline def linkTo(idOrTitle: String, nameInput: String): js.Function1[/* repeated */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkTo")(idOrTitle.asInstanceOf[js.Any], nameInput.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
  inline def linkTo(idOrTitle: String, nameInput: js.Function1[/* repeated */ Any, String]): js.Function1[/* repeated */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkTo")(idOrTitle.asInstanceOf[js.Any], nameInput.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
  
  inline def navigate(params: ParamsCombo): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def navigate(params: ParamsId): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def withLinks(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withLinks")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait ParamsCombo extends StObject {
    
    var kind: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentTitle */ Any
      ] = js.undefined
    
    var story: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryName */ Any
      ] = js.undefined
  }
  object ParamsCombo {
    
    inline def apply(): ParamsCombo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParamsCombo]
    }
    
    extension [Self <: ParamsCombo](x: Self) {
      
      inline def setKind(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentTitle */ Any
      ): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setStory(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryName */ Any
      ): Self = StObject.set(x, "story", value.asInstanceOf[js.Any])
      
      inline def setStoryUndefined: Self = StObject.set(x, "story", js.undefined)
    }
  }
  
  trait ParamsId extends StObject {
    
    var storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
  }
  object ParamsId {
    
    inline def apply(
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    ): ParamsId = {
      val __obj = js.Dynamic.literal(storyId = storyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParamsId]
    }
    
    extension [Self <: ParamsId](x: Self) {
      
      inline def setStoryId(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
      ): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
    }
  }
}
