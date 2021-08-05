package typings.storybookAddonLinks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/addon-links", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def LinkTo_(): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("LinkTo")().asInstanceOf[Null]
  
  inline def hrefTo(kind: String, name: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("hrefTo")(kind.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def linkTo(idOrKindInput: String): js.Function1[/* repeated */ js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("linkTo")(idOrKindInput.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, Unit]]
  inline def linkTo(idOrKindInput: String, storyInput: String): js.Function1[/* repeated */ js.Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkTo")(idOrKindInput.asInstanceOf[js.Any], storyInput.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Unit]]
  inline def linkTo(idOrKindInput: String, storyInput: js.Function1[/* repeated */ js.Any, String]): js.Function1[/* repeated */ js.Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkTo")(idOrKindInput.asInstanceOf[js.Any], storyInput.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Unit]]
  
  inline def withLinks(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withLinks")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
