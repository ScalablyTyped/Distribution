package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getEventCategoriesMod {
  
  @JSImport("@pulumi/aws/rds/getEventCategories", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getEventCategories(): js.Promise[GetEventCategoriesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventCategories")().asInstanceOf[js.Promise[GetEventCategoriesResult]]
  @scala.inline
  def getEventCategories(args: Unit, opts: InvokeOptions): js.Promise[GetEventCategoriesResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventCategories")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetEventCategoriesResult]]
  @scala.inline
  def getEventCategories(args: GetEventCategoriesArgs): js.Promise[GetEventCategoriesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventCategories")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetEventCategoriesResult]]
  @scala.inline
  def getEventCategories(args: GetEventCategoriesArgs, opts: InvokeOptions): js.Promise[GetEventCategoriesResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventCategories")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetEventCategoriesResult]]
  
  trait GetEventCategoriesArgs extends StObject {
    
    /**
      * The type of source that will be generating the events. Valid options are db-instance, db-security-group, db-parameter-group, db-snapshot, db-cluster or db-cluster-snapshot.
      */
    val sourceType: js.UndefOr[String] = js.undefined
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
  
  trait GetEventCategoriesResult extends StObject {
    
    /**
      * A list of the event categories.
      */
    val eventCategories: js.Array[String]
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val sourceType: js.UndefOr[String] = js.undefined
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
