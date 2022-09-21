package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TIntersect[T /* <: js.Array[TObject[TProperties]] */]
  extends StObject
     with TObject[TProperties] {
  
  @JSName("properties")
  var properties_TIntersect: IntersectReduce[Any, IntersectProperties[T]] = js.native
  
  @JSName("static")
  var static_TIntersect: IntersectReduce[
    Any, 
    IntersectEvaluate[
      T, 
      /* import warning: importer.ImportType#apply Failed type conversion: this['params'] */ js.Any
    ]
  ] = js.native
}
