package typings.storybookAddonLinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/addon-links", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @JSName("LinkTo")
  def LinkTo_(): Null = js.native
  
  def hrefTo(kind: String, name: String): js.Promise[String] = js.native
  
  def linkTo(idOrKindInput: String): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def linkTo(idOrKindInput: String, storyInput: String): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def linkTo(idOrKindInput: String, storyInput: js.Function1[/* repeated */ js.Any, String]): js.Function1[/* repeated */ js.Any, Unit] = js.native
  
  def withLinks(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): js.Any = js.native
}
