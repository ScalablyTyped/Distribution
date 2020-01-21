package typings.prismaBinding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Exists = org.scalablytyped.runtime.StringDictionary[
    js.Function1[/* filter */ typings.prismaBinding.typesMod.Filter, js.Promise[scala.Boolean]]
  ]
  type Filter = org.scalablytyped.runtime.StringDictionary[js.Any]
  type QueryMap = org.scalablytyped.runtime.StringDictionary[
    js.Function2[
      /* args */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]], 
      /* info */ js.UndefOr[typings.graphql.definitionMod.GraphQLResolveInfo | java.lang.String], 
      js.Promise[js.Any]
    ]
  ]
  type SubscriptionMap = org.scalablytyped.runtime.StringDictionary[
    js.Function2[
      /* args */ js.UndefOr[js.Any], 
      /* info */ js.UndefOr[typings.graphql.definitionMod.GraphQLResolveInfo | java.lang.String], 
      (typings.std.AsyncIterator[js.Any, js.Any, js.UndefOr[scala.Nothing]]) | (js.Promise[typings.std.AsyncIterator[js.Any, js.Any, js.UndefOr[scala.Nothing]]])
    ]
  ]
}
