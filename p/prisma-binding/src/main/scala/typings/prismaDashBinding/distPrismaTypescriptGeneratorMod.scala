package typings.prismaDashBinding

import typings.graphqlDashBinding.graphqlDashBindingMod.TypescriptGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prisma-binding/dist/PrismaTypescriptGenerator", JSImport.Namespace)
@js.native
object distPrismaTypescriptGeneratorMod extends js.Object {
  @js.native
  class PrismaTypescriptGenerator protected () extends TypescriptGenerator {
    def this(options: js.Any) = this()
    def renderExists(): String = js.native
    def renderTypedefs(): String = js.native
  }
  
}

