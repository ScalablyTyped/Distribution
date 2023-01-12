package typings.storybookDocsTools

import typings.storybookDocsTools.anon.Arguments
import typings.storybookDocsTools.anon.Properties
import typings.storybookDocsTools.storybookDocsToolsStrings.Array
import typings.storybookDocsTools.storybookDocsToolsStrings.`object`
import typings.storybookDocsTools.storybookDocsToolsStrings.any
import typings.storybookDocsTools.storybookDocsToolsStrings.boolean
import typings.storybookDocsTools.storybookDocsToolsStrings.function
import typings.storybookDocsTools.storybookDocsToolsStrings.intersection
import typings.storybookDocsTools.storybookDocsToolsStrings.literal
import typings.storybookDocsTools.storybookDocsToolsStrings.number
import typings.storybookDocsTools.storybookDocsToolsStrings.signature
import typings.storybookDocsTools.storybookDocsToolsStrings.string
import typings.storybookDocsTools.storybookDocsToolsStrings.symbol
import typings.storybookDocsTools.storybookDocsToolsStrings.union
import typings.storybookDocsTools.storybookDocsToolsStrings.void
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ArgTypesConvertFlowTypesMod {
  
  type FlowArgType = FlowType
  
  trait FlowArrayType
    extends StObject
       with FlowBaseType
       with FlowType {
    
    var elements: js.Array[FlowType]
    
    @JSName("name")
    var name_FlowArrayType: Array
  }
  object FlowArrayType {
    
    inline def apply(elements: js.Array[FlowType]): FlowArrayType = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], name = "Array")
      __obj.asInstanceOf[FlowArrayType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlowArrayType] (val x: Self) extends AnyVal {
      
      inline def setElements(value: js.Array[FlowType]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsVarargs(value: FlowType*): Self = StObject.set(x, "elements", js.Array(value*))
      
      inline def setName(value: Array): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait FlowBaseType extends StObject {
    
    var name: String
    
    var raw: js.UndefOr[String] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object FlowBaseType {
    
    inline def apply(name: String): FlowBaseType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlowBaseType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlowBaseType] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait FlowCombinationType
    extends StObject
       with FlowBaseType
       with FlowType {
    
    var elements: js.Array[FlowType]
    
    @JSName("name")
    var name_FlowCombinationType: union | intersection
  }
  object FlowCombinationType {
    
    inline def apply(elements: js.Array[FlowType], name: union | intersection): FlowCombinationType = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlowCombinationType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlowCombinationType] (val x: Self) extends AnyVal {
      
      inline def setElements(value: js.Array[FlowType]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsVarargs(value: FlowType*): Self = StObject.set(x, "elements", js.Array(value*))
      
      inline def setName(value: union | intersection): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait FlowFuncSigType
    extends StObject
       with FlowBaseType
       with FlowSigType {
    
    @JSName("name")
    var name_FlowFuncSigType: signature
    
    var signature: Arguments
    
    @JSName("type")
    var type_FlowFuncSigType: function
  }
  object FlowFuncSigType {
    
    inline def apply(signature: Arguments): FlowFuncSigType = {
      val __obj = js.Dynamic.literal(name = "signature", signature = signature.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("function")
      __obj.asInstanceOf[FlowFuncSigType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlowFuncSigType] (val x: Self) extends AnyVal {
      
      inline def setName(value: signature): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: Arguments): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setType(value: function): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FlowLiteralType
    extends StObject
       with FlowBaseType
       with FlowType {
    
    @JSName("name")
    var name_FlowLiteralType: literal
    
    var value: String
  }
  object FlowLiteralType {
    
    inline def apply(value: String): FlowLiteralType = {
      val __obj = js.Dynamic.literal(name = "literal", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlowLiteralType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlowLiteralType] (val x: Self) extends AnyVal {
      
      inline def setName(value: literal): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait FlowObjectSigType
    extends StObject
       with FlowBaseType
       with FlowSigType {
    
    @JSName("name")
    var name_FlowObjectSigType: signature
    
    var signature: Properties
    
    @JSName("type")
    var type_FlowObjectSigType: `object`
  }
  object FlowObjectSigType {
    
    inline def apply(signature: Properties): FlowObjectSigType = {
      val __obj = js.Dynamic.literal(name = "signature", signature = signature.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("object")
      __obj.asInstanceOf[FlowObjectSigType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlowObjectSigType] (val x: Self) extends AnyVal {
      
      inline def setName(value: signature): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: Properties): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setType(value: `object`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FlowScalarType
    extends StObject
       with FlowBaseType
       with FlowType {
    
    @JSName("name")
    var name_FlowScalarType: any | boolean | number | void | string | symbol
  }
  object FlowScalarType {
    
    inline def apply(name: any | boolean | number | void | string | symbol): FlowScalarType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlowScalarType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlowScalarType] (val x: Self) extends AnyVal {
      
      inline def setName(value: any | boolean | number | void | string | symbol): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookDocsTools.distTs3Dot9ArgTypesConvertFlowTypesMod.FlowObjectSigType
    - typings.storybookDocsTools.distTs3Dot9ArgTypesConvertFlowTypesMod.FlowFuncSigType
  */
  trait FlowSigType
    extends StObject
       with FlowType
  object FlowSigType {
    
    inline def FlowFuncSigType(signature: Arguments): typings.storybookDocsTools.distTs3Dot9ArgTypesConvertFlowTypesMod.FlowFuncSigType = {
      val __obj = js.Dynamic.literal(name = "signature", signature = signature.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("function")
      __obj.asInstanceOf[typings.storybookDocsTools.distTs3Dot9ArgTypesConvertFlowTypesMod.FlowFuncSigType]
    }
    
    inline def FlowObjectSigType(signature: Properties): typings.storybookDocsTools.distTs3Dot9ArgTypesConvertFlowTypesMod.FlowObjectSigType = {
      val __obj = js.Dynamic.literal(name = "signature", signature = signature.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("object")
      __obj.asInstanceOf[typings.storybookDocsTools.distTs3Dot9ArgTypesConvertFlowTypesMod.FlowObjectSigType]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookDocsTools.distTs3Dot9ArgTypesConvertFlowTypesMod.FlowScalarType
    - typings.storybookDocsTools.distTs3Dot9ArgTypesConvertFlowTypesMod.FlowLiteralType
    - typings.storybookDocsTools.distTs3Dot9ArgTypesConvertFlowTypesMod.FlowCombinationType
    - typings.storybookDocsTools.distTs3Dot9ArgTypesConvertFlowTypesMod.FlowSigType
    - typings.storybookDocsTools.distTs3Dot9ArgTypesConvertFlowTypesMod.FlowArrayType
  */
  trait FlowType extends StObject
  object FlowType {
    
    inline def FlowArrayType(elements: js.Array[FlowType]): typings.storybookDocsTools.distTs3Dot9ArgTypesConvertFlowTypesMod.FlowArrayType = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], name = "Array")
      __obj.asInstanceOf[typings.storybookDocsTools.distTs3Dot9ArgTypesConvertFlowTypesMod.FlowArrayType]
    }
    
    inline def FlowCombinationType(elements: js.Array[FlowType], name: union | intersection): typings.storybookDocsTools.distTs3Dot9ArgTypesConvertFlowTypesMod.FlowCombinationType = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.storybookDocsTools.distTs3Dot9ArgTypesConvertFlowTypesMod.FlowCombinationType]
    }
    
    inline def FlowFuncSigType(signature: Arguments): typings.storybookDocsTools.distTs3Dot9ArgTypesConvertFlowTypesMod.FlowFuncSigType = {
      val __obj = js.Dynamic.literal(name = "signature", signature = signature.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("function")
      __obj.asInstanceOf[typings.storybookDocsTools.distTs3Dot9ArgTypesConvertFlowTypesMod.FlowFuncSigType]
    }
    
    inline def FlowLiteralType(value: String): typings.storybookDocsTools.distTs3Dot9ArgTypesConvertFlowTypesMod.FlowLiteralType = {
      val __obj = js.Dynamic.literal(name = "literal", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.storybookDocsTools.distTs3Dot9ArgTypesConvertFlowTypesMod.FlowLiteralType]
    }
    
    inline def FlowObjectSigType(signature: Properties): typings.storybookDocsTools.distTs3Dot9ArgTypesConvertFlowTypesMod.FlowObjectSigType = {
      val __obj = js.Dynamic.literal(name = "signature", signature = signature.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("object")
      __obj.asInstanceOf[typings.storybookDocsTools.distTs3Dot9ArgTypesConvertFlowTypesMod.FlowObjectSigType]
    }
    
    inline def FlowScalarType(name: any | boolean | number | void | string | symbol): typings.storybookDocsTools.distTs3Dot9ArgTypesConvertFlowTypesMod.FlowScalarType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.storybookDocsTools.distTs3Dot9ArgTypesConvertFlowTypesMod.FlowScalarType]
    }
  }
}
