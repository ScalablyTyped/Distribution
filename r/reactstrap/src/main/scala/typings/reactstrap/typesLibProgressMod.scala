package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.reactstrap.typesLibUtilsMod.CSSModule
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibProgressMod {
  
  @JSImport("reactstrap/types/lib/Progress", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ProgressProps, js.Object, Any]
  
  type Progress = Component[ProgressProps, js.Object, Any]
  
  trait ProgressProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var bar: js.UndefOr[Boolean] = js.undefined
    
    var barAriaLabelledBy: js.UndefOr[String] = js.undefined
    
    var barAriaValueText: js.UndefOr[String] = js.undefined
    
    var barClassName: js.UndefOr[String] = js.undefined
    
    var barStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var max: js.UndefOr[String | Double] = js.undefined
    
    var min: js.UndefOr[String | Double] = js.undefined
    
    var multi: js.UndefOr[Boolean] = js.undefined
    
    var striped: js.UndefOr[Boolean] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object ProgressProps {
    
    inline def apply(): ProgressProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressProps]
    }
    
    extension [Self <: ProgressProps](x: Self) {
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setBar(value: Boolean): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
      
      inline def setBarAriaLabelledBy(value: String): Self = StObject.set(x, "barAriaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setBarAriaLabelledByUndefined: Self = StObject.set(x, "barAriaLabelledBy", js.undefined)
      
      inline def setBarAriaValueText(value: String): Self = StObject.set(x, "barAriaValueText", value.asInstanceOf[js.Any])
      
      inline def setBarAriaValueTextUndefined: Self = StObject.set(x, "barAriaValueText", js.undefined)
      
      inline def setBarClassName(value: String): Self = StObject.set(x, "barClassName", value.asInstanceOf[js.Any])
      
      inline def setBarClassNameUndefined: Self = StObject.set(x, "barClassName", js.undefined)
      
      inline def setBarStyle(value: CSSProperties): Self = StObject.set(x, "barStyle", value.asInstanceOf[js.Any])
      
      inline def setBarStyleUndefined: Self = StObject.set(x, "barStyle", js.undefined)
      
      inline def setBarUndefined: Self = StObject.set(x, "bar", js.undefined)
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setMax(value: String | Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: String | Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
      
      inline def setStriped(value: Boolean): Self = StObject.set(x, "striped", value.asInstanceOf[js.Any])
      
      inline def setStripedUndefined: Self = StObject.set(x, "striped", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
