package typings.prismaBinding

import typings.apolloLink.mod.ApolloLink
import typings.prismaBinding.anon.Debug
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prisma-binding/dist/link", JSImport.Namespace)
@js.native
object linkMod extends js.Object {
  def makePrismaLink(hasEndpointTokenDebug: Debug): ApolloLink = js.native
}

