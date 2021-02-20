package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getZoneMod {
  
  @JSImport("@pulumi/aws/route53/getZone", "getZone")
  @js.native
  def getZone(): js.Promise[GetZoneResult] = js.native
  @JSImport("@pulumi/aws/route53/getZone", "getZone")
  @js.native
  def getZone(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetZoneResult] = js.native
  @JSImport("@pulumi/aws/route53/getZone", "getZone")
  @js.native
  def getZone(args: GetZoneArgs): js.Promise[GetZoneResult] = js.native
  @JSImport("@pulumi/aws/route53/getZone", "getZone")
  @js.native
  def getZone(args: GetZoneArgs, opts: InvokeOptions): js.Promise[GetZoneResult] = js.native
  
  @js.native
  trait GetZoneArgs extends StObject {
    
    /**
      * The Hosted Zone name of the desired Hosted Zone.
      */
    val name: js.UndefOr[String] = js.native
    
    /**
      * Used with `name` field to get a private Hosted Zone.
      */
    val privateZone: js.UndefOr[Boolean] = js.native
    
    /**
      * The number of Record Set in the Hosted Zone.
      */
    val resourceRecordSetCount: js.UndefOr[Double] = js.native
    
    /**
      * Used with `name` field. A map of tags, each pair of which must exactly match a pair on the desired Hosted Zone.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * Used with `name` field to get a private Hosted Zone associated with the vpcId (in this case, privateZone is not mandatory).
      */
    val vpcId: js.UndefOr[String] = js.native
    
    /**
      * The Hosted Zone id of the desired Hosted Zone.
      */
    val zoneId: js.UndefOr[String] = js.native
  }
  object GetZoneArgs {
    
    @scala.inline
    def apply(): GetZoneArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetZoneArgs]
    }
    
    @scala.inline
    implicit class GetZoneArgsMutableBuilder[Self <: GetZoneArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPrivateZone(value: Boolean): Self = StObject.set(x, "privateZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateZoneUndefined: Self = StObject.set(x, "privateZone", js.undefined)
      
      @scala.inline
      def setResourceRecordSetCount(value: Double): Self = StObject.set(x, "resourceRecordSetCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceRecordSetCountUndefined: Self = StObject.set(x, "resourceRecordSetCount", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
      
      @scala.inline
      def setZoneId(value: String): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoneIdUndefined: Self = StObject.set(x, "zoneId", js.undefined)
    }
  }
  
  @js.native
  trait GetZoneResult extends StObject {
    
    /**
      * Caller Reference of the Hosted Zone.
      */
    val callerReference: String = js.native
    
    /**
      * The comment field of the Hosted Zone.
      */
    val comment: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The description provided by the service that created the Hosted Zone (e.g. `arn:aws:servicediscovery:us-east-1:1234567890:namespace/ns-xxxxxxxxxxxxxxxx`).
      */
    val linkedServiceDescription: String = js.native
    
    /**
      * The service that created the Hosted Zone (e.g. `servicediscovery.amazonaws.com`).
      */
    val linkedServicePrincipal: String = js.native
    
    val name: String = js.native
    
    /**
      * The list of DNS name servers for the Hosted Zone.
      */
    val nameServers: js.Array[String] = js.native
    
    val privateZone: js.UndefOr[Boolean] = js.native
    
    /**
      * The number of Record Set in the Hosted Zone.
      */
    val resourceRecordSetCount: Double = js.native
    
    val tags: StringDictionary[String] = js.native
    
    val vpcId: String = js.native
    
    val zoneId: String = js.native
  }
  object GetZoneResult {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class GetZoneResultMutableBuilder[Self <: GetZoneResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallerReference(value: String): Self = StObject.set(x, "callerReference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkedServiceDescription(value: String): Self = StObject.set(x, "linkedServiceDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkedServicePrincipal(value: String): Self = StObject.set(x, "linkedServicePrincipal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameServers(value: js.Array[String]): Self = StObject.set(x, "nameServers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameServersVarargs(value: String*): Self = StObject.set(x, "nameServers", js.Array(value :_*))
      
      @scala.inline
      def setPrivateZone(value: Boolean): Self = StObject.set(x, "privateZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateZoneUndefined: Self = StObject.set(x, "privateZone", js.undefined)
      
      @scala.inline
      def setResourceRecordSetCount(value: Double): Self = StObject.set(x, "resourceRecordSetCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoneId(value: String): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
    }
  }
}
