package typings.prismaBinding

import typings.apolloLink.mod.ApolloLink
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphqlBinding.distTypesMod.FragmentReplacement
import typings.graphqlTools.interfacesMod.IResolvers
import typings.prismaBinding.typesMod.PrismaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prisma-binding", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Prisma protected ()
    extends typings.prismaBinding.prismaMod.Prisma {
    def this(hasTypeDefsEndpointSecretFragmentReplacementsDebugDisableCache: PrismaOptions) = this()
  }
  
  def extractFragmentReplacements(resolvers: IResolvers[_, _]): js.Array[FragmentReplacement] = js.native
  def forwardTo(bindingName: String): js.Function4[
    /* parent */ js.Any, 
    /* args */ js.Any, 
    /* context */ js.Any, 
    /* info */ GraphQLResolveInfo, 
    _
  ] = js.native
  def makePrismaBindingClass[T](hasTypeDefs: AnonTypeDefs): T = js.native
  def makePrismaLink(hasEndpointTokenDebug: AnonDebug): ApolloLink = js.native
}

