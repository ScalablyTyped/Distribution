package typings.prismaDashBinding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
  import typings.std.AsyncIterator

  type Exists = StringDictionary[js.Function1[/* filter */ Filter, js.Promise[Boolean]]]
  type Filter = StringDictionary[js.Any]
  type QueryMap = StringDictionary[
    js.Function2[
      /* args */ js.UndefOr[StringDictionary[js.Any]], 
      /* info */ js.UndefOr[GraphQLResolveInfo | String], 
      js.Promise[js.Any]
    ]
  ]
  type SubscriptionMap = StringDictionary[
    js.Function2[
      /* args */ js.UndefOr[js.Any], 
      /* info */ js.UndefOr[GraphQLResolveInfo | String], 
      (AsyncIterator[js.Any, js.Any, js.UndefOr[scala.Nothing]]) | (js.Promise[AsyncIterator[js.Any, js.Any, js.UndefOr[scala.Nothing]]])
    ]
  ]
}
