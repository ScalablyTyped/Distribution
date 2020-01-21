package typings.prismaBinding

import typings.graphqlBinding.mod.TypescriptGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prisma-binding/dist/PrismaTypescriptGenerator", JSImport.Namespace)
@js.native
object prismaTypescriptGeneratorMod extends js.Object {
  @js.native
  class PrismaTypescriptGenerator protected () extends TypescriptGenerator {
    def this(options: js.Any) = this()
    def renderExists(): String = js.native
    def renderTypedefs(): String = js.native
  }
  
}

