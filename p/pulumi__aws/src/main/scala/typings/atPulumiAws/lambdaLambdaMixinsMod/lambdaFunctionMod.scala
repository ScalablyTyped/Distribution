package typings.atPulumiAws.lambdaLambdaMixinsMod

import typings.atPulumiAws.iamMod.Role
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("@pulumi/aws/lambda/function", JSImport.Namespace)
@js.native
object lambdaFunctionMod extends js.Object {
  @js.native
  trait Function extends js.Object {
    /**
      * Actual Role instance value for this Function.  Will only be set if this function was
      * created from [createFunction]
      */
    var roleInstance: js.UndefOr[Role] = js.native
  }
  
}

