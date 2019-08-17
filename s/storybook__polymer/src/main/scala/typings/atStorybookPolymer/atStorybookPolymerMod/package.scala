package typings.atStorybookPolymer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atStorybookPolymerMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atStorybookPolymer.Anon_Kind

  type DecoratorParameters = StringDictionary[js.Any]
  type RenderFunction = js.Function0[Renderable | js.Array[Renderable]]
  type Renderable = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TemplateResult */ js.Any
  type StoryDecorator = js.Function2[/* story */ RenderFunction, /* context */ Anon_Kind, Renderable | Null]
}
