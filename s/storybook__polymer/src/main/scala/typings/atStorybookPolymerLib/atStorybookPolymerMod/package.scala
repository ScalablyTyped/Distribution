package typings
package atStorybookPolymerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atStorybookPolymerMod {
  type DecoratorParameters = org.scalablytyped.runtime.StringDictionary[js.Any]
  type RenderFunction = js.Function0[Renderable | js.Array[Renderable]]
  type Renderable = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TemplateResult */ js.Any
  type StoryDecorator = js.Function2[
    /* story */ RenderFunction, 
    /* context */ atStorybookPolymerLib.Anon_Kind, 
    Renderable | scala.Null
  ]
}
