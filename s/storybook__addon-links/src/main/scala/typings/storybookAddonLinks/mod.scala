package typings.storybookAddonLinks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/addon-links", "LinkTo")
  @js.native
  def LinkTo_(): Null = js.native
  
  @JSImport("@storybook/addon-links", "hrefTo")
  @js.native
  def hrefTo(kind: String, name: String): js.Promise[String] = js.native
  
  @JSImport("@storybook/addon-links", "linkTo")
  @js.native
  def linkTo(idOrKindInput: String): js.Function1[/* repeated */ js.Any, Unit] = js.native
  @JSImport("@storybook/addon-links", "linkTo")
  @js.native
  def linkTo(idOrKindInput: String, storyInput: String): js.Function1[/* repeated */ js.Any, Unit] = js.native
  @JSImport("@storybook/addon-links", "linkTo")
  @js.native
  def linkTo(idOrKindInput: String, storyInput: js.Function1[/* repeated */ js.Any, String]): js.Function1[/* repeated */ js.Any, Unit] = js.native
  
  @JSImport("@storybook/addon-links", "withLinks")
  @js.native
  def withLinks(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): js.Any = js.native
}
