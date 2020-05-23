package typings.storybookPolymer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DecoratorParameters = org.scalablytyped.runtime.StringDictionary[js.Any]
  type RenderFunction = js.Function0[
    typings.storybookPolymer.mod.Renderable | js.Array[typings.storybookPolymer.mod.Renderable]
  ]
  type Renderable = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TemplateResult */ js.Any
  type StoryDecorator = js.Function2[
    /* story */ typings.storybookPolymer.mod.RenderFunction, 
    /* context */ typings.storybookPolymer.anon.Kind, 
    typings.storybookPolymer.mod.Renderable | scala.Null
  ]
}
