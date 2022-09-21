package typings.reactSketchapp.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.propTypes.mod.InferProps
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instantiable
  extends StObject
     with Instantiable1[/* props */ InferProps[Overrides], ComponentDidCatch]
     with Instantiable2[/* props */ InferProps[Overrides], /* context */ Any, ComponentDidCatch] {
  
  var contextType: js.UndefOr[Context[Any]] = js.native
  
  var displayName: String = js.native
  
  var masterName: String = js.native
  
  var propTypes: Overrides = js.native
  
  var symbolID: String = js.native
}
