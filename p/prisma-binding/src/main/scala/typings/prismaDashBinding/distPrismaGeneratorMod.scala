package typings.prismaDashBinding

import typings.graphqlDashBinding.graphqlDashBindingMod.Generator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prisma-binding/dist/PrismaGenerator", JSImport.Namespace)
@js.native
object distPrismaGeneratorMod extends js.Object {
  @js.native
  class PrismaGenerator protected () extends Generator {
    def this(options: js.Any) = this()
    def renderTypedefs(): String = js.native
  }
  
}

