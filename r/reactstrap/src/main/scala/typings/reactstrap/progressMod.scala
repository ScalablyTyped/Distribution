package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressMod {
  
  @JSImport("reactstrap/lib/Progress", JSImport.Default)
  @js.native
  class default ()
    extends Component[ProgressProps, js.Object, js.Any]
  
  type Progress = Component[ProgressProps, js.Object, js.Any]
  
  trait ProgressProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var bar: js.UndefOr[Boolean] = js.undefined
    
    var barAriaLabelledBy: js.UndefOr[String] = js.undefined
    
    var barAriaValueText: js.UndefOr[String] = js.undefined
    
    var barClassName: js.UndefOr[String] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var max: js.UndefOr[String | Double] = js.undefined
    
    var min: js.UndefOr[String | Double] = js.undefined
    
    var multi: js.UndefOr[Boolean] = js.undefined
    
    var striped: js.UndefOr[Boolean] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object ProgressProps {
    
    @scala.inline
    def apply(): ProgressProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressProps]
    }
    
    @scala.inline
    implicit class ProgressPropsMutableBuilder[Self <: ProgressProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setBar(value: Boolean): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarAriaLabelledBy(value: String): Self = StObject.set(x, "barAriaLabelledBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarAriaLabelledByUndefined: Self = StObject.set(x, "barAriaLabelledBy", js.undefined)
      
      @scala.inline
      def setBarAriaValueText(value: String): Self = StObject.set(x, "barAriaValueText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarAriaValueTextUndefined: Self = StObject.set(x, "barAriaValueText", js.undefined)
      
      @scala.inline
      def setBarClassName(value: String): Self = StObject.set(x, "barClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarClassNameUndefined: Self = StObject.set(x, "barClassName", js.undefined)
      
      @scala.inline
      def setBarUndefined: Self = StObject.set(x, "bar", js.undefined)
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setMax(value: String | Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: String | Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
      
      @scala.inline
      def setStriped(value: Boolean): Self = StObject.set(x, "striped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripedUndefined: Self = StObject.set(x, "striped", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
