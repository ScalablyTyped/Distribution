package typings.pulumiAws

import typings.pulumiAws.inputMod.GetAutoscalingGroupsFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAutoscalingGroupsMod {
  
  @JSImport("@pulumi/aws/getAutoscalingGroups", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAutoscalingGroups(): js.Promise[GetAutoscalingGroupsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoscalingGroups")().asInstanceOf[js.Promise[GetAutoscalingGroupsResult]]
  inline def getAutoscalingGroups(args: Unit, opts: InvokeOptions): js.Promise[GetAutoscalingGroupsResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutoscalingGroups")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetAutoscalingGroupsResult]]
  inline def getAutoscalingGroups(args: GetAutoscalingGroupsArgs): js.Promise[GetAutoscalingGroupsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoscalingGroups")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetAutoscalingGroupsResult]]
  inline def getAutoscalingGroups(args: GetAutoscalingGroupsArgs, opts: InvokeOptions): js.Promise[GetAutoscalingGroupsResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutoscalingGroups")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetAutoscalingGroupsResult]]
  
  trait GetAutoscalingGroupsArgs extends StObject {
    
    /**
      * A filter used to scope the list e.g. by tags. See [related docs](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_Filter.html).
      */
    val filters: js.UndefOr[js.Array[GetAutoscalingGroupsFilter]] = js.undefined
  }
  object GetAutoscalingGroupsArgs {
    
    inline def apply(): GetAutoscalingGroupsArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAutoscalingGroupsArgs]
    }
    
    extension [Self <: GetAutoscalingGroupsArgs](x: Self) {
      
      inline def setFilters(value: js.Array[GetAutoscalingGroupsFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: GetAutoscalingGroupsFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    }
  }
  
  trait GetAutoscalingGroupsResult extends StObject {
    
    /**
      * A list of the Autoscaling Groups Arns in the current region.
      */
    val arns: js.Array[String]
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.GetAutoscalingGroupsFilter]] = js.undefined
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * A list of the Autoscaling Groups in the current region.
      */
    val names: js.Array[String]
  }
  object GetAutoscalingGroupsResult {
    
    inline def apply(arns: js.Array[String], id: String, names: js.Array[String]): GetAutoscalingGroupsResult = {
      val __obj = js.Dynamic.literal(arns = arns.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAutoscalingGroupsResult]
    }
    
    extension [Self <: GetAutoscalingGroupsResult](x: Self) {
      
      inline def setArns(value: js.Array[String]): Self = StObject.set(x, "arns", value.asInstanceOf[js.Any])
      
      inline def setArnsVarargs(value: String*): Self = StObject.set(x, "arns", js.Array(value :_*))
      
      inline def setFilters(value: js.Array[typings.pulumiAws.outputMod.GetAutoscalingGroupsFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: typings.pulumiAws.outputMod.GetAutoscalingGroupsFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
    }
  }
}
