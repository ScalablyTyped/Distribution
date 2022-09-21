package typings.slatePlainSerializer

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("slate-plain-serializer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserialize(string: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(string.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def deserialize(string: String, options: DeserializeOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def serialize(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Value */ Any
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def serialize(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Value */ Any,
      options: SerializeOptions
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  trait DeserializeOptions extends StObject {
    
    var defaultBlock: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockProperties */ Any
      ] = js.undefined
    
    var defaultMarks: js.UndefOr[
        (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MarkProperties */ Any
        ]) | (Set[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MarkProperties */ Any
        ])
      ] = js.undefined
    
    var delimiter: js.UndefOr[String] = js.undefined
    
    var toJson: js.UndefOr[Boolean] = js.undefined
  }
  object DeserializeOptions {
    
    inline def apply(): DeserializeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeserializeOptions]
    }
    
    extension [Self <: DeserializeOptions](x: Self) {
      
      inline def setDefaultBlock(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockProperties */ Any
      ): Self = StObject.set(x, "defaultBlock", value.asInstanceOf[js.Any])
      
      inline def setDefaultBlockUndefined: Self = StObject.set(x, "defaultBlock", js.undefined)
      
      inline def setDefaultMarks(
        value: (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MarkProperties */ Any
            ]) | (Set[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MarkProperties */ Any
            ])
      ): Self = StObject.set(x, "defaultMarks", value.asInstanceOf[js.Any])
      
      inline def setDefaultMarksUndefined: Self = StObject.set(x, "defaultMarks", js.undefined)
      
      inline def setDefaultMarksVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MarkProperties */ Any)*
      ): Self = StObject.set(x, "defaultMarks", js.Array(value*))
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setToJson(value: Boolean): Self = StObject.set(x, "toJson", value.asInstanceOf[js.Any])
      
      inline def setToJsonUndefined: Self = StObject.set(x, "toJson", js.undefined)
    }
  }
  
  trait SerializeOptions extends StObject {
    
    var delimiter: js.UndefOr[String] = js.undefined
  }
  object SerializeOptions {
    
    inline def apply(): SerializeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SerializeOptions]
    }
    
    extension [Self <: SerializeOptions](x: Self) {
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    }
  }
}
