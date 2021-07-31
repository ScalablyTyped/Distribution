package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLedgerMod {
  
  @JSImport("@pulumi/aws/qldb/getLedger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getLedger(args: GetLedgerArgs): js.Promise[GetLedgerResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLedger")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetLedgerResult]]
  @scala.inline
  def getLedger(args: GetLedgerArgs, opts: InvokeOptions): js.Promise[GetLedgerResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLedger")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetLedgerResult]]
  
  trait GetLedgerArgs extends StObject {
    
    /**
      * The friendly name of the ledger to match.
      */
    val name: String
  }
  object GetLedgerArgs {
    
    @scala.inline
    def apply(name: String): GetLedgerArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLedgerArgs]
    }
    
    @scala.inline
    implicit class GetLedgerArgsMutableBuilder[Self <: GetLedgerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetLedgerResult extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the ledger.
      */
    val arn: String
    
    /**
      * Deletion protection on the QLDB Ledger instance. Set to `true` by default.
      */
    val deletionProtection: Boolean
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val name: String
  }
  object GetLedgerResult {
    
    @scala.inline
    def apply(arn: String, deletionProtection: Boolean, id: String, name: String): GetLedgerResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], deletionProtection = deletionProtection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLedgerResult]
    }
    
    @scala.inline
    implicit class GetLedgerResultMutableBuilder[Self <: GetLedgerResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletionProtection(value: Boolean): Self = StObject.set(x, "deletionProtection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
