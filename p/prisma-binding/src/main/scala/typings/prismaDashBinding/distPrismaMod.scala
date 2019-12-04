package typings.prismaDashBinding

import typings.graphqlDashBinding.graphqlDashBindingMod.Binding
import typings.prismaDashBinding.distTypesMod.Exists
import typings.prismaDashBinding.distTypesMod.PrismaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prisma-binding/dist/Prisma", JSImport.Namespace)
@js.native
object distPrismaMod extends js.Object {
  @js.native
  class Prisma protected () extends Binding {
    def this(hasTypeDefsEndpointSecretFragmentReplacementsDebugDisableCache: PrismaOptions) = this()
    var buildExists: js.Any = js.native
    var exists: Exists = js.native
  }
  
}

