package typings.storybookReact

import typings.storybookDocsTools.distTs3Dot9ArgTypesDocgenPropDefMod.PropDef
import typings.storybookDocsTools.distTs3Dot9ArgTypesDocgenPropDefMod.PropDefaultValue
import typings.storybookReact.anon.PartialTypeResolvers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ClientDocsLibDefaultValuesCreateFromRawDefaultPropMod {
  
  @JSImport("@storybook/react/dist/ts3.9/client/docs/lib/defaultValues/createFromRawDefaultProp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDefaultValueFromRawDefaultProp(rawDefaultProp: Any, propDef: PropDef): PropDefaultValue = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultValueFromRawDefaultProp")(rawDefaultProp.asInstanceOf[js.Any], propDef.asInstanceOf[js.Any])).asInstanceOf[PropDefaultValue]
  inline def createDefaultValueFromRawDefaultProp(rawDefaultProp: Any, propDef: PropDef, typeResolvers: TypeResolvers): PropDefaultValue = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultValueFromRawDefaultProp")(rawDefaultProp.asInstanceOf[js.Any], propDef.asInstanceOf[js.Any], typeResolvers.asInstanceOf[js.Any])).asInstanceOf[PropDefaultValue]
  
  inline def createTypeResolvers(): TypeResolvers = ^.asInstanceOf[js.Dynamic].applyDynamic("createTypeResolvers")().asInstanceOf[TypeResolvers]
  inline def createTypeResolvers(customResolvers: PartialTypeResolvers): TypeResolvers = ^.asInstanceOf[js.Dynamic].applyDynamic("createTypeResolvers")(customResolvers.asInstanceOf[js.Any]).asInstanceOf[TypeResolvers]
  
  inline def extractFunctionName(func: js.Function, propName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("extractFunctionName")(func.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type TypeResolver = js.Function2[/* rawDefaultProp */ Any, /* propDef */ PropDef, PropDefaultValue]
  
  trait TypeResolvers extends StObject {
    
    var default: TypeResolver
    
    var function: TypeResolver
    
    var `object`: TypeResolver
    
    var string: TypeResolver
  }
  object TypeResolvers {
    
    inline def apply(
      default: (/* rawDefaultProp */ Any, /* propDef */ PropDef) => PropDefaultValue,
      function: (/* rawDefaultProp */ Any, /* propDef */ PropDef) => PropDefaultValue,
      `object`: (/* rawDefaultProp */ Any, /* propDef */ PropDef) => PropDefaultValue,
      string: (/* rawDefaultProp */ Any, /* propDef */ PropDef) => PropDefaultValue
    ): TypeResolvers = {
      val __obj = js.Dynamic.literal(default = js.Any.fromFunction2(default), function = js.Any.fromFunction2(function), string = js.Any.fromFunction2(string))
      __obj.updateDynamic("object")(js.Any.fromFunction2(`object`))
      __obj.asInstanceOf[TypeResolvers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeResolvers] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: (/* rawDefaultProp */ Any, /* propDef */ PropDef) => PropDefaultValue): Self = StObject.set(x, "default", js.Any.fromFunction2(value))
      
      inline def setFunction(value: (/* rawDefaultProp */ Any, /* propDef */ PropDef) => PropDefaultValue): Self = StObject.set(x, "function", js.Any.fromFunction2(value))
      
      inline def setObject(value: (/* rawDefaultProp */ Any, /* propDef */ PropDef) => PropDefaultValue): Self = StObject.set(x, "object", js.Any.fromFunction2(value))
      
      inline def setString(value: (/* rawDefaultProp */ Any, /* propDef */ PropDef) => PropDefaultValue): Self = StObject.set(x, "string", js.Any.fromFunction2(value))
    }
  }
}
