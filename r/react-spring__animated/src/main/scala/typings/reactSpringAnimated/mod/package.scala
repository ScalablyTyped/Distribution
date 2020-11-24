package typings.reactSpringAnimated

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AnimatableComponent = java.lang.String | (typings.std.Exclude[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElementType */ js.Any, 
    java.lang.String
  ])
  
  type Payload = js.Array[typings.reactSpringAnimated.mod.AnimatedValue[js.Any]]
  
  type Props = js.Object with typings.reactSpringAnimated.anon.Style
  
  type Source = (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ js.Any) | scala.Null
  
  type Source1 = js.Array[
    typings.reactSpringAnimated.mod.AnimatedValue[typings.reactSpringAnimated.mod.Value1]
  ]
  
  type Value = java.lang.String | scala.Double
  
  type Value1 = scala.Double | java.lang.String
}
