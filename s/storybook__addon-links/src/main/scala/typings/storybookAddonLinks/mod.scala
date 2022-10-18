package typings.storybookAddonLinks

import typings.storybookAddonLinks.distTs3Dot9UtilsMod.ParamsCombo
import typings.storybookAddonLinks.distTs3Dot9UtilsMod.ParamsId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/addon-links", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def LinkTo_(): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("LinkTo")().asInstanceOf[Null]
  
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
}
