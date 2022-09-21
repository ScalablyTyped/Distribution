package typings.reactTypeAnimation

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-type-animation", JSImport.Default)
  @js.native
  val default: FunctionComponent[TypeAnimationProps] = js.native
  
  trait TypeAnimationProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var cursor: js.UndefOr[Boolean] = js.undefined
    
    var repeat: js.UndefOr[Double] = js.undefined
    
    var sequence: js.Array[String | Double]
    
    var wrapper: js.UndefOr[String] = js.undefined
  }
  object TypeAnimationProps {
    
    inline def apply(sequence: js.Array[String | Double]): TypeAnimationProps = {
      val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeAnimationProps]
    }
    
    extension [Self <: TypeAnimationProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCursor(value: Boolean): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      inline def setSequence(value: js.Array[String | Double]): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      inline def setSequenceVarargs(value: (String | Double)*): Self = StObject.set(x, "sequence", js.Array(value*))
      
      inline def setWrapper(value: String): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  type _To = FunctionComponent[TypeAnimationProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FunctionComponent[TypeAnimationProps] = default
}
