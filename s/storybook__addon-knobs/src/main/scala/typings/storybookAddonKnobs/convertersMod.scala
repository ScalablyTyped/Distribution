package typings.storybookAddonKnobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/addon-knobs/dist/converters", JSImport.Namespace)
@js.native
object convertersMod extends js.Object {
  
  @js.native
  object converters extends js.Object {
    
    def jsonParse(value: js.Any): js.Any = js.native
    
    def jsonStringify(value: js.Any): String = js.native
    
    def simple(value: js.Any): js.Any = js.native
    
    def stringifyIfSet(value: js.Any): String = js.native
    
    def stringifyIfTruthy(value: js.Any): String | Null = js.native
    
    def toArray(value: js.Any): js.Array[_] = js.native
    
    def toBoolean(value: js.Any): Boolean = js.native
    
    def toDate(value: js.Any): Double = js.native
    
    def toFloat(value: js.Any): Double | Null = js.native
  }
  
  @js.native
  object deserializers extends js.Object {
    
    def array(value: js.Any): js.Array[_] = js.native
    
    def boolean(value: js.Any): Boolean = js.native
    
    def button(): js.UndefOr[scala.Nothing] = js.native
    
    def checkbox(value: js.Any): js.Any = js.native
    
    def color(value: js.Any): js.Any = js.native
    
    def date(value: js.Any): Double = js.native
    
    def files(): js.UndefOr[scala.Nothing] = js.native
    
    def number(value: js.Any): Double | Null = js.native
    
    def `object`(value: js.Any): js.Any = js.native
    
    def options(value: js.Any): js.Any = js.native
    
    def radios(value: js.Any): js.Any = js.native
    
    def select(value: js.Any): js.Any = js.native
    
    def text(value: js.Any): js.Any = js.native
  }
  
  @js.native
  object serializers extends js.Object {
    
    def array(value: js.Any): js.Any = js.native
    
    def boolean(value: js.Any): String | Null = js.native
    
    def button(): js.UndefOr[scala.Nothing] = js.native
    
    def checkbox(value: js.Any): js.Any = js.native
    
    def color(value: js.Any): js.Any = js.native
    
    def date(value: js.Any): Double = js.native
    
    def files(): js.UndefOr[scala.Nothing] = js.native
    
    def number(value: js.Any): String = js.native
    
    def `object`(value: js.Any): String = js.native
    
    def options(value: js.Any): js.Any = js.native
    
    def radios(value: js.Any): js.Any = js.native
    
    def select(value: js.Any): js.Any = js.native
    
    def text(value: js.Any): js.Any = js.native
  }
}
