package typings.reactAnimals

import typings.csstype.mod.Property.Color
import typings.csstype.mod.Property.Width
import typings.reactAnimals.reactAnimalsStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<react-animals.react-animals.AnimalProps> */
  trait PartialAnimalProps extends StObject {
    
    var circle: js.UndefOr[Boolean] = js.undefined
    
    var color: js.UndefOr[Color | none] = js.undefined
    
    var dance: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 72, starting with typings.reactAnimals.reactAnimalsStrings.alligator, typings.reactAnimals.reactAnimalsStrings.anteater, typings.reactAnimals.reactAnimalsStrings.armadillo */ Any
      ] = js.undefined
    
    var rounded: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Width[String | Double]] = js.undefined
    
    var square: js.UndefOr[Boolean] = js.undefined
  }
  object PartialAnimalProps {
    
    inline def apply(): PartialAnimalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialAnimalProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialAnimalProps] (val x: Self) extends AnyVal {
      
      inline def setCircle(value: Boolean): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      inline def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
      
      inline def setColor(value: Color | none): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDance(value: Boolean): Self = StObject.set(x, "dance", value.asInstanceOf[js.Any])
      
      inline def setDanceUndefined: Self = StObject.set(x, "dance", js.undefined)
      
      inline def setName(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 72, starting with typings.reactAnimals.reactAnimalsStrings.alligator, typings.reactAnimals.reactAnimalsStrings.anteater, typings.reactAnimals.reactAnimalsStrings.armadillo */ Any
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRounded(value: Boolean): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
      
      inline def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
      
      inline def setSize(value: Width[String | Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSquare(value: Boolean): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
      
      inline def setSquareUndefined: Self = StObject.set(x, "square", js.undefined)
    }
  }
}
