package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOutpostsMod {
  
  @JSImport("@pulumi/aws/outposts/getOutposts", "getOutposts")
  @js.native
  def getOutposts(): js.Promise[GetOutpostsResult] = js.native
  @JSImport("@pulumi/aws/outposts/getOutposts", "getOutposts")
  @js.native
  def getOutposts(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetOutpostsResult] = js.native
  @JSImport("@pulumi/aws/outposts/getOutposts", "getOutposts")
  @js.native
  def getOutposts(args: GetOutpostsArgs): js.Promise[GetOutpostsResult] = js.native
  @JSImport("@pulumi/aws/outposts/getOutposts", "getOutposts")
  @js.native
  def getOutposts(args: GetOutpostsArgs, opts: InvokeOptions): js.Promise[GetOutpostsResult] = js.native
  
  @js.native
  trait GetOutpostsArgs extends StObject {
    
    /**
      * Availability Zone name.
      */
    val availabilityZone: js.UndefOr[String] = js.native
    
    /**
      * Availability Zone identifier.
      */
    val availabilityZoneId: js.UndefOr[String] = js.native
    
    /**
      * Site identifier.
      */
    val siteId: js.UndefOr[String] = js.native
  }
  object GetOutpostsArgs {
    
    @scala.inline
    def apply(): GetOutpostsArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetOutpostsArgs]
    }
    
    @scala.inline
    implicit class GetOutpostsArgsMutableBuilder[Self <: GetOutpostsArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneId(value: String): Self = StObject.set(x, "availabilityZoneId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneIdUndefined: Self = StObject.set(x, "availabilityZoneId", js.undefined)
      
      @scala.inline
      def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      @scala.inline
      def setSiteId(value: String): Self = StObject.set(x, "siteId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiteIdUndefined: Self = StObject.set(x, "siteId", js.undefined)
    }
  }
  
  @js.native
  trait GetOutpostsResult extends StObject {
    
    /**
      * Set of Amazon Resource Names (ARNs).
      */
    val arns: js.Array[String] = js.native
    
    val availabilityZone: String = js.native
    
    val availabilityZoneId: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * Set of identifiers.
      */
    val ids: js.Array[String] = js.native
    
    val siteId: String = js.native
  }
  object GetOutpostsResult {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class GetOutpostsResultMutableBuilder[Self <: GetOutpostsResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArns(value: js.Array[String]): Self = StObject.set(x, "arns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnsVarargs(value: String*): Self = StObject.set(x, "arns", js.Array(value :_*))
      
      @scala.inline
      def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneId(value: String): Self = StObject.set(x, "availabilityZoneId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      @scala.inline
      def setSiteId(value: String): Self = StObject.set(x, "siteId", value.asInstanceOf[js.Any])
    }
  }
}
