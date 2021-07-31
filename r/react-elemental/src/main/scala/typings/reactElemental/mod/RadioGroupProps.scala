package typings.reactElemental.mod

import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.reactElemental.anon.Disabled
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadioGroupProps
  extends StObject
     with HTMLAttributes[HTMLDivElement] {
  
  val accentColor: js.UndefOr[String] = js.undefined
  
  val idleColor: js.UndefOr[String] = js.undefined
  
  @JSName("onChange")
  val onChange_RadioGroupProps: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  
  val options: js.UndefOr[js.Array[Disabled]] = js.undefined
  
  val radioRenderer: js.UndefOr[
    js.Function3[
      /* option */ ReactElement, 
      /* idx */ Double, 
      /* options */ js.Array[ReactElement], 
      ReactElement
    ]
  ] = js.undefined
  
  val value: js.UndefOr[String] = js.undefined
}
object RadioGroupProps {
  
  @scala.inline
  def apply(): RadioGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadioGroupProps]
  }
  
  @scala.inline
  implicit class RadioGroupPropsMutableBuilder[Self <: RadioGroupProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccentColor(value: String): Self = StObject.set(x, "accentColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccentColorUndefined: Self = StObject.set(x, "accentColor", js.undefined)
    
    @scala.inline
    def setIdleColor(value: String): Self = StObject.set(x, "idleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleColorUndefined: Self = StObject.set(x, "idleColor", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Array[Disabled]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: Disabled*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setRadioRenderer(
      value: (/* option */ ReactElement, /* idx */ Double, /* options */ js.Array[ReactElement]) => ReactElement
    ): Self = StObject.set(x, "radioRenderer", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRadioRendererUndefined: Self = StObject.set(x, "radioRenderer", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
