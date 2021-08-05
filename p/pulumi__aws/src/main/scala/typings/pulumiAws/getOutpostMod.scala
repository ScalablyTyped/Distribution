package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOutpostMod {
  
  @JSImport("@pulumi/aws/outposts/getOutpost", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOutpost(): js.Promise[GetOutpostResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOutpost")().asInstanceOf[js.Promise[GetOutpostResult]]
  inline def getOutpost(args: Unit, opts: InvokeOptions): js.Promise[GetOutpostResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOutpost")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetOutpostResult]]
  inline def getOutpost(args: GetOutpostArgs): js.Promise[GetOutpostResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOutpost")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetOutpostResult]]
  inline def getOutpost(args: GetOutpostArgs, opts: InvokeOptions): js.Promise[GetOutpostResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOutpost")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetOutpostResult]]
  
  trait GetOutpostArgs extends StObject {
    
    /**
      * Amazon Resource Name (ARN).
      */
    val arn: js.UndefOr[String] = js.undefined
    
    /**
      * Identifier of the Outpost.
      */
    val id: js.UndefOr[String] = js.undefined
    
    /**
      * Name of the Outpost.
      */
    val name: js.UndefOr[String] = js.undefined
  }
  object GetOutpostArgs {
    
    inline def apply(): GetOutpostArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetOutpostArgs]
    }
    
    extension [Self <: GetOutpostArgs](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait GetOutpostResult extends StObject {
    
    val arn: String
    
    /**
      * Availability Zone name.
      */
    val availabilityZone: String
    
    /**
      * Availability Zone identifier.
      */
    val availabilityZoneId: String
    
    /**
      * Description.
      */
    val description: String
    
    val id: String
    
    val name: String
    
    /**
      * AWS Account identifier of the Outpost owner.
      */
    val ownerId: String
    
    /**
      * Site identifier.
      */
    val siteId: String
  }
  object GetOutpostResult {
    
    inline def apply(
      arn: String,
      availabilityZone: String,
      availabilityZoneId: String,
      description: String,
      id: String,
      name: String,
      ownerId: String,
      siteId: String
    ): GetOutpostResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], availabilityZoneId = availabilityZoneId.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], siteId = siteId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOutpostResult]
    }
    
    extension [Self <: GetOutpostResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZoneId(value: String): Self = StObject.set(x, "availabilityZoneId", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      inline def setSiteId(value: String): Self = StObject.set(x, "siteId", value.asInstanceOf[js.Any])
    }
  }
}
