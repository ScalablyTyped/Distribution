package typings
package sigmajsLib.SigmaJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Canvas extends js.Object {
  var edges: org.scalablytyped.runtime.StringDictionary[
    js.Function4[/* edge */ Edge, /* source */ Node, /* target */ Node, /* repeated */ js.Any, scala.Unit]
  ]
  var labels: org.scalablytyped.runtime.StringDictionary[js.Function2[/* node */ Node, /* repeated */ js.Any, scala.Unit]]
  var nodes: org.scalablytyped.runtime.StringDictionary[js.Function2[/* node */ Node, /* repeated */ js.Any, scala.Unit]]
}

object Canvas {
  @scala.inline
  def apply(
    edges: org.scalablytyped.runtime.StringDictionary[
      js.Function4[/* edge */ Edge, /* source */ Node, /* target */ Node, /* repeated */ js.Any, scala.Unit]
    ],
    labels: org.scalablytyped.runtime.StringDictionary[js.Function2[/* node */ Node, /* repeated */ js.Any, scala.Unit]],
    nodes: org.scalablytyped.runtime.StringDictionary[js.Function2[/* node */ Node, /* repeated */ js.Any, scala.Unit]]
  ): Canvas = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("edges")(edges)
    __obj.updateDynamic("labels")(labels)
    __obj.updateDynamic("nodes")(nodes)
    __obj.asInstanceOf[Canvas]
  }
}

