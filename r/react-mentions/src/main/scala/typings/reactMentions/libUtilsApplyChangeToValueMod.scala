package typings.reactMentions

import typings.reactMentions.anon.PartialConfig
import typings.reactMentions.mod.DisplayTransformFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsApplyChangeToValueMod {
  
  @JSImport("react-mentions/lib/utils/applyChangeToValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyChangeToValue(value: String, plainTextValue: String, options: Options, config: js.Array[PartialConfig]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyChangeToValue")(value.asInstanceOf[js.Any], plainTextValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Inlined std.Pick<react-mentions.react-mentions.MentionProps, 'markup' | 'regex' | 'displayTransform'> */
  trait Config extends StObject {
    
    var displayTransform: js.UndefOr[DisplayTransformFunc] = js.undefined
    
    var markup: js.UndefOr[String] = js.undefined
    
    var regex: js.UndefOr[js.RegExp] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setDisplayTransform(value: (/* id */ String, /* display */ String) => String): Self = StObject.set(x, "displayTransform", js.Any.fromFunction2(value))
      
      inline def setDisplayTransformUndefined: Self = StObject.set(x, "displayTransform", js.undefined)
      
      inline def setMarkup(value: String): Self = StObject.set(x, "markup", value.asInstanceOf[js.Any])
      
      inline def setMarkupUndefined: Self = StObject.set(x, "markup", js.undefined)
      
      inline def setRegex(value: js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var selectionEndAfter: js.UndefOr[Double] = js.undefined
    
    var selectionEndBefore: js.UndefOr[Double] = js.undefined
    
    var selectionStartBefore: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setSelectionEndAfter(value: Double): Self = StObject.set(x, "selectionEndAfter", value.asInstanceOf[js.Any])
      
      inline def setSelectionEndAfterUndefined: Self = StObject.set(x, "selectionEndAfter", js.undefined)
      
      inline def setSelectionEndBefore(value: Double): Self = StObject.set(x, "selectionEndBefore", value.asInstanceOf[js.Any])
      
      inline def setSelectionEndBeforeUndefined: Self = StObject.set(x, "selectionEndBefore", js.undefined)
      
      inline def setSelectionStartBefore(value: Double): Self = StObject.set(x, "selectionStartBefore", value.asInstanceOf[js.Any])
      
      inline def setSelectionStartBeforeUndefined: Self = StObject.set(x, "selectionStartBefore", js.undefined)
    }
  }
}
