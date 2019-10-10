package typings.atPulumiPulumi

import typings.atPulumiPulumi.atPulumiPulumiStrings.`pulumi:pulumi:Stack`
import typings.atPulumiPulumi.outputMod.Inputs
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.ComponentResource
import typings.atPulumiPulumi.resourceMod.ResourceTransformation
import typings.atPulumiPulumi.runtimeStackMod.Stack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/runtime/stack", JSImport.Namespace)
@js.native
object runtimeStackMod extends js.Object {
  /**
    * Stack is the root resource for a Pulumi stack. Before invoking the `init` callback, it registers itself as the root
    * resource with the Pulumi engine.
    */
  @js.native
  trait Stack extends ComponentResource {
    /**
      * The outputs of this stack, if the `init` callback exited normally.
      */
    val outputs: Output[js.UndefOr[Inputs]] = js.native
    /**
      * runInit invokes the given init callback with this resource set as the root resource. The return value of init is
      * used as the stack's output properties.
      *
      * @param init The callback to run in the context of this Pulumi stack
      */
    var runInit: js.Any = js.native
  }
  
  val rootPulumiStackTypeName: `pulumi:pulumi:Stack` = js.native
  def getStackResource(): js.UndefOr[Stack] = js.native
  def registerStackTransformation(t: ResourceTransformation): Unit = js.native
  def runInPulumiStack(init: js.Function0[_]): js.Promise[js.UndefOr[Inputs]] = js.native
}

