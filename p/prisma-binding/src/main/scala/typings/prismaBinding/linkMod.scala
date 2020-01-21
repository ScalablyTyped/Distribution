package typings.prismaBinding

import typings.apolloLink.mod.ApolloLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prisma-binding/dist/link", JSImport.Namespace)
@js.native
object linkMod extends js.Object {
  def makePrismaLink(hasEndpointTokenDebug: AnonDebug): ApolloLink = js.native
}

