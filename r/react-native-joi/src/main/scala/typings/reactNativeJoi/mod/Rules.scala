package typings.reactNativeJoi.mod

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rules[P /* <: js.Object */] extends StObject {
  
  var description: js.UndefOr[String | (js.Function1[/* params */ P, String])] = js.native
  
  var name: String = js.native
  
  var params: js.UndefOr[
    ObjectSchema | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof P ]: react-native-joi.react-native-joi.SchemaLike}
    */ typings.reactNativeJoi.reactNativeJoiStrings.Rules with TopLevel[js.Any])
  ] = js.native
  
  var setup: js.UndefOr[js.ThisFunction1[/* this */ ExtensionBoundSchema, /* params */ P, Schema | Unit]] = js.native
  
  var validate: js.UndefOr[
    js.ThisFunction4[
      /* this */ ExtensionBoundSchema, 
      /* params */ P, 
      /* value */ js.Any, 
      /* state */ State, 
      /* options */ ValidationOptions, 
      _
    ]
  ] = js.native
}
object Rules {
  
  @scala.inline
  def apply[P /* <: js.Object */](name: String): Rules[P] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rules[P]]
  }
  
  @scala.inline
  implicit class RulesMutableBuilder[Self <: Rules[_], P /* <: js.Object */] (val x: Self with Rules[P]) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String | (js.Function1[/* params */ P, String])): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionFunction1(value: /* params */ P => String): Self = StObject.set(x, "description", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(
      value: ObjectSchema | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof P ]: react-native-joi.react-native-joi.SchemaLike}
      */ typings.reactNativeJoi.reactNativeJoiStrings.Rules with TopLevel[js.Any])
    ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setSetup(value: js.ThisFunction1[/* this */ ExtensionBoundSchema, /* params */ P, Schema | Unit]): Self = StObject.set(x, "setup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
    
    @scala.inline
    def setValidate(
      value: js.ThisFunction4[
          /* this */ ExtensionBoundSchema, 
          /* params */ P, 
          /* value */ js.Any, 
          /* state */ State, 
          /* options */ ValidationOptions, 
          _
        ]
    ): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
