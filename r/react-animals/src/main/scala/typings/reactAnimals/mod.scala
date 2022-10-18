package typings.reactAnimals

import org.scalablytyped.runtime.Shortcut
import typings.csstype.mod.Property.Color
import typings.csstype.mod.Property.Width
import typings.react.mod.VFC
import typings.reactAnimals.anon.PartialAnimalProps
import typings.reactAnimals.reactAnimalsStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-animals", JSImport.Default)
  @js.native
  val default: VFC[PartialAnimalProps] = js.native
  
  trait AnimalProps extends StObject {
    
    var circle: Boolean
    
    var color: js.UndefOr[Color | none] = js.undefined
    
    var dance: Boolean
    
    var name: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 71, starting with typings.reactAnimals.reactAnimalsStrings.alligator, typings.reactAnimals.reactAnimalsStrings.anteater, typings.reactAnimals.reactAnimalsStrings.armadillo */ Any
    
    var rounded: Boolean
    
    var size: js.UndefOr[Width[String | Double]] = js.undefined
    
    var square: Boolean
  }
  object AnimalProps {
    
    inline def apply(
      circle: Boolean,
      dance: Boolean,
      name: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 71, starting with typings.reactAnimals.reactAnimalsStrings.alligator, typings.reactAnimals.reactAnimalsStrings.anteater, typings.reactAnimals.reactAnimalsStrings.armadillo */ Any,
      rounded: Boolean,
      square: Boolean
    ): AnimalProps = {
      val __obj = js.Dynamic.literal(circle = circle.asInstanceOf[js.Any], dance = dance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rounded = rounded.asInstanceOf[js.Any], square = square.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimalProps]
    }
    
    extension [Self <: AnimalProps](x: Self) {
      
      inline def setCircle(value: Boolean): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      inline def setColor(value: Color | none): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDance(value: Boolean): Self = StObject.set(x, "dance", value.asInstanceOf[js.Any])
      
      inline def setName(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 71, starting with typings.reactAnimals.reactAnimalsStrings.alligator, typings.reactAnimals.reactAnimalsStrings.anteater, typings.reactAnimals.reactAnimalsStrings.armadillo */ Any
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRounded(value: Boolean): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Width[String | Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSquare(value: Boolean): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = VFC[PartialAnimalProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: VFC[PartialAnimalProps] = default
}
