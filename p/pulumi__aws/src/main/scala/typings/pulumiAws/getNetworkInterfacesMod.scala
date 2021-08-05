package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetNetworkInterfacesFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getNetworkInterfacesMod {
  
  @JSImport("@pulumi/aws/ec2/getNetworkInterfaces", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNetworkInterfaces(): js.Promise[GetNetworkInterfacesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkInterfaces")().asInstanceOf[js.Promise[GetNetworkInterfacesResult]]
  inline def getNetworkInterfaces(args: Unit, opts: InvokeOptions): js.Promise[GetNetworkInterfacesResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkInterfaces")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetNetworkInterfacesResult]]
  inline def getNetworkInterfaces(args: GetNetworkInterfacesArgs): js.Promise[GetNetworkInterfacesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkInterfaces")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetNetworkInterfacesResult]]
  inline def getNetworkInterfaces(args: GetNetworkInterfacesArgs, opts: InvokeOptions): js.Promise[GetNetworkInterfacesResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkInterfaces")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetNetworkInterfacesResult]]
  
  trait GetNetworkInterfacesArgs extends StObject {
    
    /**
      * Custom filter block as described below.
      */
    val filters: js.UndefOr[js.Array[GetNetworkInterfacesFilter]] = js.undefined
    
    /**
      * A map of tags, each pair of which must exactly match
      * a pair on the desired network interfaces.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetNetworkInterfacesArgs {
    
    inline def apply(): GetNetworkInterfacesArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetNetworkInterfacesArgs]
    }
    
    extension [Self <: GetNetworkInterfacesArgs](x: Self) {
      
      inline def setFilters(value: js.Array[GetNetworkInterfacesFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: GetNetworkInterfacesFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetNetworkInterfacesResult extends StObject {
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetNetworkInterfacesFilter]] = js.undefined
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * A list of all the network interface ids found. This data source will fail if none are found.
      */
    val ids: js.Array[String]
    
    val tags: StringDictionary[String]
  }
  object GetNetworkInterfacesResult {
    
    inline def apply(id: String, ids: js.Array[String], tags: StringDictionary[String]): GetNetworkInterfacesResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetNetworkInterfacesResult]
    }
    
    extension [Self <: GetNetworkInterfacesResult](x: Self) {
      
      inline def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetNetworkInterfacesFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetNetworkInterfacesFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
