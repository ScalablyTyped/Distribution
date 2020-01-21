package typings.prismaBinding

import typings.graphqlBinding.mod.Generator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prisma-binding/dist/PrismaGenerator", JSImport.Namespace)
@js.native
object prismaGeneratorMod extends js.Object {
  @js.native
  class PrismaGenerator protected () extends Generator {
    def this(options: js.Any) = this()
    def renderTypedefs(): String = js.native
  }
  
}

