package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getZoneMod {
  
  @JSImport("@pulumi/aws/route53/getZone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getZone(): js.Promise[GetZoneResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getZone")().asInstanceOf[js.Promise[GetZoneResult]]
  inline def getZone(args: Unit, opts: InvokeOptions): js.Promise[GetZoneResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getZone")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetZoneResult]]
  inline def getZone(args: GetZoneArgs): js.Promise[GetZoneResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getZone")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetZoneResult]]
  inline def getZone(args: GetZoneArgs, opts: InvokeOptions): js.Promise[GetZoneResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getZone")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetZoneResult]]
  
  trait GetZoneArgs extends StObject {
    
    /**
      * The Hosted Zone name of the desired Hosted Zone.
      */
    val name: js.UndefOr[String] = js.undefined
    
    /**
      * Used with `name` field to get a private Hosted Zone.
      */
    val privateZone: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The number of Record Set in the Hosted Zone.
      */
    val resourceRecordSetCount: js.UndefOr[Double] = js.undefined
    
    /**
      * Used with `name` field. A map of tags, each pair of which must exactly match a pair on the desired Hosted Zone.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Used with `name` field to get a private Hosted Zone associated with the vpcId (in this case, privateZone is not mandatory).
      */
    val vpcId: js.UndefOr[String] = js.undefined
    
    /**
      * The Hosted Zone id of the desired Hosted Zone.
      */
    val zoneId: js.UndefOr[String] = js.undefined
  }
  object GetZoneArgs {
    
    inline def apply(): GetZoneArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetZoneArgs]
    }
    
    extension [Self <: GetZoneArgs](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPrivateZone(value: Boolean): Self = StObject.set(x, "privateZone", value.asInstanceOf[js.Any])
      
      inline def setPrivateZoneUndefined: Self = StObject.set(x, "privateZone", js.undefined)
      
      inline def setResourceRecordSetCount(value: Double): Self = StObject.set(x, "resourceRecordSetCount", value.asInstanceOf[js.Any])
      
      inline def setResourceRecordSetCountUndefined: Self = StObject.set(x, "resourceRecordSetCount", js.undefined)
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
      
      inline def setZoneId(value: String): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
      
      inline def setZoneIdUndefined: Self = StObject.set(x, "zoneId", js.undefined)
    }
  }
  
  trait GetZoneResult extends StObject {
    
    /**
      * Caller Reference of the Hosted Zone.
      */
    val callerReference: String
    
    /**
      * The comment field of the Hosted Zone.
      */
    val comment: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The description provided by the service that created the Hosted Zone (e.g. `arn:aws:servicediscovery:us-east-1:1234567890:namespace/ns-xxxxxxxxxxxxxxxx`).
      */
    val linkedServiceDescription: String
    
    /**
      * The service that created the Hosted Zone (e.g. `servicediscovery.amazonaws.com`).
      */
    val linkedServicePrincipal: String
    
    val name: String
    
    /**
      * The list of DNS name servers for the Hosted Zone.
      */
    val nameServers: js.Array[String]
    
    val privateZone: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The number of Record Set in the Hosted Zone.
      */
    val resourceRecordSetCount: Double
    
    val tags: StringDictionary[String]
    
    val vpcId: String
    
    val zoneId: String
  }
  object GetZoneResult {
    
    inline def apply(
      callerReference: String,
      comment: String,
      id: String,
      linkedServiceDescription: String,
      linkedServicePrincipal: String,
      name: String,
      nameServers: js.Array[String],
      resourceRecordSetCount: Double,
      tags: StringDictionary[String],
      vpcId: String,
      zoneId: String
    ): GetZoneResult = {
      val __obj = js.Dynamic.literal(callerReference = callerReference.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], linkedServiceDescription = linkedServiceDescription.asInstanceOf[js.Any], linkedServicePrincipal = linkedServicePrincipal.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameServers = nameServers.asInstanceOf[js.Any], resourceRecordSetCount = resourceRecordSetCount.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetZoneResult]
    }
    
    extension [Self <: GetZoneResult](x: Self) {
      
      inline def setCallerReference(value: String): Self = StObject.set(x, "callerReference", value.asInstanceOf[js.Any])
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLinkedServiceDescription(value: String): Self = StObject.set(x, "linkedServiceDescription", value.asInstanceOf[js.Any])
      
      inline def setLinkedServicePrincipal(value: String): Self = StObject.set(x, "linkedServicePrincipal", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameServers(value: js.Array[String]): Self = StObject.set(x, "nameServers", value.asInstanceOf[js.Any])
      
      inline def setNameServersVarargs(value: String*): Self = StObject.set(x, "nameServers", js.Array(value :_*))
      
      inline def setPrivateZone(value: Boolean): Self = StObject.set(x, "privateZone", value.asInstanceOf[js.Any])
      
      inline def setPrivateZoneUndefined: Self = StObject.set(x, "privateZone", js.undefined)
      
      inline def setResourceRecordSetCount(value: Double): Self = StObject.set(x, "resourceRecordSetCount", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      inline def setZoneId(value: String): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
    }
  }
}
