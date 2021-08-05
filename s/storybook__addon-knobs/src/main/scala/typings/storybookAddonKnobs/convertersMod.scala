package typings.storybookAddonKnobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convertersMod {
  
  object converters {
    
    @JSImport("@storybook/addon-knobs/dist/converters", "converters")
    @js.native
    val ^ : js.Any = js.native
    
    inline def jsonParse(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonParse")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def jsonStringify(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonStringify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def simple(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("simple")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def stringifyIfSet(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyIfSet")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def stringifyIfTruthy(value: js.Any): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyIfTruthy")(value.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    inline def toArray(value: js.Any): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
    
    inline def toBoolean(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("toBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def toDate(value: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def toFloat(value: js.Any): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("toFloat")(value.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
  }
  
  object deserializers {
    
    @JSImport("@storybook/addon-knobs/dist/converters", "deserializers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def array(value: js.Any): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
    
    inline def boolean(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("boolean")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def button(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("button")().asInstanceOf[Unit]
    
    inline def checkbox(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("checkbox")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def color(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def date(value: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def files(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("files")().asInstanceOf[Unit]
    
    inline def number(value: js.Any): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("number")(value.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
    
    inline def `object`(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("object")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def options(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("options")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def radios(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("radios")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def select(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def text(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  object serializers {
    
    @JSImport("@storybook/addon-knobs/dist/converters", "serializers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def array(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def boolean(value: js.Any): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("boolean")(value.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    inline def button(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("button")().asInstanceOf[Unit]
    
    inline def checkbox(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("checkbox")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def color(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def date(value: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def files(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("files")().asInstanceOf[Unit]
    
    inline def number(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("number")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def `object`(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("object")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def options(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("options")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def radios(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("radios")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def select(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def text(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
}
