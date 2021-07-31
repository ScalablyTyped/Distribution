package typings.pulumiPulumi

import typings.pulumiPulumi.anon.Init
import typings.pulumiPulumi.outputMod.Inputs
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.ComponentResource
import typings.pulumiPulumi.resourceMod.ResourceTransformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackMod {
  
  @JSImport("@pulumi/pulumi/runtime/stack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStackResource(): js.UndefOr[Stack] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStackResource")().asInstanceOf[js.UndefOr[Stack]]
  
  @scala.inline
  def registerStackTransformation(t: ResourceTransformation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerStackTransformation")(t.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@pulumi/pulumi/runtime/stack", "rootPulumiStackTypeName")
  @js.native
  val rootPulumiStackTypeName: /* "pulumi:pulumi:Stack" */ String = js.native
  
  @scala.inline
  def runInPulumiStack(init: js.Function0[js.Promise[js.Any]]): js.Promise[js.UndefOr[Inputs]] = ^.asInstanceOf[js.Dynamic].applyDynamic("runInPulumiStack")(init.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Inputs]]]
  
  /**
    * Stack is the root resource for a Pulumi stack. Before invoking the `init` callback, it registers itself as the root
    * resource with the Pulumi engine.
    */
  @js.native
  trait Stack extends ComponentResource[Inputs] {
    
    /**
      * runInit invokes the given init callback with this resource set as the root resource. The return value of init is
      * used as the stack's output properties.
      *
      * @param init The callback to run in the context of this Pulumi stack
      */
    def initialize(args: Init): js.Promise[Inputs] = js.native
    
    /**
      * The outputs of this stack, if the `init` callback exited normally.
      */
    val outputs: Output_[Inputs] = js.native
  }
}
