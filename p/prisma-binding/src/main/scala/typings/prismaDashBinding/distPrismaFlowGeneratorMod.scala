package typings.prismaDashBinding

import typings.graphqlDashBinding.graphqlDashBindingMod.FlowGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prisma-binding/dist/PrismaFlowGenerator", JSImport.Namespace)
@js.native
object distPrismaFlowGeneratorMod extends js.Object {
  @js.native
  class PrismaFlowGenerator protected () extends FlowGenerator {
    def this(options: js.Any) = this()
    def renderExists(): String = js.native
    def renderTypedefs(): String = js.native
  }
  
}

