package typings.reactSketchapp.anon

import org.scalablytyped.runtime.StringDictionary
import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Overrides extends StObject {
  
  var name: Requireable[String]
  
  var overrides: Requireable[
    StringDictionary[js.UndefOr[String | (js.Function1[/* repeated */ Any, Any]) | Null]]
  ]
  
  var resizingConstraint: Requireable[InferProps[Bottom]]
  
  var style: Requireable[InferProps[AlignContent]]
}
object Overrides {
  
  inline def apply(
    name: Requireable[String],
    overrides: Requireable[
      StringDictionary[js.UndefOr[String | (js.Function1[/* repeated */ Any, Any]) | Null]]
    ],
    resizingConstraint: Requireable[InferProps[Bottom]],
    style: Requireable[InferProps[AlignContent]]
  ): Overrides = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overrides]
  }
  
  extension [Self <: Overrides](x: Self) {
    
    inline def setName(value: Requireable[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOverrides(
      value: Requireable[
          StringDictionary[js.UndefOr[String | (js.Function1[/* repeated */ Any, Any]) | Null]]
        ]
    ): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setResizingConstraint(value: Requireable[InferProps[Bottom]]): Self = StObject.set(x, "resizingConstraint", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Requireable[InferProps[AlignContent]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
