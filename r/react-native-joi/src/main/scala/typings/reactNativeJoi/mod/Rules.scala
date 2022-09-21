package typings.reactNativeJoi.mod

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rules[P /* <: js.Object */] extends StObject {
  
  var description: js.UndefOr[String | (js.Function1[/* params */ P, String])] = js.undefined
  
  var name: String
  
  var params: js.UndefOr[
    ObjectSchema | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof P ]: react-native-joi.react-native-joi.SchemaLike}
    */ typings.reactNativeJoi.reactNativeJoiStrings.Rules & TopLevel[Any])
  ] = js.undefined
  
  var setup: js.UndefOr[js.ThisFunction1[/* this */ ExtensionBoundSchema, /* params */ P, Schema | Unit]] = js.undefined
  
  var validate: js.UndefOr[
    js.ThisFunction4[
      /* this */ ExtensionBoundSchema, 
      /* params */ P, 
      /* value */ Any, 
      /* state */ State, 
      /* options */ ValidationOptions, 
      Any
    ]
  ] = js.undefined
}
object Rules {
  
  inline def apply[P /* <: js.Object */](name: String): Rules[P] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rules[P]]
  }
  
  extension [Self <: Rules[?], P /* <: js.Object */](x: Self & Rules[P]) {
    
    inline def setDescription(value: String | (js.Function1[/* params */ P, String])): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionFunction1(value: /* params */ P => String): Self = StObject.set(x, "description", js.Any.fromFunction1(value))
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParams(
      value: ObjectSchema | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof P ]: react-native-joi.react-native-joi.SchemaLike}
      */ typings.reactNativeJoi.reactNativeJoiStrings.Rules & TopLevel[Any])
    ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setSetup(value: js.ThisFunction1[/* this */ ExtensionBoundSchema, /* params */ P, Schema | Unit]): Self = StObject.set(x, "setup", value.asInstanceOf[js.Any])
    
    inline def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
    
    inline def setValidate(
      value: js.ThisFunction4[
          /* this */ ExtensionBoundSchema, 
          /* params */ P, 
          /* value */ Any, 
          /* state */ State, 
          /* options */ ValidationOptions, 
          Any
        ]
    ): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
