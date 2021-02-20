package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getEventCategoriesMod {
  
  @JSImport("@pulumi/aws/rds/getEventCategories", "getEventCategories")
  @js.native
  def getEventCategories(): js.Promise[GetEventCategoriesResult] = js.native
  @JSImport("@pulumi/aws/rds/getEventCategories", "getEventCategories")
  @js.native
  def getEventCategories(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetEventCategoriesResult] = js.native
  @JSImport("@pulumi/aws/rds/getEventCategories", "getEventCategories")
  @js.native
  def getEventCategories(args: GetEventCategoriesArgs): js.Promise[GetEventCategoriesResult] = js.native
  @JSImport("@pulumi/aws/rds/getEventCategories", "getEventCategories")
  @js.native
  def getEventCategories(args: GetEventCategoriesArgs, opts: InvokeOptions): js.Promise[GetEventCategoriesResult] = js.native
  
  @js.native
  trait GetEventCategoriesArgs extends StObject {
    
    /**
      * The type of source that will be generating the events. Valid options are db-instance, db-security-group, db-parameter-group, db-snapshot, db-cluster or db-cluster-snapshot.
      */
    val sourceType: js.UndefOr[String] = js.native
  }
  object GetEventCategoriesArgs {
    
    @scala.inline
    def apply(): GetEventCategoriesArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetEventCategoriesArgs]
    }
    
    @scala.inline
    implicit class GetEventCategoriesArgsMutableBuilder[Self <: GetEventCategoriesArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSourceType(value: String): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    }
  }
  
  @js.native
  trait GetEventCategoriesResult extends StObject {
    
    /**
      * A list of the event categories.
      */
    val eventCategories: js.Array[String] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val sourceType: js.UndefOr[String] = js.native
  }
  object GetEventCategoriesResult {
    
    @scala.inline
    def apply(eventCategories: js.Array[String], id: String): GetEventCategoriesResult = {
      val __obj = js.Dynamic.literal(eventCategories = eventCategories.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetEventCategoriesResult]
    }
    
    @scala.inline
    implicit class GetEventCategoriesResultMutableBuilder[Self <: GetEventCategoriesResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventCategories(value: js.Array[String]): Self = StObject.set(x, "eventCategories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventCategoriesVarargs(value: String*): Self = StObject.set(x, "eventCategories", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceType(value: String): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    }
  }
}
