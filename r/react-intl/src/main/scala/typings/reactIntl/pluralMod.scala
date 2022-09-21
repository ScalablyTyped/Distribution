package typings.reactIntl

import org.scalablytyped.runtime.Shortcut
import typings.formatjsIntl.srcTypesMod.FormatPluralOptions
import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluralMod extends Shortcut {
  
  @JSImport("react-intl/lib/src/components/plural", JSImport.Default)
  @js.native
  val default: FC[Props] = js.native
  
  trait Props
    extends StObject
       with FormatPluralOptions {
    
    var children: js.UndefOr[js.Function1[/* value */ ReactNode, ReactElement | Null]] = js.undefined
    
    var few: js.UndefOr[ReactNode] = js.undefined
    
    var many: js.UndefOr[ReactNode] = js.undefined
    
    var one: js.UndefOr[ReactNode] = js.undefined
    
    var other: ReactNode
    
    var two: js.UndefOr[ReactNode] = js.undefined
    
    var value: Double
    
    var zero: js.UndefOr[ReactNode] = js.undefined
  }
  object Props {
    
    inline def apply(value: Double): Props = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: /* value */ ReactNode => ReactElement | Null): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setFew(value: ReactNode): Self = StObject.set(x, "few", value.asInstanceOf[js.Any])
      
      inline def setFewUndefined: Self = StObject.set(x, "few", js.undefined)
      
      inline def setMany(value: ReactNode): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
      
      inline def setManyUndefined: Self = StObject.set(x, "many", js.undefined)
      
      inline def setOne(value: ReactNode): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
      
      inline def setOneUndefined: Self = StObject.set(x, "one", js.undefined)
      
      inline def setOther(value: ReactNode): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      inline def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
      
      inline def setTwo(value: ReactNode): Self = StObject.set(x, "two", value.asInstanceOf[js.Any])
      
      inline def setTwoUndefined: Self = StObject.set(x, "two", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setZero(value: ReactNode): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
      
      inline def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
    }
  }
  
  type _To = FC[Props]
  
  /* This means you don't have to write `default`, but can instead just say `pluralMod.foo` */
  override def _to: FC[Props] = default
}
