package typings.storybookDocsTools

import typings.storybookDocsTools.distTs3Dot9ArgTypesConvertFlowTypesMod.FlowArgType
import typings.storybookDocsTools.distTs3Dot9ArgTypesConvertFlowTypesMod.FlowType
import typings.storybookDocsTools.distTs3Dot9ArgTypesConvertTypescriptTypesMod.TSArgType
import typings.storybookDocsTools.distTs3Dot9ArgTypesConvertTypescriptTypesMod.TSType
import typings.storybookDocsTools.distTs3Dot9ArgTypesDocgenPropDefMod.PropDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Arguments extends StObject {
    
    var arguments: js.Array[FlowArgType]
    
    var `return`: FlowType
  }
  object Arguments {
    
    inline def apply(arguments: js.Array[FlowArgType], `return`: FlowType): Arguments = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
      __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Arguments]
    }
    
    extension [Self <: Arguments](x: Self) {
      
      inline def setArguments(value: js.Array[FlowArgType]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setArgumentsVarargs(value: FlowArgType*): Self = StObject.set(x, "arguments", js.Array(value*))
      
      inline def setReturn(value: FlowType): Self = StObject.set(x, "return", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key extends StObject {
    
    var key: String
    
    var value: FlowType
  }
  object Key {
    
    inline def apply(key: String, value: FlowType): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: FlowType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Properties extends StObject {
    
    var properties: js.Array[Key]
  }
  object Properties {
    
    inline def apply(properties: js.Array[Key]): Properties = {
      val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[Properties]
    }
    
    extension [Self <: Properties](x: Self) {
      
      inline def setProperties(value: js.Array[Key]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesVarargs(value: Key*): Self = StObject.set(x, "properties", js.Array(value*))
    }
  }
  
  trait PropertiesArray extends StObject {
    
    var properties: js.Array[Value]
  }
  object PropertiesArray {
    
    inline def apply(properties: js.Array[Value]): PropertiesArray = {
      val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropertiesArray]
    }
    
    extension [Self <: PropertiesArray](x: Self) {
      
      inline def setProperties(value: js.Array[Value]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesVarargs(value: Value*): Self = StObject.set(x, "properties", js.Array(value*))
    }
  }
  
  trait Return extends StObject {
    
    var arguments: js.Array[TSArgType]
    
    var `return`: TSType
  }
  object Return {
    
    inline def apply(arguments: js.Array[TSArgType], `return`: TSType): Return = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
      __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Return]
    }
    
    extension [Self <: Return](x: Self) {
      
      inline def setArguments(value: js.Array[TSArgType]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setArgumentsVarargs(value: TSArgType*): Self = StObject.set(x, "arguments", js.Array(value*))
      
      inline def setReturn(value: TSType): Self = StObject.set(x, "return", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rows extends StObject {
    
    var rows: js.UndefOr[js.Array[PropDef]] = js.undefined
  }
  object Rows {
    
    inline def apply(): Rows = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Rows]
    }
    
    extension [Self <: Rows](x: Self) {
      
      inline def setRows(value: js.Array[PropDef]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setRowsVarargs(value: PropDef*): Self = StObject.set(x, "rows", js.Array(value*))
    }
  }
  
  trait Value extends StObject {
    
    var key: String
    
    var value: TSType
  }
  object Value {
    
    inline def apply(key: String, value: TSType): Value = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: TSType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
