package typings.smithyTypes

import org.scalablytyped.runtime.StringDictionary
import typings.smithyTypes.distTypesLoggerMod.Logger
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEndpointsSharedMod {
  
  trait ConditionObject
    extends StObject
       with FunctionObject {
    
    var assign: js.UndefOr[String] = js.undefined
  }
  object ConditionObject {
    
    inline def apply(argv: FunctionArgv, fn: String): ConditionObject = {
      val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConditionObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConditionObject] (val x: Self) extends AnyVal {
      
      inline def setAssign(value: String): Self = StObject.set(x, "assign", value.asInstanceOf[js.Any])
      
      inline def setAssignUndefined: Self = StObject.set(x, "assign", js.undefined)
    }
  }
  
  type EndpointParams = Record[String, String | Boolean]
  
  trait EndpointResolverOptions extends StObject {
    
    var endpointParams: EndpointParams
    
    var logger: js.UndefOr[Logger] = js.undefined
  }
  object EndpointResolverOptions {
    
    inline def apply(endpointParams: EndpointParams): EndpointResolverOptions = {
      val __obj = js.Dynamic.literal(endpointParams = endpointParams.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointResolverOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EndpointResolverOptions] (val x: Self) extends AnyVal {
      
      inline def setEndpointParams(value: EndpointParams): Self = StObject.set(x, "endpointParams", value.asInstanceOf[js.Any])
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    }
  }
  
  trait EvaluateOptions
    extends StObject
       with EndpointResolverOptions {
    
    var referenceRecord: ReferenceRecord
  }
  object EvaluateOptions {
    
    inline def apply(endpointParams: EndpointParams, referenceRecord: ReferenceRecord): EvaluateOptions = {
      val __obj = js.Dynamic.literal(endpointParams = endpointParams.asInstanceOf[js.Any], referenceRecord = referenceRecord.asInstanceOf[js.Any])
      __obj.asInstanceOf[EvaluateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EvaluateOptions] (val x: Self) extends AnyVal {
      
      inline def setReferenceRecord(value: ReferenceRecord): Self = StObject.set(x, "referenceRecord", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.smithyTypes.distTypesEndpointsSharedMod.ReferenceObject
    - typings.smithyTypes.distTypesEndpointsSharedMod.FunctionObject
  */
  type Expression = _Expression | String
  
  type FunctionArgv = js.Array[Expression | Boolean | Double]
  
  trait FunctionObject
    extends StObject
       with _Expression {
    
    var argv: FunctionArgv
    
    var fn: String
  }
  object FunctionObject {
    
    inline def apply(argv: FunctionArgv, fn: String): FunctionObject = {
      val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FunctionObject] (val x: Self) extends AnyVal {
      
      inline def setArgv(value: FunctionArgv): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
      
      inline def setArgvVarargs(value: (Expression | Boolean | Double)*): Self = StObject.set(x, "argv", js.Array(value*))
      
      inline def setFn(value: String): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type FunctionReturn = string | boolean | number | {[key: string] : @smithy/types.@smithy/types/dist-types/endpoints/shared.FunctionReturn}
  }}}
  to avoid circular code involving: 
  - @smithy/types.@smithy/types/dist-types/endpoints/shared.FunctionReturn
  */
  type FunctionReturn = String | Boolean | Double | StringDictionary[Any]
  
  trait ReferenceObject
    extends StObject
       with _Expression {
    
    var ref: String
  }
  object ReferenceObject {
    
    inline def apply(ref: String): ReferenceObject = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReferenceObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReferenceObject] (val x: Self) extends AnyVal {
      
      inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ReferenceRecord = std.Record<string, @smithy/types.@smithy/types/dist-types/endpoints/shared.FunctionReturn>
  }}}
  to avoid circular code involving: 
  - @smithy/types.@smithy/types/dist-types/endpoints/shared.FunctionReturn
  - @smithy/types.@smithy/types/dist-types/endpoints/shared.ReferenceRecord
  */
  @js.native
  trait ReferenceRecord extends StObject
  
  trait _Expression extends StObject
  object _Expression {
    
    inline def FunctionObject(argv: FunctionArgv, fn: String): typings.smithyTypes.distTypesEndpointsSharedMod.FunctionObject = {
      val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.smithyTypes.distTypesEndpointsSharedMod.FunctionObject]
    }
    
    inline def ReferenceObject(ref: String): typings.smithyTypes.distTypesEndpointsSharedMod.ReferenceObject = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.smithyTypes.distTypesEndpointsSharedMod.ReferenceObject]
    }
  }
}
