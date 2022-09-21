package typings.reactSketchapp.anon

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameStyle extends StObject {
  
  var name: Requireable[String]
  
  var style: Requireable[InferProps[AlignContent]]
}
object NameStyle {
  
  inline def apply(name: Requireable[String], style: Requireable[InferProps[AlignContent]]): NameStyle = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameStyle]
  }
  
  extension [Self <: NameStyle](x: Self) {
    
    inline def setName(value: Requireable[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Requireable[InferProps[AlignContent]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
