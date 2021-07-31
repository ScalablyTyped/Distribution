package typings.pulumiAws

import typings.pulumiAws.inputMod.GetAmiIdsFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAmiIdsMod {
  
  @JSImport("@pulumi/aws/getAmiIds", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getAmiIds(args: GetAmiIdsArgs): js.Promise[GetAmiIdsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAmiIds")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetAmiIdsResult]]
  @scala.inline
  def getAmiIds(args: GetAmiIdsArgs, opts: InvokeOptions): js.Promise[GetAmiIdsResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAmiIds")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetAmiIdsResult]]
  
  trait GetAmiIdsArgs extends StObject {
    
    /**
      * Limit search to users with *explicit* launch
      * permission on  the image. Valid items are the numeric account ID or `self`.
      */
    val executableUsers: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * One or more name/value pairs to filter off of. There
      * are several valid keys, for a full reference, check out
      * [describe-images in the AWS CLI reference][1].
      */
    val filters: js.UndefOr[js.Array[GetAmiIdsFilter]] = js.undefined
    
    /**
      * A regex string to apply to the AMI list returned
      * by AWS. This allows more advanced filtering not supported from the AWS API.
      * This filtering is done locally on what AWS returns, and could have a performance
      * impact if the result is large. It is recommended to combine this with other
      * options to narrow down the list AWS returns.
      */
    val nameRegex: js.UndefOr[String] = js.undefined
    
    /**
      * List of AMI owners to limit search. At least 1 value must be specified. Valid values: an AWS account ID, `self` (the current account), or an AWS owner alias (e.g. `amazon`, `aws-marketplace`, `microsoft`).
      */
    val owners: js.Array[String]
    
    /**
      * Used to sort AMIs by creation time.
      */
    val sortAscending: js.UndefOr[Boolean] = js.undefined
  }
  object GetAmiIdsArgs {
    
    @scala.inline
    def apply(owners: js.Array[String]): GetAmiIdsArgs = {
      val __obj = js.Dynamic.literal(owners = owners.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAmiIdsArgs]
    }
    
    @scala.inline
    implicit class GetAmiIdsArgsMutableBuilder[Self <: GetAmiIdsArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecutableUsers(value: js.Array[String]): Self = StObject.set(x, "executableUsers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutableUsersUndefined: Self = StObject.set(x, "executableUsers", js.undefined)
      
      @scala.inline
      def setExecutableUsersVarargs(value: String*): Self = StObject.set(x, "executableUsers", js.Array(value :_*))
      
      @scala.inline
      def setFilters(value: js.Array[GetAmiIdsFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetAmiIdsFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setNameRegex(value: String): Self = StObject.set(x, "nameRegex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameRegexUndefined: Self = StObject.set(x, "nameRegex", js.undefined)
      
      @scala.inline
      def setOwners(value: js.Array[String]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnersVarargs(value: String*): Self = StObject.set(x, "owners", js.Array(value :_*))
      
      @scala.inline
      def setSortAscending(value: Boolean): Self = StObject.set(x, "sortAscending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortAscendingUndefined: Self = StObject.set(x, "sortAscending", js.undefined)
    }
  }
  
  trait GetAmiIdsResult extends StObject {
    
    val executableUsers: js.UndefOr[js.Array[String]] = js.undefined
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.GetAmiIdsFilter]] = js.undefined
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val ids: js.Array[String]
    
    val nameRegex: js.UndefOr[String] = js.undefined
    
    val owners: js.Array[String]
    
    val sortAscending: js.UndefOr[Boolean] = js.undefined
  }
  object GetAmiIdsResult {
    
    @scala.inline
    def apply(id: String, ids: js.Array[String], owners: js.Array[String]): GetAmiIdsResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], owners = owners.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAmiIdsResult]
    }
    
    @scala.inline
    implicit class GetAmiIdsResultMutableBuilder[Self <: GetAmiIdsResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecutableUsers(value: js.Array[String]): Self = StObject.set(x, "executableUsers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutableUsersUndefined: Self = StObject.set(x, "executableUsers", js.undefined)
      
      @scala.inline
      def setExecutableUsersVarargs(value: String*): Self = StObject.set(x, "executableUsers", js.Array(value :_*))
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.GetAmiIdsFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.GetAmiIdsFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      @scala.inline
      def setNameRegex(value: String): Self = StObject.set(x, "nameRegex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameRegexUndefined: Self = StObject.set(x, "nameRegex", js.undefined)
      
      @scala.inline
      def setOwners(value: js.Array[String]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnersVarargs(value: String*): Self = StObject.set(x, "owners", js.Array(value :_*))
      
      @scala.inline
      def setSortAscending(value: Boolean): Self = StObject.set(x, "sortAscending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortAscendingUndefined: Self = StObject.set(x, "sortAscending", js.undefined)
    }
  }
}
