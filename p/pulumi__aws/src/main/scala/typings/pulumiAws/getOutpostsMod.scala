package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOutpostsMod {
  
  @JSImport("@pulumi/aws/outposts/getOutposts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOutposts(): js.Promise[GetOutpostsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOutposts")().asInstanceOf[js.Promise[GetOutpostsResult]]
  inline def getOutposts(args: Unit, opts: InvokeOptions): js.Promise[GetOutpostsResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOutposts")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetOutpostsResult]]
  inline def getOutposts(args: GetOutpostsArgs): js.Promise[GetOutpostsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOutposts")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetOutpostsResult]]
  inline def getOutposts(args: GetOutpostsArgs, opts: InvokeOptions): js.Promise[GetOutpostsResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOutposts")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetOutpostsResult]]
  
  trait GetOutpostsArgs extends StObject {
    
    /**
      * Availability Zone name.
      */
    val availabilityZone: js.UndefOr[String] = js.undefined
    
    /**
      * Availability Zone identifier.
      */
    val availabilityZoneId: js.UndefOr[String] = js.undefined
    
    /**
      * Site identifier.
      */
    val siteId: js.UndefOr[String] = js.undefined
  }
  object GetOutpostsArgs {
    
    inline def apply(): GetOutpostsArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetOutpostsArgs]
    }
    
    extension [Self <: GetOutpostsArgs](x: Self) {
      
      inline def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZoneId(value: String): Self = StObject.set(x, "availabilityZoneId", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZoneIdUndefined: Self = StObject.set(x, "availabilityZoneId", js.undefined)
      
      inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      inline def setSiteId(value: String): Self = StObject.set(x, "siteId", value.asInstanceOf[js.Any])
      
      inline def setSiteIdUndefined: Self = StObject.set(x, "siteId", js.undefined)
    }
  }
  
  trait GetOutpostsResult extends StObject {
    
    /**
      * Set of Amazon Resource Names (ARNs).
      */
    val arns: js.Array[String]
    
    val availabilityZone: String
    
    val availabilityZoneId: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * Set of identifiers.
      */
    val ids: js.Array[String]
    
    val siteId: String
  }
  object GetOutpostsResult {
    
    inline def apply(
      arns: js.Array[String],
      availabilityZone: String,
      availabilityZoneId: String,
      id: String,
      ids: js.Array[String],
      siteId: String
    ): GetOutpostsResult = {
      val __obj = js.Dynamic.literal(arns = arns.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], availabilityZoneId = availabilityZoneId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], siteId = siteId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOutpostsResult]
    }
    
    extension [Self <: GetOutpostsResult](x: Self) {
      
      inline def setArns(value: js.Array[String]): Self = StObject.set(x, "arns", value.asInstanceOf[js.Any])
      
      inline def setArnsVarargs(value: String*): Self = StObject.set(x, "arns", js.Array(value :_*))
      
      inline def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZoneId(value: String): Self = StObject.set(x, "availabilityZoneId", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      inline def setSiteId(value: String): Self = StObject.set(x, "siteId", value.asInstanceOf[js.Any])
    }
  }
}
