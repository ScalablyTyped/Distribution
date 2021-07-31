package typings.pulumiAws.awsMixinsMod.pulumiAwsAugmentingMod.sdk

import typings.awsSdk.pollyMod.ClientConfiguration
import typings.awsSdk.presignerMod.Presigner.PresignerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "sdk.Polly")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
class Polly ()
  extends typings.awsSdk.mod.Polly {
  def this(options: ClientConfiguration) = this()
}
object Polly {
  
  @JSImport("@pulumi/aws", "sdk.Polly.Presigner")
  @js.native
  /**
    * Creates a presigner object with a set of configuration options.
    */
  class Presigner ()
    extends typings.awsSdk.mod.Polly.Presigner {
    def this(options: PresignerOptions) = this()
  }
}
