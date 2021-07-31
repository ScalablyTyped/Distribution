package typings.pulumiAws

import typings.pulumiAws.inputMod.ebs.GetSnapshotIdsFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSnapshotIdsMod {
  
  @JSImport("@pulumi/aws/ebs/getSnapshotIds", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getSnapshotIds(): js.Promise[GetSnapshotIdsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSnapshotIds")().asInstanceOf[js.Promise[GetSnapshotIdsResult]]
  @scala.inline
  def getSnapshotIds(args: Unit, opts: InvokeOptions): js.Promise[GetSnapshotIdsResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSnapshotIds")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSnapshotIdsResult]]
  @scala.inline
  def getSnapshotIds(args: GetSnapshotIdsArgs): js.Promise[GetSnapshotIdsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSnapshotIds")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetSnapshotIdsResult]]
  @scala.inline
  def getSnapshotIds(args: GetSnapshotIdsArgs, opts: InvokeOptions): js.Promise[GetSnapshotIdsResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSnapshotIds")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSnapshotIdsResult]]
  
  trait GetSnapshotIdsArgs extends StObject {
    
    /**
      * One or more name/value pairs to filter off of. There are
      * several valid keys, for a full reference, check out
      * [describe-volumes in the AWS CLI reference][1].
      */
    val filters: js.UndefOr[js.Array[GetSnapshotIdsFilter]] = js.undefined
    
    /**
      * Returns the snapshots owned by the specified owner id. Multiple owners can be specified.
      */
    val owners: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * One or more AWS accounts IDs that can create volumes from the snapshot.
      */
    val restorableByUserIds: js.UndefOr[js.Array[String]] = js.undefined
  }
  object GetSnapshotIdsArgs {
    
    @scala.inline
    def apply(): GetSnapshotIdsArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetSnapshotIdsArgs]
    }
    
    @scala.inline
    implicit class GetSnapshotIdsArgsMutableBuilder[Self <: GetSnapshotIdsArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetSnapshotIdsFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetSnapshotIdsFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setOwners(value: js.Array[String]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnersUndefined: Self = StObject.set(x, "owners", js.undefined)
      
      @scala.inline
      def setOwnersVarargs(value: String*): Self = StObject.set(x, "owners", js.Array(value :_*))
      
      @scala.inline
      def setRestorableByUserIds(value: js.Array[String]): Self = StObject.set(x, "restorableByUserIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestorableByUserIdsUndefined: Self = StObject.set(x, "restorableByUserIds", js.undefined)
      
      @scala.inline
      def setRestorableByUserIdsVarargs(value: String*): Self = StObject.set(x, "restorableByUserIds", js.Array(value :_*))
    }
  }
  
  trait GetSnapshotIdsResult extends StObject {
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ebs.GetSnapshotIdsFilter]] = js.undefined
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * Set of EBS snapshot IDs, sorted by creation time in descending order.
      */
    val ids: js.Array[String]
    
    val owners: js.UndefOr[js.Array[String]] = js.undefined
    
    val restorableByUserIds: js.UndefOr[js.Array[String]] = js.undefined
  }
  object GetSnapshotIdsResult {
    
    @scala.inline
    def apply(id: String, ids: js.Array[String]): GetSnapshotIdsResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSnapshotIdsResult]
    }
    
    @scala.inline
    implicit class GetSnapshotIdsResultMutableBuilder[Self <: GetSnapshotIdsResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ebs.GetSnapshotIdsFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ebs.GetSnapshotIdsFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      @scala.inline
      def setOwners(value: js.Array[String]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnersUndefined: Self = StObject.set(x, "owners", js.undefined)
      
      @scala.inline
      def setOwnersVarargs(value: String*): Self = StObject.set(x, "owners", js.Array(value :_*))
      
      @scala.inline
      def setRestorableByUserIds(value: js.Array[String]): Self = StObject.set(x, "restorableByUserIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestorableByUserIdsUndefined: Self = StObject.set(x, "restorableByUserIds", js.undefined)
      
      @scala.inline
      def setRestorableByUserIdsVarargs(value: String*): Self = StObject.set(x, "restorableByUserIds", js.Array(value :_*))
    }
  }
}
