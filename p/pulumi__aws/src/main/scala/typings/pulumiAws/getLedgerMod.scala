package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLedgerMod {
  
  @JSImport("@pulumi/aws/qldb/getLedger", "getLedger")
  @js.native
  def getLedger(args: GetLedgerArgs): js.Promise[GetLedgerResult] = js.native
  @JSImport("@pulumi/aws/qldb/getLedger", "getLedger")
  @js.native
  def getLedger(args: GetLedgerArgs, opts: InvokeOptions): js.Promise[GetLedgerResult] = js.native
  
  @js.native
  trait GetLedgerArgs extends StObject {
    
    /**
      * The friendly name of the ledger to match.
      */
    val name: String = js.native
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
  
  @js.native
  trait GetLedgerResult extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the ledger.
      */
    val arn: String = js.native
    
    /**
      * Deletion protection on the QLDB Ledger instance. Set to `true` by default.
      */
    val deletionProtection: Boolean = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val name: String = js.native
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
