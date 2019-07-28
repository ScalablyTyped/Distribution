package typings.atStorybookHtml

import org.scalablytyped.runtime.StringDictionary
import typings.atStorybookHtml.Anon_Kind
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atStorybookHtmlMod {
  type DecoratorParameters = StringDictionary[js.Any]
  type RenderFunction = js.Function0[String | js.Array[String] | HTMLElement]
  type StoryDecorator = js.Function2[/* story */ RenderFunction, /* context */ Anon_Kind, String | Null]
}
