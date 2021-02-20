package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOutpostMod {
  
  @JSImport("@pulumi/aws/outposts/getOutpost", "getOutpost")
  @js.native
  def getOutpost(): js.Promise[GetOutpostResult] = js.native
  @JSImport("@pulumi/aws/outposts/getOutpost", "getOutpost")
  @js.native
  def getOutpost(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetOutpostResult] = js.native
  @JSImport("@pulumi/aws/outposts/getOutpost", "getOutpost")
  @js.native
  def getOutpost(args: GetOutpostArgs): js.Promise[GetOutpostResult] = js.native
  @JSImport("@pulumi/aws/outposts/getOutpost", "getOutpost")
  @js.native
  def getOutpost(args: GetOutpostArgs, opts: InvokeOptions): js.Promise[GetOutpostResult] = js.native
  
  @js.native
  trait GetOutpostArgs extends StObject {
    
    /**
      * Amazon Resource Name (ARN).
      */
    val arn: js.UndefOr[String] = js.native
    
    /**
      * Identifier of the Outpost.
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * Name of the Outpost.
      */
    val name: js.UndefOr[String] = js.native
  }
  object GetOutpostArgs {
    
    @scala.inline
    def apply(): GetOutpostArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetOutpostArgs]
    }
    
    @scala.inline
    implicit class GetOutpostArgsMutableBuilder[Self <: GetOutpostArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait GetOutpostResult extends StObject {
    
    val arn: String = js.native
    
    /**
      * Availability Zone name.
      */
    val availabilityZone: String = js.native
    
    /**
      * Availability Zone identifier.
      */
    val availabilityZoneId: String = js.native
    
    /**
      * Description.
      */
    val description: String = js.native
    
    val id: String = js.native
    
    val name: String = js.native
    
    /**
      * AWS Account identifier of the Outpost owner.
      */
    val ownerId: String = js.native
    
    /**
      * Site identifier.
      */
    val siteId: String = js.native
  }
  object GetOutpostResult {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class GetOutpostResultMutableBuilder[Self <: GetOutpostResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneId(value: String): Self = StObject.set(x, "availabilityZoneId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiteId(value: String): Self = StObject.set(x, "siteId", value.asInstanceOf[js.Any])
    }
  }
}
